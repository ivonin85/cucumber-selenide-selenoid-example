package runners;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import cucumber.api.CucumberOptions;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        format = {"pretty", "json:target/cucumber.json", "html:target/cucumber.html"},
        features = {"src/test/cucumber/production/"},
        tags = {"@prod"},
        plugin = {"io.qameta.allure.cucumber2jvm.AllureCucumber2Jvm"},
        glue = {"steps", "hooks"})

public class TestRunnerAll {
    @BeforeClass
    public static void before() {
        /*WebDriverManager.chromedriver().version("76").setup();*/
        Configuration.timeout = 10000;
        Configuration.browserSize = "1600x1024";
        Configuration.baseUrl = "http://localhost:4444/";
        Configuration.remote = "http://10.1.0.30:4444/wd/hub";
        Configuration.browserCapabilities.setCapability("enableVNC", true);
        if ("true".equals(System.getProperty("video.enabled"))) {
            Configuration.browserCapabilities.setCapability("enableVideo", true);
            Configuration.browserCapabilities.setCapability("videoFrameRate", 24);
        }
    }
}
