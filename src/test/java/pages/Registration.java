package pages;

import org.openqa.selenium.By;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Registration {
    public String emailForRegistration = "ivonin85" + "+" + System.currentTimeMillis() + "@gmail.com";
    String textRegistration = "";


    // ввести мейл
    public void sendMail(String email){

        $("[name=\"email\"]").clear();
        $("[name=\"email\"]").setValue(email);
    }
    // вводим имя
    public void sendName(String firstName){

        $("[name=\"first_name\"]").clear();
        $("[name=\"first_name\"]").setValue(firstName);
    }
    // вводим отчество
    public void sendSurname(String lastName){

        $("[name=\"last_name\"]").clear();
        $("[name=\"last_name\"]").setValue(lastName);
    }
    // вводим фамилию
    public void sendSecondName(String secondName){
        $("[name=\"second_name\"]").clear();
        $("[name=\"second_name\"]").setValue(secondName);
    }
    // вводим телефон
    public void sendPhone (String phone){

        $("[name=\"phones[0][phone]\"]").setValue(phone);
    }
    // выбираем ВУЗ
    public void sendOrganization(String university){
        $(".select2-selection__placeholder").click();
        $(byText(university)).click();
    }
    // выбираем дисциплину
    public void sendDiscipline(String discipline){
        executeJavaScript("document.querySelector('ul.select2-selection__rendered').scrollIntoView();");
        $("ul.select2-selection__rendered").click();
        $(byText(discipline)).click();
    }
    // нажимаем кнопку регистрации
    public void toRegister (){

        executeJavaScript("document.querySelector('.content-center__row-button.button-orange.button-orange--middle').scrollIntoView();");
        $(byText("Зарегистрироваться")).click();
    }
    // подтверждение регистрации
    public void confirmRegistration(String email){
        $("span.content-center__info-mark.email_user").shouldHave(text(email));
        String link = "newtest.kt.urait.ru/test/confirm-url-for-just-registered-email?email=" + email.replace("+", "%2B").replace("@", "%40");
        // переходим по ссылке подтверждая ресистрацию
        open("http://" + link);
        // кликаем по ссылке
        $(By.xpath("/html/body/a")).click();
        // переходим в личный кабинет
        //sleep(100000);
        $(byText("Перейти в каталог")).click();
        // переходим в личный кабинет
        $("a.header-user__name").click();
        // проверяем email на соответствие
        $("span.profile-heading__name").shouldHave(text(email));
    }
}

