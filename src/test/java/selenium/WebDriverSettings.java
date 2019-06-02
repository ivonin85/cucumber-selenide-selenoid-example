package selenium;

import org.junit.After;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDriverSettings {
    private ChromeDriver driver;
    String windows7 = "Windows 7";
    String windows10 = "Windows 10";

    public WebDriverSettings(){
        String chromeDriver;
        /**
         Определяем версию операционной системы ... необходимо в переменную windowsVersion прописать версию Windows
         Если операционка не Windows, то будет использоваться драйвер для Linux
         **/
        if (System.getProperty("os.name").equals(windows7) || System.getProperty("os.name").equals(windows10)) {
            chromeDriver = System.getProperty("user.dir")+"/chromedriver/chromedriver.exe";
        } else chromeDriver = System.getProperty("user.dir")+"/chromedriver/chromedriver";
        System.setProperty("webdriver.chrome.driver", chromeDriver);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        this.driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();

    }

    public ChromeDriver driver(){

        return driver;
    }

}
