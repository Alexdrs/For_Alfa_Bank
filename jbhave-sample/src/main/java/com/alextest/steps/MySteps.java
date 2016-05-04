package com.alextest.steps;

import PageObject.UsingPage;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class MySteps extends UsingPage {

    @Override
    @Given("Запустить браузер и развернуть на весь экран")
    public void browserWwindMax() {
        super.browserWwindMax();
    }

    @When("Зайти на yandex.ru")
    public void getUrl() {
        super.getUrl(url);
    }

    @When("Перейти в яндекс маркет")
    public void clickLink() {
        super.clickLink(linkmarket);
    }


    @When("Выбрать раздел Электроника")
    public void getElectronic() {
        super.clickLink(linkelectronics);
    }

    @When("Выбрать раздел Телевизоры")
    public void getDevices() {
        super.clickLink(devices1);
    }
    @When("Выбрать раздел Наушники")
    public void getDevice() {
        super.clickLink(devices2);
    }

    @When("Зайти в расширенный поиск")
    public void detalSearch() {
        super.clickLink(linksearchadvanced);
    }

    @When("Задать параметр поиска от 20000 рублей")
    public void getSumm() {
        super.getIdAndEnterData(fromfiID, summ1);
    }

    @When("Задать параметр поиска от 5000 рублей")
    public void getSumm2() {
        super.getIdAndEnterData(fromfiID, summ2);
    }

    @When("Выбрать производителей Samsung и LG")
    public void getChekbox() {
        super.getIdAndClick(SamsungID);
        super.getIdAndClick(LgID);
    }
    @When("Выбрать производителей Beats")
    public void getChekboxID() {
        super.getIdAndClick(BeatsID);
    }
    @When("Нажать кнопку Применить")
    public void clicSubmit(){
        super.getXpathClick(xpathSubmit);
    }

    @When("Проверить, что элементов на странице 10")
    public void equalsElement() {
        super.equalsElements(n, clasNameFind);
    }

    @When("Запомнить первый элемент в списке")
    public void rememberElement(){
        super.rememberValue(selectorProductCard);
    }
    @When("В поисковую строку ввести запомненное значение")
    public void getText(){
        super.getIdAndEnterData(searchID, rememberValueElement);
    }

    @Then("Найти и проверить, что наименование товара соответствует запомненному значению")
    public void findAndCheckElement(){
        super.getXpathClick(xpathSearch);
        super.findAndCheckElement(productElement);
    }
    @Then("Закрыть браузер")
    public void quitBrowser(){
        super.quitBrowser();
    }
}


