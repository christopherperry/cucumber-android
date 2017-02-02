package com.example.chperr.cucumberandroid.test.runner;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.support.test.runner.MonitoringInstrumentation;

import com.example.chperr.cucumberandroid.AnimalApp;
import com.example.chperr.cucumberandroid.TestApp;

import cucumber.api.CucumberOptions;
import cucumber.api.android.CucumberInstrumentationCore;

@CucumberOptions(
        glue = "com.example.chperr.cucumberandroid.test.steps",
        features = "features"
)
public class CucumberTestRunner extends MonitoringInstrumentation {

    private final CucumberInstrumentationCore mInstrumentationCore = new CucumberInstrumentationCore(this);

    @Override
    public void onCreate(Bundle arguments) {
        super.onCreate(arguments);

        mInstrumentationCore.create(arguments);
        start();
    }

    @Override
    public void onStart() {
        super.onStart();

        waitForIdleSync();
        mInstrumentationCore.start();
    }

    @Override
    public Application newApplication(ClassLoader cl, String className, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return super.newApplication(cl, TestApp.class.getName(), context);
    }
}
