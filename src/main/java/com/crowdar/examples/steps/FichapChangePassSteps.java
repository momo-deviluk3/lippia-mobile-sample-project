package com.crowdar.examples.steps;

import com.crowdar.examples.services.ChangePasswordService;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FichapChangePassSteps {
    @Given("el usuario inicia la aplicacion y carga correctamente")
    public void elUsuarioIniciaLaAplicacionYCargaCorrectamente() {
        LoginService.isViewLoaded();
    }

    @When("ingresa su (.*) y (.*) y clickea en 'Iniciar Sesion'")
    public void ingresaSuEmailyPasswordyClickeaEnIniciarSesion(String email,String pass) {
        LoginService.doLogin(email,pass);
    }

    @And("se toma una foto")
    public void seTomaUnaFoto() {
        LoginService.takeAPhoto();
    }
    @And("el usuario se encuentra en la pantalla principal")
    public void elUsuarioSeEncuentraEnLaPantallaPrincipal() {
        HomeService.isViewLoaded();
    }

    @And("el usuario cambia a la pantalla de contrasenia")
    public void elUsuarioCambiaALaPantallaDeContrasenia() {
        HomeService.changePasswordView();
        ChangePasswordService.isViewLoaded();
    }

    @And("el usuario ingresa la nueva (.*) y lo confirma")
    public void elUsuarioIngresaLaNuevaPasswordYLoConfirma(String newPass) {
        ChangePasswordService.changePassword(newPass);
    }

    @Then("la contrasenia es cambiada exitosamente")
    public void laContraseniaEsCambiadaExitosamente() {
        ChangePasswordService.verifyPass();
    }
}
