package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;
    private String url;

    private Properties prop;


    public BasePage() throws IOException {
        prop = new Properties();
        FileInputStream data = new FileInputStream(
                System.getProperty("user.dir")+"\\src\\main\\java\\resource\\config.properties");
        prop.load(data);
    }
    public static WebDriver getDriver() throws IOException {
        return WebDriverInstance.getDriver();
    }



    public String getUrl() throws IOException {
        Properties prop = new Properties();
        FileInputStream data = new FileInputStream("C:\\Users\\maxim\\Projekty\\TauronDigitalMeter\\src\\main\\java\\Resource\\config.properties");
        prop.load(data);
        url = prop.getProperty("url");
        return url;
    }

    public void takeSnapShot(WebDriver webDriver) throws IOException {
        File srcFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);

        File desFile = new File("C:\\Users\\maxim\\Projekty\\TauronDigitalMeter\\src\\screenshots" + timeStamp() + ".png");

        FileUtils.copyFile(srcFile, desFile);


    }


    public String timeStamp() {

        return new SimpleDateFormat("yyy-MM-dd HH-mm-ss").format(new Date());

    }


}
