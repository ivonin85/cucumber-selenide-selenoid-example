Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario Outline: Today is or is not Friday
    Given Open site "http://newtest.kt.urait.ru/register/create#professor"
    When Enter e-mail
    When Enter the lastName "<lastName>"
    When Enter the name "<name>"
    When Enter the middleName "<middleName>"
    When Choosing an Organization "Государственный гуманитарно-технологический университет (г. Орехово-Зуево)."
    When Enter the phone
    When Choosing a discipline
    When Click the Register button
    When Confirm Registration

    Examples:
      | lastName            | name | middleName |
      | Иванов         | Иван   | Иванович   |
      | Петров         | Петр   | Петрович   |
      | Сидоров | Сидор   | Сидорович   |