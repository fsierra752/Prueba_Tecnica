package com.chrome.steps;

import com.chrome.pageobjects.IniciarBuscadorChromePageObject;

import net.thucydides.core.annotations.Step;
public class IniciarNavegadorSteps {

    IniciarBuscadorChromePageObject inicioNavegadorPageObject = new IniciarBuscadorChromePageObject();

    @Step("se abre el navegador")
    public void abrirGoogle(){
        inicioNavegadorPageObject.open();
    }

    @Step("se busca la palabra en el navegador")
    public void buscarPalabraEnChrome(String dato){
        inicioNavegadorPageObject.ingresarPalabraEnBuscador(dato);
    }

}


