package com.eyas.step_definitions;

import com.eyas.utilities.ConfigurationReader;
import com.eyas.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void getUrlBeforeScenario() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @After
    public void teardownScenario(Scenario scenario) {
        scenario.isFailed();

        // using if statement to take a screenshot of the failed tests
        // but for the purpose of this task, screenshot will be taken for all tests
        //if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        //}

        Driver.closeDriver();
    }




}
