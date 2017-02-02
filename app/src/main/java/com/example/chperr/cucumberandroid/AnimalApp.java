package com.example.chperr.cucumberandroid;


import android.app.Application;

public class AnimalApp extends Application {

    AnimalComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = createAnimalComponent();
    }

    AnimalComponent createAnimalComponent() {
        return DaggerAnimalComponent.create();
    }

    public AnimalComponent component() {
        return component;
    }
}
