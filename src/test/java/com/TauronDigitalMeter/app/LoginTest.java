package com.TauronDigitalMeter.app;


import base.Hooks;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.io.IOException;

public class LoginTest extends Hooks {

    LoginPage loginPage = new LoginPage();

public LoginTest() throws IOException {
    super();
    }


    @Test
    public void loginTest() throws IOException {


       LoginPage loginPage = new LoginPage();

       loginPage.getEmailInput().sendKeys("bozenkalema@gmail.com");

       loginPage.getPassword().sendKeys("foto9Power");

        loginPage.clickLoginButton().click();



    }
}
