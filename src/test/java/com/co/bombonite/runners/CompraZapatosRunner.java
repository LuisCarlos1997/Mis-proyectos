package com.co.bombonite.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/compra_zapatos.feature",
        snippets = SnippetType.CAMELCASE,
        glue = "com.co.bombonite.stepsdefinitions",
        dryRun = false
)
public class CompraZapatosRunner {
}
