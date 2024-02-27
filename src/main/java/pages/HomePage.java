package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;



public class HomePage extends BasePage {

    public WebDriver driver;

    By testStoreLink = By.linkText("Zaloguj");


    public HomePage() throws IOException {
    }




}
