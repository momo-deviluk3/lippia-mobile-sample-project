package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ChangePasswordViewConstants;
import com.crowdar.examples.constants.HomeConstants;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

public class ChangePasswordService {
    public static void isViewLoaded() {
        MobileActionManager.waitVisibility(ChangePasswordViewConstants.TITLE_CHANGE_PASSWORD_VIEW_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(ChangePasswordViewConstants.TITLE_CHANGE_PASSWORD_VIEW_LOCATOR), HomeConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void changePassword(String newPass) {
        MobileActionManager.setInput(ChangePasswordViewConstants.NEW_PASS_INPUT_LOCATOR, newPass);
        MobileActionManager.setInput(ChangePasswordViewConstants.REPEAT_NEW_PASS_INPUT_LOCATOR, newPass);
        MobileActionManager.click(ChangePasswordViewConstants.SAVE_NEW_PASS_BUTTON_LOCATOR);
    }

    public static void verifyPass(){
        MobileActionManager.waitVisibility(ChangePasswordViewConstants.MESSAGE_SUCCESS_CHANGE_LOCATOR);
        Assert.assertEquals(MobileActionManager.getText(ChangePasswordViewConstants.MESSAGE_SUCCESS_CHANGE_LOCATOR),"Cambio de contraseña exitoso!");
        MobileActionManager.click(ChangePasswordViewConstants.MESSAGE_SUCCESS_CHANGE_BUTTON_LOCATOR);
    }
}
