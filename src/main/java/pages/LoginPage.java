package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;


public class LoginPage extends BasePage {

    By  loginButton = By.cssSelector("#loginForm > div.mt-3 > button");
    By emailInput = By.cssSelector("#exampleInputEmail1");
    By passwordInput = By.cssSelector("#exampleInputPassword1");



    public WebDriver driver;

   public LoginPage() throws IOException {
       super();
   }


   public WebElement getEmailInput() throws IOException {
       this.driver = getDriver();
       return driver.findElement(emailInput);

   }

    public WebElement getPassword() throws IOException {
        this.driver = getDriver();
        return driver.findElement(passwordInput);

    }

    public WebElement clickLoginButton() throws IOException {

        this.driver = getDriver();
        return driver.findElement(loginButton);
    }





}
