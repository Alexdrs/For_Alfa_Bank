package PageObject;
/**
 * Методы для использования страницы
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertEquals;

public class UsingPage extends UImap {

    // Инициализация драйвера для работы с браузером Firefox
    private WebDriver driver = new FirefoxDriver();

    // Метод разворачивает браузер на весь экран
    public void browserWwindMax() {
        driver.manage().window().maximize();
    }

    // Метод получает адрес страницы и передаёт его в адресную строку
    public void getUrl(String url) {
        driver.get(url);
    }
    // Метод получает текст ссылки находит элемент на странице и кликает по нему
    public void clickLink(String textlink) {
        driver.findElement(By.linkText(textlink)).click();
    }

    // Метод получает текст ID объекта и текст данных
    // находит элемент на странице и вводит туда данные
    public void getIdAndEnterData(String id, String data) {
        driver.findElement(By.id(id)).sendKeys(data);
    }

    // Метод получает текст ID объекта находит элемент на странице и кликает по нему
    public void getIdAndClick(String id) {
        driver.findElement(By.id(id)).click();
    }

    // Метод получает текст путь к объекту находит элемент на странице и кликает по нему
    public void getXpathClick(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    // Метод получает число и текст для поиска элемента
    // находит элемент на странице и сравнивает полученное число с колличеством таких элементов
    public void equalsElements(int n, String classNameFindElement) {
        assertEquals(n, driver.findElements(By.className(classNameFindElement)).size());
    }

    // Метод получает текст css селектора объекта находит объект на странице
    // и записывает текст из объекта в переменную rememberValueElement
    public void rememberValue(String selector) {
        rememberValueElement = driver.findElement(By.cssSelector(selector)).getText();
    }

    // Метод получает текст для поиска элемента
    // находит элемент на странице и сравнивает текст элемента с текстом в переменной rememberValueElement
    public void findAndCheckElement(String ProductFind) {
        assertEquals(rememberValueElement, driver.findElement(By.cssSelector(ProductFind)).getText());
    }

    //Метод закрывает браузер
    public void quitBrowser(){
        driver.quit();
    }
}
