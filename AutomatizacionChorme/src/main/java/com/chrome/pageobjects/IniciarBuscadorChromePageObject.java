package com.chrome.pageobjects;


import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.google.com")
public class IniciarBuscadorChromePageObject extends PageObject {

    By txtBuscador = By.id("APjFqb");
    By btnBuscar = By.name("btnK");

    public void ingresarPalabraEnBuscador(String dato){
        getDriver().findElement(txtBuscador).sendKeys(dato);
        getDriver().findElement(btnBuscar).click();
    }
}
