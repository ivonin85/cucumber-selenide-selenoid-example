package steps;

import cucumber.api.java.ru.Дано;
import pages.Lk;

public class LkSteps {
    Lk lk = new Lk();
    String surname;
    String name;
    String originalName;

    @Дано("^Личный кабинет -- Нажимаем кнопку \"([^\"]*)\"$")
    public void личный_кабинет_Нажимаем_кнопку(String arg1) {

        lk.clickEdit(arg1);
    }

    @Дано("^Личный кабинет -- Вводим фамилию \"([^\"]*)\"$")
    public void личный_кабинет_Вводим_фамилию(String arg1) {
        surname = arg1;
        lk.selectSurname(arg1);
    }

    @Дано("^Личный кабинет -- Вводим имя \"([^\"]*)\"$")
    public void личный_кабинет_Вводим_имя(String arg1) {
        name = arg1;
        lk.selectName(arg1);
    }

    @Дано("^Личный кабинет -- Нажимаем кнопку Сохранить$")
    public void личный_кабинет_Нажимаем_кнопку_Сохранить() {
        lk.clickSave();
    }

    @Дано("^Личный кабинет -- Сравниваем введенные данные$")
    public void личный_кабинет_Сравниваем_введенные_данные() {
        originalName = surname + " " + name;

        lk.assertData(originalName);
    }
}
