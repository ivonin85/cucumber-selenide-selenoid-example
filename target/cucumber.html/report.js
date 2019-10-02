$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/cucumber/production/buy-book-courier.feature");
formatter.feature({
  "name": "Тестируем покупку Печатное издание с доставкой курьером",
  "description": "",
  "keyword": "Свойство",
  "tags": [
    {
      "name": "@prod"
    }
  ]
});
formatter.scenario({
  "name": "Тест: покупка Печатное издание с доставкой курьером, зарегистрированный пользователь",
  "description": "",
  "keyword": "Сценарий",
  "tags": [
    {
      "name": "@prod"
    }
  ]
});
formatter.step({
  "name": "Главная -- Открываем сайт на странице \"/logout\"",
  "keyword": "Дано "
});
formatter.match({
  "location": "HomeSteps.главная_Открываем_сайт_на_странице(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Главная -- Закрываем панель laravel",
  "keyword": "И "
});
formatter.match({
  "location": "HomeSteps.главная_Закрываем_панель_laravel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Главная -- Вводим логин и пароль",
  "keyword": "И "
});
formatter.match({
  "location": "HomeSteps.главная_Вводим_логин_и_пароль()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Проверяем и чистим корзину",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Проверяем_и_чистим_корзину()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Главная -- Переходим на главную страницу",
  "keyword": "И "
});
formatter.match({
  "location": "HomeSteps.главная_Переходим_на_главную_страницу()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Главная -- Выбираем подкатегорию \"Бизнес. Экономика.\" в категорией \"ВЕСЬ КАТАЛОГ\"",
  "keyword": "И "
});
formatter.match({
  "location": "HomeSteps.главная_Выбираем_подкатегорию_в_категорией(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Каталог -- Выбираем нужную нам книгу 2 в диапазоне от ноля до девять",
  "keyword": "И "
});
formatter.match({
  "location": "CatalogSteps.каталог_Выбираем_нужную_нам_книгу_в_диапазоне_от_ноля_до_девять(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Карточка товара -- Нажимаем кнопку Купить и выбираем \"Печатное издание\"",
  "keyword": "И "
});
formatter.match({
  "location": "BookSteps.карточка_товара_Нажимаем_кнопку_Купить_и_выбираем(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Главная -- Переходим в корзину",
  "keyword": "И "
});
formatter.match({
  "location": "HomeSteps.главная_товара_Переходим_в_корзину()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Вводим телефон \"89275454645\"",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Вводим_телефон(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Вводим фамилию \"Фамилию\"",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Вводим_фамилию(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Вводим имя \"Имя\"",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Вводим_имя(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Вводим отчество \"Отчество\"",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Вводим_отчество(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Вводим email",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Вводим_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Выбираем тип доставки \"Курьерская\"",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Выбираем_тип_доставки(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Вводим город доставки \"Москва\"",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Вводим_город_доставки(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Вводим адрес доставки \"ул Мира 2 4\"",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Вводим_адрес_доставки(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Выбираем дату доставки",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Выбираем_дату_доставки()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Нажимаем кнопку Перейти к оплате и подтверждаем оплату",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Нажимаем_кнопку_Перейти_к_оплате_и_подтверждаем_оплату()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Тест: покупка Печатное издание с доставкой курьером, не зарегистрированный пользователь",
  "description": "",
  "keyword": "Сценарий",
  "tags": [
    {
      "name": "@prod"
    }
  ]
});
formatter.step({
  "name": "Главная -- Открываем сайт на странице \"/logout\"",
  "keyword": "Дано "
});
formatter.match({
  "location": "HomeSteps.главная_Открываем_сайт_на_странице(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Главная -- Закрываем панель laravel",
  "keyword": "И "
});
formatter.match({
  "location": "HomeSteps.главная_Закрываем_панель_laravel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Главная -- Выбираем подкатегорию \"Бизнес. Экономика.\" в категорией \"ВЕСЬ КАТАЛОГ\"",
  "keyword": "И "
});
formatter.match({
  "location": "HomeSteps.главная_Выбираем_подкатегорию_в_категорией(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Каталог -- Выбираем нужную нам книгу 2 в диапазоне от ноля до девять",
  "keyword": "И "
});
formatter.match({
  "location": "CatalogSteps.каталог_Выбираем_нужную_нам_книгу_в_диапазоне_от_ноля_до_девять(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Карточка товара -- Нажимаем кнопку Купить и выбираем \"Печатное издание\"",
  "keyword": "И "
});
formatter.match({
  "location": "BookSteps.карточка_товара_Нажимаем_кнопку_Купить_и_выбираем(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Главная -- Переходим в корзину",
  "keyword": "И "
});
formatter.match({
  "location": "HomeSteps.главная_товара_Переходим_в_корзину()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Вводим телефон \"89275454645\"",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Вводим_телефон(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Вводим фамилию \"Фамилию\"",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Вводим_фамилию(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Вводим имя \"Имя\"",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Вводим_имя(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Вводим отчество \"Отчество\"",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Вводим_отчество(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Вводим email",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Вводим_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Выбираем тип доставки \"Курьерская\"",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Выбираем_тип_доставки(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Вводим город доставки \"Москва\"",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Вводим_город_доставки(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Вводим адрес доставки \"ул Мира 2 4\"",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Вводим_адрес_доставки(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Выбираем дату доставки",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Выбираем_дату_доставки()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Корзина -- Нажимаем кнопку Перейти к оплате и подтверждаем оплату",
  "keyword": "И "
});
formatter.match({
  "location": "CartSteps.корзина_Нажимаем_кнопку_Перейти_к_оплате_и_подтверждаем_оплату()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/cucumber/production/buy-book-pickup.feature");
formatter.feature({
  "name": "Тестируем покупку \"Печатное издание\" с самовывозом",
  "description": "",
  "keyword": "Свойство",
  "tags": [
    {
      "name": "@prod"
    }
  ]
});
formatter.scenario({
  "name": "Тест: покупка \"Печатное издание\" с самовывозом Москва, зарегистрированный пользователь",
  "description": "",
  "keyword": "Сценарий",
  "tags": [
    {
      "name": "@prod"
    }
  ]
});
formatter.step({
  "name": "Главная -- Открываем сайт на странице \"/logout\"",
  "keyword": "Дано "
});
formatter.match({
  "location": "HomeSteps.главная_Открываем_сайт_на_странице(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Главная -- Закрываем панель laravel",
  "keyword": "И "
});
