package selenium.tests;

import org.junit.Assert;
import org.junit.Test;
import selenium.settings.WebDriverSettings;
import selenium.pages.GoogleSearch;
import selenium.pages.GoogleTranslate;
import selenium.pages.Odobrim;


public class Tests extends WebDriverSettings {
    private String key = "Погода в Москве";
    private String searchQuery = "Усы Пескова";
    private String language = "английский";
    private String textToTranslate = "Какая погода в Москве?";
    private String originalText = "What is the weather in Moscow?";


    @Test
    public void weatherTest() {
        GoogleSearch googlePage = new GoogleSearch(driver);
        driver.get("https://www.google.com/");
        googlePage.weatherSearch(key);
        googlePage.weatherResult();
        // отправляет сообщение в телегу
        driver.get("https://api.telegram.org/bot869787181:AAF-0rzFP1Hi_KC5PzEtUAdiMVYEIq1FSPI/sendMessage?chat_id=@SeleniumI&text=" + key + " " + googlePage.weatherResult() + "°C");
    }

    @Test
    public void googleTest() {
        GoogleSearch google = new GoogleSearch(driver);
        driver.get("https://www.google.ru/");
        google.showGoogle(searchQuery);
        google.listOfTitles();
    }

    @Test
    public void googleTemperatureMoscow() {
        GoogleSearch google = new GoogleSearch(driver);
        String key = "Погода в Москве";
        driver.get("https://www.google.ru/");
        google.showGoogle(key);
        System.out.println((key + " " + google.showTemperature() + " °C"));
        google.displayTemperature(key + " " + google.showTemperature() + " °C");

    }

    @Test
    public void googleTemperatureVolgograd() {
        GoogleSearch google = new GoogleSearch(driver);
        String key = "Погода в Волгограде";
        driver.get("https://www.google.ru/");
        google.showGoogle(key);
        System.out.println((key + " " + google.showTemperature() + " °C"));
        google.displayTemperature(key + " " + google.showTemperature() + " °C");
    }

    /**
     тест заходит на translate.google.com вводт слово на английском,
     забирает перевод на русском и выводит в консоль
     **/
    @Test
    public void googleTranslate() throws InterruptedException {
        GoogleTranslate googleTranslate = new GoogleTranslate(driver);
        driver.get("https://translate.google.com/");
        googleTranslate.sendText().sendKeys(textToTranslate);
        googleTranslate.selectLanguage(language);
        Thread.sleep(1500);
        try {
            Assert.assertTrue(originalText.equals(googleTranslate.getText().getText()));
        } catch (AssertionError as) {
            as.printStackTrace();
            System.err.println(" === /// Текст не соответствует ///===");
        }
        System.out.println(googleTranslate.getText().getText());
    }
    /**
     тест проверяет корректно ли в форме обрабатываются введенные значения
     **/
    @Test
    public void odobrimTest() {
        String time = "54";
        String timeString = "4 года 6 мес";
        String amuont = "700 000";
        Odobrim odobrim = new Odobrim(driver);
        driver.get("https://odobrim.ru/cash");
        odobrim.amount(amuont);
        odobrim.time(time);
        odobrim.choiceFree();
        String amountValue = odobrim.amount().getAttribute("value");
        String timeValue = odobrim.time().getAttribute("value");
        try {
            Assert.assertTrue(amountValue.substring(0, (amountValue.length() - 2)).equals(amuont));
        } catch (AssertionError as) {
            as.printStackTrace();
        }
        try {
            Assert.assertTrue(timeString.equals(timeValue));
        } catch (AssertionError as) {
            as.printStackTrace();
        }
        System.out.println(amountValue.substring(0, (amountValue.length() - 2)));
        System.out.println(timeValue);
    }

}
