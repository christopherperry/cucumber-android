package com.example.chperr.cucumberandroid.test.stub;


import com.example.chperr.cucumberandroid.Animal;

public class AnimalStub implements Animal {
    private String speech;

    public void setSpeech(String speech) {
        this.speech = speech;
    }

    @Override
    public String speak() {
        return speech;
    }
}
