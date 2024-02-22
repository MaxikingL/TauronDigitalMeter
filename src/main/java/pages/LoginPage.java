package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;


public class LoginPage extends BasePage {

    By  loginButton = By.cssSelector("#loginForm > div.mt-3 > button");


    public WebDriver driver;

   public LoginPage() throws IOException {
       super();
   }


   public WebElement clickLoginButton() throws IOException {



       this.driver = getDriver();
       return driver.findElement(loginButton);


   }





}
