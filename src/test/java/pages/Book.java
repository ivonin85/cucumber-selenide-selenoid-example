package pages;

import data.Data;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static data.Data.*;
import static junit.framework.TestCase.assertTrue;

public class Book {

    public String bookTitle;
    public String newbookTitle;

    public void bookTitle() {
        bookTitle = $(".page-content-head__title").shouldBe(visible).text();
        newbookTitle = $(".page-content-head__title").getAttribute("innerText");
        System.out.println(bookTitle);
        System.out.println(newbookTitle);

    }


    public void selectBookType(String bookType) {
        $("a.button-orange.book-preview__buy-button").click();
        $(byText(bookType)).click();
    }

    public void compareBookData(){
        String title = $$("title").get(0).getAttribute("innerText");
        assertTrue(title.equals(TITLE));
        $("div.page-content-head__title").shouldBe(text(BOOK_NAME));
        $("div.page-content-head__info-edition").shouldBe(text(BENEFIT_TYPE));
        $$("div.book-about-produce__item").get(0).$(".book-about-produce__info").shouldBe(text(NUMBER_OF_PAGES));
        $$("div.book-about-produce__item").get(1).$(".book-about-produce__info").shouldBe(text(COVER_TYPE));
        $$("div.book-about-produce__item").get(2).$(".book-about-produce__info").shouldBe(text(FINGERBOARD));
        $$("div.book-about-produce__item").get(3).$(".book-about-produce__info").shouldBe(text(ISBN));
        $("div.creation-info__year.creation-info__year--middle").shouldBe(text(YEAR));
        $$("a.book-about-info__link.main-link").get(0).shouldBe(text(SCIENCE_SCHOOL));
        $$("a.book-about-info__link.main-link").get(1).shouldBe(text(SERIES));
        String litresLink = $$("li.book-preview-partners__item a").get(0).getAttribute("href");
        assertTrue(litresLink.equals(LITRES_LINK));
        String myShopLink = $$("li.book-preview-partners__item a").get(1).getAttribute("href");
        assertTrue(myShopLink.equals(MY_SHOP_LINK));
        $("a.get-price__link.main-link").hover();
        String priceSingleAccess = $$("span.get-price-dropdown__price").get(0).getText();
        assertTrue(priceSingleAccess.equals(PRICE_SINGLE_ACCESS));
        String priceUnlimitedAccess = $$("span.get-price-dropdown__price").get(1).getText().replaceAll("\\s","");
        assertTrue(priceUnlimitedAccess.equals(PRICE_UNLIMITED_ACCESS));
        String pricePrintEdition = $$("span.get-price-dropdown__price").get(2).getText();
        assertTrue(pricePrintEdition.equals(PRICE_PRINT_EDITION));
        $("a.button-orange.book-preview__buy-button").click();
        String priceElectronicAccess = $$("li.buy-book-menu__prices-price").get(0).text().substring(0, 3);
        assertTrue(priceElectronicAccess.equals(PRICE_ELECTRONIC_ACCESS));
        String pricePrintEditionRetail = $$("li.buy-book-menu__prices-price").get(1).text().substring(0, 3);
        assertTrue(pricePrintEditionRetail.equals(PRICE_PRINT_EDITION_RETAIL));
        String priceCertificate = $$("li.buy-book-menu__prices-price").get(2).text().substring(0, 3);
        assertTrue(priceCertificate.equals(PRICE_CERTIFICATE));

        /** i начинается с 4 потому что первые три мы уже сравнили выше*/
        int i = 4;
        for (String discipline : Data.disciplines) {
            assertTrue($$(".book-about-info__link.main-link").get(i++).getAttribute("innerText").equals(discipline));
        }

        $("p.book-about__annotation").shouldBe(text(ANNOTATION));
    }


}
