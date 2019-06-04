package selenium.settings;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

public class WebDriverSettings {
    public ChromeDriver driver;

    @Before
    public void setUp(){
        String chromeDriver;
        String windows = "Windows";
        if (System.getProperty("os.name").contains(windows)) {
            chromeDriver = System.getProperty("user.dir") + "/chromedriver/chromedriver.exe";
        } else chromeDriver = System.getProperty("user.dir") + "/chromedriver/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriver);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        this.driver = new ChromeDriver();

        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

    }

    @After
    public void closed() {
        driver.quit();
    }

}
