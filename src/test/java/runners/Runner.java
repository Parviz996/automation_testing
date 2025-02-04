package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        plugin = {"pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                "html:TestOutput/htmlReport/cucumberHooks.html", //html report ucun
                "json:target/json-reports/cucumber.json",  //cucumber report ucun
                "junit:TestOutput/htmlReport/cucumber.xml", //xml report ucun
                "rerun:TestOutput/failed_scenario.txt",//rerun xeta veren testleri save edib yeniden avtomatik run etmek ucun
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},//spark report ucun

        features = "src/test/resources/features",
        glue = {"stepdefinitions", "runners"},
        tags = "@BillPay",
        dryRun = false)

public class Runner {

}

// plugin = {"pretty",
//                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
//                "html:target/cucumber-reports.html",
//                "json:target/json-reports/cucumber.json",
//                "junit:target/xml-report/cucumber.xml"},
//        features ="src/test/resources/features",
//        glue = {"stepdefinitions"},
//        tags = "@test2",
//        dryRun = false)

