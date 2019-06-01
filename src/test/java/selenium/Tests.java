package selenium;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import selenium.pages.GoogleSearch;
import selenium.pages.GoogleTranslate;

public class Tests {
    private WebDriverSettings settings;
    private ChromeDriver driver;
    String key = "Погода в Москве";
    String url = "https://www.google.com/";

    public Tests(){
        this.settings = new WebDriverSettings();
        this.driver = this.settings.driver();
    }
    @Test
    public void weatherTest(){
        GoogleSearch googlePage = new GoogleSearch(driver);
        driver.get(url);
        googlePage.weatherSearch(key);
        googlePage.weatherResult();
        driver.get("https://api.telegram.org/bot869787181:AAF-0rzFP1Hi_KC5PzEtUAdiMVYEIq1FSPI/sendMessage?chat_id=@SeleniumI&text=" + key + " " + googlePage.weatherResult() +"°C");
        driver.quit();

    }
    @Test
    public void googleTest(){
        GoogleSearch google = new GoogleSearch(driver);
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
        GoogleSearch google = new GoogleSearch(driver);
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
        GoogleSearch google = new GoogleSearch(driver);
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
    public void googleTranslate() throws InterruptedException{
        GoogleTranslate googleTranslate = new GoogleTranslate(driver);
        String key = "Какая погода в Москве";
        String language = "английский";
        System.out.println("----------///// Начало теста /////----------");
        driver.get("https://translate.google.com/");
        googleTranslate.sendText().sendKeys(key);
        googleTranslate.selLang(language);
        //googleTranslate.selectLanguage();
        Thread.sleep(1500);
        System.out.println(googleTranslate.getText().getText());
        System.out.println("----------///// Конец теста /////----------");
        driver.quit();

    }

}
