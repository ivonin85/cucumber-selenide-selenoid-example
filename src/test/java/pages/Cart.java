package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static data.Data.*;
import static junit.framework.TestCase.assertTrue;

public class Cart {


    public void compareBookData() {
        $$("a.cart-item__title.main-link span").get(0).shouldBe(text(BOOK_NAME.toUpperCase()));
        $$("a.cart-item__title.main-link span").get(1).shouldBe(text(BENEFIT_TYPE));
        $(".cart-calculator__factor").shouldBe(text(PRICE));
        $("span.cart-calculator__sum").shouldBe(text(PRICE));
        String price = $$("span.cart-result__sum").get(1).text().substring(0, 3);
        assertTrue(price.equals(PRICE));
    }

    public void clearCart() {
        $("a.cart-button").click();
        if ($$("a.button-icon.cart-item__remove.cart-item__remove--mobile.button-icon--remove").size() > 0)
            $("a.button-icon.cart-item__remove.cart-item__remove--mobile.button-icon--remove").click();

    }

    /** Вводим телефон */
    public void selectPhone(String phone) {
        $(By.id("phone")).clear();
        $(By.id("phone")).sendKeys(Keys.HOME);
        $(By.id("phone")).sendKeys(phone);
    }

    /** Выбираем организацию */
    public void selectPresentOrganization(String value)  {
        $(By.id("select2-organization-container")).click();
        $(By.id("organization")).selectOptionByValue(value);
    }
    /** Выбираем город для самовывоза */
    public void selectCityPickUp(String City) throws InterruptedException{
        $(By.id("select2-pickup-city-container")).click();
        $(By.className("select2-search__field")).sendKeys(City);
        $(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
    }

    /** Выбираем тип доставки */
    public void selectDelivery(String deliveryType) {
        $(byText(deliveryType)).click();
    }

    /** Выбираем дату ... проверяем сначала все в классе day, а потом в new day */
    public void selectDate(int deliveryDay) throws InterruptedException {
        $(By.id("delivery-date")).click();
        Thread.sleep(1500);
        if ($$(".datepicker--cell.datepicker--cell-day:not(.-disabled-)").get(deliveryDay).isDisplayed()) {
            $$(".datepicker--cell.datepicker--cell-day:not(.-disabled-)").get(deliveryDay).click();
        } else {
            $("div.datepicker--nav-action:not(.-disabled-)").click();
            $$(".datepicker--cell.datepicker--cell-day:not(.-disabled-)").get(deliveryDay).click();
        }

    }
    /** Вводим отчество */
    public void selectPatronymic(String patronymic) {
        $(By.id("name1"));
        $(By.id("name1")).clear();
        $(By.id("name1")).sendKeys(patronymic);
    }
    /** Вводим отчество */
    public void selectSurname(String surname) {
        $(By.id("surname"));
        $(By.id("surname")).clear();
        $(By.id("surname")).sendKeys(surname);
    }
    /** Вводим имя */
    public void selectName(String name) {
        $(By.id("name"));
        $(By.id("name")).clear();
        $(By.id("name")).sendKeys(name);
    }
    /** Вводим имя */
    public void selectEmail(String email) {
        $(By.id("email"));
        $(By.id("email")).clear();
        $(By.id("email")).sendKeys(email);
        if ($(".suggestions-value").isEnabled())
            $(".suggestions-value").click();

    }

    /** Выбираем город */
    public void selectCity(String city) {
        $(By.id("select2-courier-city-container")).click();
        $(By.className("select2-search__field")).sendKeys(city);
        $(By.xpath("//li[@class='select2-results__option select2-results__option--highlighted']")).click();
    }

    /** Нажимаем кнопку "Перейти к оплате" */
    public void selectButton() {
        $("button[class=\"button-orange cart-result__payment-button\"]").click();
    }

    /** Кликаем по ссылке "Перевести в ожидание оплаты" */
    public void waitingPayment(String arg1) {
        $(By.linkText(arg1)).click();
    }

    /** Нажимаем кнопку "Оплатить" */
    public void cliclBuy(String arg1) {
        $(By.linkText(arg1)).click();
    }

    /** Кликаем по карте и выбираем город */
    public void clickToMapAndSelectCity(String pointNumber) throws InterruptedException {

        try {
            executeJavaScript("setTimeout(function(){complex_order.selectPickUpOnMap('"+ pointNumber +"');}, 20000);");

        } catch (NoAlertPresentException ex) {
            System.out.println("Alert not found");
        }
        sleep(20000);
        $(By.xpath("//*[@id=\"y-map\"]/ymaps/ymaps/ymaps/ymaps[4]/ymaps[4]/ymaps/div/div[1]/button")).click();
    }
    /** Подтверждаем покупку сертификата */
    public void buyCertificateConfirmation() {
        $(byText("Продолжить")).click();
    }

    public void selectDeliveryAddress(String address){
        $(By.id("courier-address")).clear();
        $(By.id("courier-address")).sendKeys(address);
        if($(".suggestions-suggestion").isDisplayed())
        {
            $$(".suggestions-value").get(0).click();
        }
        if ($(".suggestions-suggestion").isDisplayed());
        {
            $$(".suggestions-suggestion").get(0).click();
        }

    }

    public void proofOfPayment(){
        executeJavaScript("document.querySelector('.button-orange.cart-result__payment-button').scrollIntoView();");
        $(".button-orange.cart-result__payment-button").click();
        $(byText("Перевести в ожидание оплаты")).click();
        $(byText("Оплатить")).click();
    }







}
