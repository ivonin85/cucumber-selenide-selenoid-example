package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

public class Methods {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public Methods(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 20);
    }

    /**
     * - дожидаемся элемент по локатору
     **/

    public WebElement id(String id) {

        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id)));
    }

    public WebElement cssSelector(String cssSelector) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
    }

    public WebElement className(String className) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(className)));
    }

    public WebElement name(String name) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(name)));
    }

    public WebElement linkText(String linkText) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(linkText)));
    }

    public WebElement xPath(String Xpath) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Xpath)));
    }

    public WebElement partialLinkText(String partialLinkText) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(partialLinkText)));
    }

    /**
     * - наводим мышку на элемент
     **/
    public void actionByCssSelector(String cssSelector) {
        Actions actions = new Actions(driver);
        actions.moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)))).perform();
    }

    public void actionByClassName(String className) {
        Actions actions = new Actions(driver);
        actions.moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(className)))).perform();
    }

    public void actionByXPath(String xPath) {
        Actions actions = new Actions(driver);
        actions.moveToElement(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xPath)))).perform();
    }

    /**
     * - наводим мышку на элемент
     **/
    public List<WebElement> listByCssSelector(String cssSelector) {
        List<WebElement> elements = driver.findElements(By.cssSelector(cssSelector));
        return elements;
    }

    public List<WebElement> listByClassName(String className) {
        List<WebElement> elements = driver.findElements(By.className(className));
        return elements;
    }

    /**
     * - проверяем существование элемента
     **/
    public boolean existsElementByCssSelector(String cssSelector) {
        try {
            Thread.sleep(1000);
            driver.findElement(By.cssSelector(cssSelector));
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    /**
     * - находим элемент селекта
     * - передаем его в select
     * - дожидаемся пока подгрузятся элементы из списка
     * - выбираем нужный нам элемент списка
     **/

    public void selectByIdWaitByClassNameAndSelectByValue(String id, String ClassName, String Value) {

        Select selectOrganization = new Select(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id))));
        // дожибаемся пока загрузится список но className
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(ClassName)));
        // выбираем из списка элемент по value
        selectOrganization.selectByValue(Value);
    }
    // воспроизводит javaScript код
    public void javaScript(String javascript) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(javascript);
    }


}

