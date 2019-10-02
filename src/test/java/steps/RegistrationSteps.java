package steps;

import cucumber.api.java.ru.Дано;
import pages.Registration;

import static com.codeborne.selenide.Selenide.open;

public class RegistrationSteps {
    Registration registration = new Registration();
    String email = "urait301" + "+" + System.currentTimeMillis() + "@mail.ru";
    String lastName = "Иванов";
    String firstName = "Иван";
    String secondName = "Иванович";
    String phone = "89275000010";
    String discipline = "Web-программирование";
    String university = "Абаканский строительный техникум (г. Абакан).";

    @Дано("^Регистрация -- Открываем сайт на странице \"([^\"]*)\"$")
    public void регистрация_Открываем_сайт_на_странице(String arg1) {
        open(arg1);
    }

    @Дано("^Регистрация -- Вводим e-mail$")
    public void регистрация_Вводим_e_mail() {
        registration.sendMail(email);
    }

    @Дано("^Регистрация -- Вводим фамилию$")
    public void регистрация_Вводим_фамилию() {
        registration.sendSurname(lastName);
    }

    @Дано("^Регистрация -- Вводим имя$")
    public void регистрация_Вводим_имя() {
        registration.sendName(firstName);
    }

    @Дано("^Регистрация -- Вводим отчество$")
    public void регистрация_Вводим_отчество() {
        registration.sendSecondName(secondName);
    }

    @Дано("^Регистрация -- Выбераем организацию$")
    public void регистрация_Выбераем_организацию() {
        registration.sendOrganization(university);
    }

    @Дано("^Регистрация -- Вводим телефон$")
    public void регистрация_Вводим_телефон() {
        registration.sendPhone(phone);
    }

    @Дано("^Регистрация -- Выбираем дисциплину$")
    public void регистрация_Выбираем_дисциплину() {
        registration.sendDiscipline(discipline);
    }

    @Дано("^Регистрация -- Нажимаем кнопку Зарегистрироваться$")
    public void регистрация_Нажимаем_кнопку_Зарегистрироваться() {
        registration.toRegister();
    }

    @Дано("^Регистрация -- Подтверждаем регистрацию$")
    public void регистрация_Подтверждаем_регистрацию() {
        registration.confirmRegistration(email);
    }

}
