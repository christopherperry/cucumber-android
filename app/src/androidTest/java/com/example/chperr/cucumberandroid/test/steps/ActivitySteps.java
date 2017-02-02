package com.example.chperr.cucumberandroid.test.steps;

import com.example.chperr.cucumberandroid.test.util.ActivityFinisher;

import cucumber.api.Scenario;
import cucumber.api.java.After;

public class ActivitySteps {

    @After // Cucumber @After
    public void afterScenario(Scenario scenario) {
        ActivityFinisher.finishOpenActivities();
    }
}
