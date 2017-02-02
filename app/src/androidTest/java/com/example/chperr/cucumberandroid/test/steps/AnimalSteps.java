package com.example.chperr.cucumberandroid.test.steps;


import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;

import com.example.chperr.cucumberandroid.Animal;
import com.example.chperr.cucumberandroid.TestAnimalComponent;
import com.example.chperr.cucumberandroid.TestApp;

import javax.inject.Inject;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import static org.mockito.Mockito.doReturn;

public class AnimalSteps {
    @Inject
    Animal animal;

    @Before
    public void beforeScenario() {
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        TestApp app = (TestApp) instrumentation.getTargetContext().getApplicationContext();
        TestAnimalComponent component = (TestAnimalComponent) app.component();
        component.inject(this);
    }

    @Given("^The animal is a dog$")
    public void the_animal_is_a_dog() throws Throwable {
        doReturn("bork!").when(animal).speak();
    }

    @Given("^The animal is a cat$")
    public void the_animal_is_a_cat() throws Throwable {
        doReturn("Mow!").when(animal).speak();
    }
}
