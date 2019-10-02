package steps;

import cucumber.api.java.ru.Дано;
import pages.Book;

public class BookSteps {

    Book book = new Book();

    @Дано("^Карточка товара -- Считываем название книги$")
    public void карточка_товара_Считываем_название_книги() {
        book.bookTitle();
    }

    @Дано("^Карточка товара -- Нажимаем кнопку Купить и выбираем \"([^\"]*)\"$")
    public void карточка_товара_Нажимаем_кнопку_Купить_и_выбираем(String arg1) {
        book.selectBookType(arg1);

    }

    @Дано("^Карточка товара -- Сравниваем данные по книге в карточке товара$")
    public void карточка_товара_Сравниваем_данные_по_книге_в_карточке_товара() {
        book.compareBookData();
    }
}
