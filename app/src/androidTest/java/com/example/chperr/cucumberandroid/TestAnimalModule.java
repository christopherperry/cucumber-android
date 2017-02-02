package com.example.chperr.cucumberandroid;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

import static org.mockito.Mockito.mock;

@Module
public class TestAnimalModule {

    @Provides
    @Singleton
    public Animal provideAnimal() {
        return mock(Animal.class);
    }
}
