package steps;

import cucumber.api.java.ru.Дано;
import data.Data;
import pages.Catalog;

import java.util.List;

public class CatalogSteps {

    Catalog catalog = new Catalog();

    @Дано("^Каталог -- Выбираем нужную нам книгу (\\d+) в диапазоне от ноля до девять$")
    public void каталог_Выбираем_нужную_нам_книгу_в_диапазоне_от_ноля_до_девять(int arg1) {
        catalog.selectBook(arg1);
    }

    @Дано("^Каталог -- Проверяем что количество заголовкой на странице равно (\\d+)$")
    public void каталог_Проверяем_что_количество_заголовкой_на_странице_равно(String arg1) {
        catalog.checkNumberOfElements(arg1);
    }

    @Дано("^Каталог -- Осуществляем поиск по дисциплинам$")
    public void каталог_Осуществляем_поиск_по_дисциплинам() {
        catalog.disciplineSearch(Data.disciplines.get(10));
    }

    @Дано("^Каталог -- На странице с результатами поиска находим нашу книгу по названию и типу пособия$")
    public void каталог_На_странице_с_результатами_поиска_находим_нашу_книгу_по_названию_и_типу_пособия() {
        catalog.searchResult();
    }

    @Дано("^Каталог -- Проверяем что цены на книги больше (\\d+)$")
    public void каталог_Проверяем_что_цены_на_книги_больше(int arg1) {
        catalog.comparePriceList(arg1);
    }
}
