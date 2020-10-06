package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.ChangePasswordService;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FichapLoginSteps extends PageSteps {
    @Given("el usuario abre la aplicacion y esta cargada correctamente")
    public void elUsuarioAbreLaAplicacionYEstaCargadaCorrectamente() {
        LoginService.isViewLoaded();
    }

    @When("el usuario ingresa su (.*) y (.*) y hace click en 'Iniciar Sesion'")
    public void elUsuarioHaceClickSobreEmailEIngresaSuEmail(String email,String pass) {
        LoginService.doLogin(email,pass);
    }

    @And("el usuario se toma una foto")
    public void elUsuarioSeTomaUnaFoto() {
        LoginService.takeAPhoto();
    }

    @Then("el usuario se encuentra en la pantalla para fichar")
    public void elUsuarioSeEncuentraEnLaPantallaParaFichar() {
        HomeService.isViewLoaded();
    }


}
