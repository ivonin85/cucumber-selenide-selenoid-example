package steps;

import cucumber.api.java.ru.Дано;
import pages.Cart;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.sleep;
import static data.Data.EMAIL;
import static data.Data.GIFT_ORGANIZATION;

public class CartSteps {

    Cart cart = new Cart();
    private int deliveryDay = 0;


    @Дано("^Корзина -- Сравниваем данные по книге корзине$")
    public void корзина_Сравниваем_данные_по_книге_корзине() {
        cart.compareBookData();
    }

    @Дано("^Корзина -- Проверяем и чистим корзину$")
    public void корзина_Проверяем_и_чистим_корзину() {
        cart.clearCart();

    }

    @Дано("^Корзина -- Вводим телефон \"([^\"]*)\"$")
    public void корзина_Вводим_телефон(String arg1) {
        cart.selectPhone(arg1);
    }

    @Дано("^Корзина -- Вводим фамилию \"([^\"]*)\"$")
    public void корзина_Вводим_фамилию(String arg1) {
        cart.selectPatronymic(arg1);
    }

    @Дано("^Корзина -- Вводим имя \"([^\"]*)\"$")
    public void корзина_Вводим_имя(String arg1) {
        cart.selectName(arg1);
    }

    @Дано("^Корзина -- Вводим отчество \"([^\"]*)\"$")
    public void корзина_Вводим_отчество(String arg1) {
        cart.selectSurname(arg1);
    }

    @Дано("^Корзина -- Вводим email$")
    public void корзина_Вводим_email() {
        cart.selectEmail(EMAIL);

    }

    @Дано("^Корзина -- Выбираем тип доставки \"([^\"]*)\"$")
    public void корзина_Выбираем_тип_доставки(String arg1) {
        cart.selectDelivery(arg1);
    }

    @Дано("^Корзина -- Вводим город доставки \"([^\"]*)\"$")
    public void корзина_Вводим_город_доставки(String arg1) {
        cart.selectCity(arg1);

    }

    @Дано("^Корзина -- Вводим адрес доставки \"([^\"]*)\"$")
    public void корзина_Вводим_адрес_доставки(String arg1) {
        cart.selectDeliveryAddress(arg1);

    }

    @Дано("^Корзина -- Выбираем дату доставки$")
    public void корзина_Выбираем_дату_доставки() throws InterruptedException {
        cart.selectDate(deliveryDay);

    }

    @Дано("^Корзина -- Вводим город доставки для самовывоза \"([^\"]*)\"$")
    public void корзина_Вводим_город_доставки_для_самовывоза(String arg1) throws InterruptedException {
        cart.selectCityPickUp(arg1);
    }

    @Дано("^Корзина -- Выбираем пункт доставки \"([^\"]*)\"$")
    public void корзина_Выбираем_пункт_доставки(String arg1) throws InterruptedException {
        cart.clickToMapAndSelectCity(arg1);
    }

    @Дано("^Корзина -- Нажимаем кнопку Перейти к оплате и подтверждаем оплату$")
    public void корзина_Нажимаем_кнопку_Перейти_к_оплате_и_подтверждаем_оплату() {
        cart.proofOfPayment();
    }

    @Дано("^Корзина -- Выбираем организации для дарения$")
    public void корзина_Выбираем_организации_для_дарения() {
        cart.selectPresentOrganization(GIFT_ORGANIZATION);
        executeJavaScript("window.scroll(0, 450)");
    }

    @Дано("^Корзина -- Нажимаем кнопку Перейти к оплате и подтверждаем покупку сертификата$")
    public void корзина_Нажимаем_кнопку_Перейти_к_оплате_и_подтверждаем_покупку_сертификата() {
        cart.selectButton();
        sleep(1500);
        // ИНФОРМАЦИЯ О ПОКУПКЕ СЕРТИФИКАТА (ПОДТВЕРЖДЕНИЕ)
        cart.buyCertificateConfirmation();


            cart.waitingPayment("Перевести в ожидание оплаты");
            cart.cliclBuy("Оплатить");

    }
}
