package com.chrome.steps;

import com.chrome.pageobjects.BuscadorWikipediaPageObject;
import net.thucydides.core.annotations.Step;

public class BuscadorWikipediaSteps {

    BuscadorWikipediaPageObject buscadorWikipediaPageObject = new BuscadorWikipediaPageObject();

    @Step("se ingresa al link deseado")
    public void encontrarLinkDeBusqueda(String fuente){
        buscadorWikipediaPageObject.ingresarLinkWikipedia(fuente);
    }

    @Step("se compara el resultado encontrado con el esperado")
    public void compararRespuesta(String datoBuscado){
        buscadorWikipediaPageObject.encontrarRespuesta(datoBuscado);
    }
}
