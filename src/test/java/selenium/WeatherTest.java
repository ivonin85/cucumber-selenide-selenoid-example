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
    @Test
    public void googleTest(){
        Google google = new Google(driver);
        String name = "q";
        String key = "Усы Пескова";
        System.out.println("----------///// Начало теста /////----------");
        driver.get("https://www.google.ru/");
        // ищем что-то
        google.showGoogle(name, key);
        // выводим все заголовки со страницы
        google.webelementList();
        System.out.println("----------///// Конец теста /////----------");
        driver.quit();

    }
    @Test
    public void googleTemperatureMoscow(){
        Google google = new Google(driver);
        String name = "q";
        String key = "Погода в Москве";
        System.out.println("----------///// Начало теста /////----------");
        driver.get("https://www.google.ru/");
        // ищем что-то
        google.showGoogle(name, key);
        System.out.println((key + " " + google.showTemperature() + " °C"));
        google.displayTemperature(key + " " + google.showTemperature() + " °C");
        System.out.println("----------///// Конец теста /////----------");
        driver.quit();

    }

    @Test
    public void googleTemperatureVolgograd(){
        Google google = new Google(driver);
        String name = "q";
        String key = "Погода в Волгограде";
        System.out.println("----------///// Начало теста /////----------");
        driver.get("https://www.google.ru/");
        // ищем что-то
        google.showGoogle(name, key);
        System.out.println((key + " " + google.showTemperature() + " °C"));
        google.displayTemperature(key + " " + google.showTemperature() + " °C");
        System.out.println("----------///// Конец теста /////----------");
        driver.quit();

    }

    /**
     тест заходит на translate.google.com вводт слово на английском,
     забирает перевод на русском и выводит в консоль
     **/

    @Test
    public void googleTranslate() {
        Google google = new Google(driver);
        String key = "Какая погода в Москве";
        System.out.println("----------///// Начало теста /////----------");
        driver.get("https://translate.google.com/");
        google.sendText().sendKeys(key);
        System.out.println(google.getText().getText());
        System.out.println("----------///// Конец теста /////----------");
        driver.quit();

    }

}
