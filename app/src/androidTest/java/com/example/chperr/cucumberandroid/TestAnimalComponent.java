package com.example.chperr.cucumberandroid;

import com.example.chperr.cucumberandroid.test.steps.AnimalSteps;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = TestAnimalModule.class)
public interface TestAnimalComponent extends AnimalComponent{

    void inject(AnimalSteps animalSteps);
}
