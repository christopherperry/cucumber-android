package com.example.chperr.cucumberandroid;


public class TestApp extends AnimalApp {

    @Override
    TestAnimalComponent createAnimalComponent() {
        return DaggerTestAnimalComponent.create();
    }
}
