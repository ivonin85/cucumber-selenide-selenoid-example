package steps;

import com.codeborne.selenide.Selenide;
import cucumber.api.java.After;
import cucumber.api.java.ru.Дано;
import pages.Home;

import static com.codeborne.selenide.Selenide.open;
import static data.Data.BASE_URL;
import static data.Data.TITLE;

public class HomeSteps {
    Home home = new Home();
    String searchQuery;

    @Дано("^Главная -- Закрываем панель laravel$")
    public void главная_Закрываем_панель_laravel() {
        home.closeLaravel();
    }

    @Дано("^Главная -- Открываем сайт$")
    public void главная_Открываем_сайт() {

        open(BASE_URL);
    }

    @Дано("^Главная -- Открываем сайт на странице \"([^\"]*)\"$")
    public void главная_Открываем_сайт_на_странице(String arg1) {
        open(BASE_URL + arg1);
    }

    @Дано("^Главная -- Вводим логин и пароль$")
    public void главная_Вводим_логин_и_пароль() {

        home.loginPass();
    }

    @Дано("^Главная -- Переходим в личный кабинет$")
    public void главная_Переходим_в_личный_кабинет() {

        home.lkLink();
    }

    @Дано("^Главная -- Переходим в корзину$")
    public void главная_товара_Переходим_в_корзину() {
        home.goToCart();
    }

    @Дано("^Главная -- Переходим на главную страницу$")
    public void главная_Переходим_на_главную_страницу() {
        home.goToHome();
    }


    @Дано("^Главная -- Вводим запрос \"([^\"]*)\" в строку поиска$")
    public void главная_Вводим_запрос_в_строку_поиска(String arg1) {
        home.searchQuery(arg1);
    }
    @Дано("^Главная -- Сравниваем с полученным результатом$")
    public void главная_Сравниваем_с_полученным_результатом() {
        home.assertResult(TITLE);
    }

    @Дано("^Главная -- Выбираем подкатегорию \"([^\"]*)\" в категорией \"([^\"]*)\"$")
    public void главная_Выбираем_подкатегорию_в_категорией(String arg1, String arg2) {
        home.selectSubCategory(arg2, arg1);
    }

    @After
    public void close(){
        Selenide.close();
    }

}
