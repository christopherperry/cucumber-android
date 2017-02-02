package com.example.chperr.cucumberandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.test.mock.MockApplication;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Animal animal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inject();
        Log.d("MainActivity", "Main activity loaded!");

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("MainActivity", "Button clicked!");
                ((TextView) findViewById(R.id.animalSound)).setText(animal.speak());
            }
        });
    }

    void inject() {
        ((AnimalApp) getApplication()).component().inject(this);
    }
}
