package com.example.chperr.cucumberandroid;

import dagger.Component;

@Component(modules = AnimalModule.class)
public interface AnimalComponent {

    void inject(MainActivity activity);
}
