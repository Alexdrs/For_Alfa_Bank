package PageObject;

/**
 * Переменные
 */

public class UImap {

    public String url = "https://www.yandex.ru/"; // Переменная url сайта
    public String rememberValueElement; // Переменная для запоминания результата

    // Линки по тексту
    public String linkmarket = "Маркет"; // линк Яндекс Маркет
    public String linksearchadvanced = "Расширенный поиск →"; // линк Расширенный поиск
    public String linkelectronics = "Электроника"; // линк "Электроника"

    // Переменные для хранения ID объектов
    public String SamsungID = "gf-1801946-1871447"; // Переменная id чекбокса Samsung в Яндекс маркет
    public String LgID = "gf-1801946-1871499"; // Переменная id чекбокса LG в Яндекс маркет
    public String BeatsID = "gf-1801946-8455647"; // Переменная id чекбокса Beats в Яндекс маркет
    public String fromfiID = "gf-pricefrom-var"; // id поля "от" для ввода суммы
    public String searchID = "header-search"; // id поля поиска;

    // Переменные сценариев
    public String devices1 = "Телевизоры"; // Переменная товара для поиска в первом сценарии
    public String devices2 = "Наушники"; // Переменная товара для поиска в втоом сценарии
    public String summ1 = "20000"; // Переменная суммы для поиска по первому сценарию
    public String summ2 = "5000"; // Переменная суммы для поиска по второму сценарию
    public int n = 10; // количество проверяемых элементов на странице согласно сценарию

    // Пути к объектам
    public String xpathSubmit = "(//button[@type='button'])[6]"; // xpath кнопки "Применить"
    public String xpathSearch = "(//button[@type='submit'])[2]"; // xpath кнопки "Найти"

    // Переменные для проверок
    public String clasNameFind = "snippet-card__header-text"; // Имя класса проверяемого элемента
    public String productElement = ".title_size_32"; // Заголовок карточки продукта
    public String selectorProductCard = "span.snippet-card__header-text"; // css selector карточки продукта на странице
}
