package pages;

import com.codeborne.selenide.SelenideElement;
import data.Data;
import org.openqa.selenium.Keys;

import java.util.List;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static data.Data.*;
import static org.junit.Assert.assertTrue;

public class Catalog {

    public void selectBook(int bookNumber) {
        executeJavaScript("($('.books-list__heading a.main-link')[" + bookNumber + "]).click();");
    }

    public void checkNumberOfElements(String numberOfElements) {
        Integer size = $$("span.books-list__name").size();
        String sizeStr = Integer.toString(size);
        assertTrue(sizeStr.equals(numberOfElements));
    }

    public void disciplineSearch(String discipline) {
        $("[type=\"search\"]").setValue(discipline).sendKeys(Keys.ENTER);
        $(byText(discipline)).click();
        $(".discipline-move-button.discipline-move-button--desktop").click();
        $(".discipline-selected-button.button-orange").click();
    }

    public void searchResult() {
        /** на странице с результатами поиска сверяем contentId, название книги и тип издания
         если все совпадает переходим в карточку книги и сравниваем title
         */
        for (int i = 0; i < $$("div.books-list__book").size(); i++)
            if ($$("div.books-list__book").get(i).getAttribute("data-id").equals(CONTENT_ID) &&
                    $$("span.books-list__name").get(i).getAttribute("innerText").equals(BOOK_NAME) &&
                    $$("div.books-list__edition").get(i).getAttribute("innerText").equals(BENEFIT_TYPE))
            {
                $$("span.books-list__name").get(i).click();
            }
        /** если тест падает с указанием на 42 строку, то скорее всего не сработала 35 строка*/
        assertTrue(title().equals(TITLE));
    }

    public void comparePriceList(int bookPrice){
        List<SelenideElement> priceList = $$("li.buy-book-menu__prices-price");
        for (SelenideElement s : priceList) {
            /** берем атрибут innerText убераем все пробелы и отрезаем последний символ*/
            int price = Integer.parseInt(s.getAttribute("innerText").replaceAll("\\s+","").replaceFirst(".$",""));
            assertTrue(price > bookPrice);
        }
    }


}
