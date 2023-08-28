package com.chrome.steps;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class BusquedaChromeStepDefinitions {


    @Steps
    IniciarNavegadorSteps inicioNavegadorSteps;

    @Steps
    BuscadorWikipediaSteps buscadorWikipediaSteps;

    @Dado("^que ingreso al navegador chromme$")
    public void queIngresoAlNavegadorChromme() {
        inicioNavegadorSteps.abrirGoogle();
    }

    @Cuando("^busco en: (.*) la palabra clave: (.*)$")
    public void buscoLaPalabraAutomatizacion(String fuente, String palabra ){
        inicioNavegadorSteps.buscarPalabraEnChrome(palabra);
        buscadorWikipediaSteps.encontrarLinkDeBusqueda(fuente);
    }

    @Entonces("^verifico que la primera automatizacion fue en el año: (.*)$")
    public void verificoQueLaPrimeraAutomatizacionFueEnElAño(String respuesta) {
        buscadorWikipediaSteps.compararRespuesta(respuesta);
    }
}
