package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestBase {

    public static WebDriver driver;

    public WebDriver WebDriverManager() throws IOException {
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//global.properties");
        Properties prop = new Properties();
        prop.load(fis);
        String url = prop.getProperty("Url");
        String browser_properties = prop.getProperty("browser");
        String browser_maven = System.getProperty("browser");
        // result = testCondition ? value1 : value2

        String browser = browser_maven != null ? browser_maven : browser_properties;


        if (driver == null) {
            if (browser.equalsIgnoreCase("chrome")) {
                //  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//src//test//resources//chromedriver.exe");
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();// driver gets the life
            }
            if (browser.equalsIgnoreCase("firefox")) {
                //  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//src//test//resources//geckodriver.exe");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
            if (browser.equalsIgnoreCase("Edge")) {
                //  System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "//src//test//resources//msedgedriver.exe");
                WebDriverManager.edgedriver().setup();

                driver = new EdgeDriver();
            }

            if (driver != null) {
                driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
                driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
                driver.get(url);
                driver.manage().window().maximize();
            }

        }

        return driver;

    }


}

