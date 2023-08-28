package com.chrome.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\com.chrome.features",
    glue = "com\\chrome\\steps",
        snippets= SnippetType.CAMELCASE)
public class BusquedaChromeRunner {

}
