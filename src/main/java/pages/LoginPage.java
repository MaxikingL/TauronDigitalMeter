package pages;

import base.BasePage;

import java.io.IOException;

public class LoginPage extends BasePage {




    public void test() throws IOException {

        driver = getDriver();
        driver.get(getUrl());
    }


}
