package base;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;
    private String url;


    public WebDriver getDriver() throws IOException {
        Properties prop = new Properties();
        FileInputStream data = new FileInputStream("C:\\Users\\maxim\\Projekty\\TauronDigitalMeter\\config.properties");
        prop.load(data);

        if (prop.getProperty("browser").equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\maxim\\Projekty\\TauronDigitalMeter\\src\\main\\java\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }

        public String getUrl () throws IOException {
            Properties prop = new Properties();
            FileInputStream data = new FileInputStream("C:\\Users\\maxim\\Projekty\\TauronDigitalMeter\\config.properties");
            prop.load(data);
            url = prop.getProperty("url");
            return url;
        }

        public static void takeSnapShot(WebDriver webDriver){
        File screFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);

        File desFile = new File ""


        }


}
