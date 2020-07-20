package com.j2.comedianbot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Joke> someJokes = JokeWriter.getJokeListTwo();
        Jokebot jokebot = new Jokebot(someJokes);
        jokebot.tellJoke();
        jokebot.jokesIKnow = JokeWriter.getJokeListOne();

        ComedianB drMits = new ComedianB("DrMits");
        drMits.performShow();
    }
}