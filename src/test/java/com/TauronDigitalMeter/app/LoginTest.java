package com.TauronDigitalMeter.app;


import base.Hooks;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

import java.io.IOException;

import static base.BasePage.getDriver;

public class LoginTest extends Hooks {

    LoginPage loginPage = new LoginPage();

public LoginTest() throws IOException {
    super();
    }


    @Test
    public void loginTest() throws IOException {


        HomePage homePage = new HomePage();

        homePage.getTestStoreLink().click();



    }
}
