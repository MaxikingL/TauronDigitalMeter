package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class WebDriverInstance {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();



    public static WebDriver getDriver(){
        if(driver.get()==null){
            try{
                driver.set(createDriver());
            }catch(IOException e){
                e.printStackTrace();
            }

        }
        return driver.get();
    }




    public static WebDriver createDriver() throws IOException {
        WebDriver driver = null;
        Properties prop = new Properties();
        FileInputStream data = new FileInputStream(
                System.getProperty("user.dir")+"\\src\\main\\java\\Resource\\config.properties");
        prop.load(data);

        if(prop.getProperty("browser").equals("chrome")){

            System.setProperty("webdriver.chrome.driver",
                    "C:\\Users\\maxim\\Projekty\\TauronDigitalMeter\\src\\main\\java\\driver\\chromedriver.exe");
            driver = new ChromeDriver();

        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



        return driver;
    }


}
