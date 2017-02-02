package com.example.chperr.cucumberandroid;

import dagger.Module;
import dagger.Provides;

@Module
public class AnimalModule {

    @Provides
    static Animal provideAnimal() {
        return new Dog();
    }
}
