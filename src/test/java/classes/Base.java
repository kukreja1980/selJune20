package classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public WebDriver driver;
    public WebDriver initializeWebDriver() throws IOException {

        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("src\\test\\java\\utils\\config.properties");
        prop.load(fis);
        String browserName = prop.getProperty("mybrowser");
        if (browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\kukre\\eclipse-mavenTests\\PageObject\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browserName == "Hello"){
            System.out.println("Invalid browser");
        }
        else {
            System.out.println("final option");
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }

}
