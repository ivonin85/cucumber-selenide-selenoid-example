package selenium;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeatherTest {
    private WebDriverSettings settings;
    private ChromeDriver driver;
    String key = "Погода в Москве";
    String url = "https://www.google.com/";

    public WeatherTest(){
        this.settings = new WebDriverSettings();
        this.driver = this.settings.driver();
    }
    @Test
    public void weatherTest(){
        GooglePage googlePage = new GooglePage(driver);
        driver.get(url);
        googlePage.weatherSearch(key);
        googlePage.weatherResult();
        driver.get("https://api.telegram.org/bot869787181:AAF-0rzFP1Hi_KC5PzEtUAdiMVYEIq1FSPI/sendMessage?chat_id=@SeleniumI&text=" + key + " " + googlePage.weatherResult() +"°C");
        driver.quit();


    }

}
