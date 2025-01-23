package runners;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before
    public void setUpScenarios(){
        System.out.println("Before Metodu");
    }
    @After
    public void tearDownScenarios(Scenario scenario){
        System.out.println("After Metodu");
//        Eger bir Scenario FAIL ederse, ekran goruntusunu al ve rapora elave et
        if (scenario.isFailed()) {
            final byte[] failedScreenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//                       ekran goruntusu    file tipi                  ekran goruntusunun adi
            scenario.attach(failedScreenshot, "image/png", "failed_scenario_" + scenario.getName());

            Driver.closeDriver(); // Bura browseri baglayir
        }
    }
}
