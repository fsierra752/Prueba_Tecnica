package com.chrome.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;

public class BuscadorWikipediaPageObject extends PageObject {

    public void ingresarLinkWikipedia(String linkWikipedia) {
        By linkaBuscar = By.xpath("(//a[@href=contains(.,'" + linkWikipedia + "')])[3]");
        getDriver().findElement(linkaBuscar).click();
    }

    public void encontrarRespuesta(String datoBuscado){
        By datoaBuscar = By.xpath("//p[contains(.,'" + datoBuscado + "')]");
        MatcherAssert.assertThat("No se encontro el dato esperado" + datoaBuscar, containsText(datoBuscado));
    }

}
