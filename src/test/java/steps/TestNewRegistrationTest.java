package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.Registration;

import static com.codeborne.selenide.Selenide.open;

public class TestNewRegistrationTest {

    Registration registration = new Registration();
    String email = "urait301111" + "+" + System.currentTimeMillis() + "@yandex.ru";
    String lastName = "Иванов";
    String firstName = "Иван";
    String secondName = "Иванович";
    String phone = "89275000010";
    String discipline = "Web-программирование";

    @Given("^Open site \"([^\"]*)\"$")
    public void open_site(String arg1) {
        open(arg1);

    }

    @When("^Enter e-mail$")
    public void enter_e_mail() {
        registration.sendMail(email);
        System.out.println(email);

    }

    @When("^Enter the lastName \"([^\"]*)\"$")
    public void enter_the_lastName(String arg1) {
        registration.sendSurname(arg1);
    }

    @When("^Enter the name \"([^\"]*)\"$")
    public void enter_the_name(String arg1) {
        registration.sendName(arg1);
    }

    @When("^Enter the middleName \"([^\"]*)\"$")
    public void enter_the_middleName(String arg1) {
        registration.sendSecondName(arg1);
    }

    @When("^Choosing an Organization \"([^\"]*)\"$")
    public void choosing_an_Organization(String arg1) {
        registration.sendOrganization(arg1);

    }

    @When("^Enter the phone$")
    public void enter_the_phone() {
        registration.sendPhone(phone);

    }

    @When("^Choosing a discipline$")
    public void choosing_a_discipline() {
        registration.sendDiscipline(discipline);
    }

    @When("^Click the Register button$")
    public void click_the_Register_button() {

            registration.toRegister();

    }

    @When("^Confirm Registration$")
    public void confirm_Registration() {
        registration.confirmRegistration(email);

    }



}
