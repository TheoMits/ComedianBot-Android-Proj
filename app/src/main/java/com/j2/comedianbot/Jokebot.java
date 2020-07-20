package com.j2.comedianbot;

import java.util.ArrayList;

public class Jokebot extends Bot{

    public static ArrayList<Joke> jokesIKnow = null;

    public Jokebot(ArrayList<Joke> aJokesIKnow) {
        jokesIKnow = aJokesIKnow;

    }

    public void tellJoke() {
        Double randomNumDouble =new Double(Math.random() * jokesIKnow.size());
        int randomNum = randomNumDouble.intValue();

        Joke myJoke = jokesIKnow.get(randomNum);
        sayJoke(myJoke);
    }

    protected void sayJoke(Joke aJoke) {
        talkMethod(aJoke.getJokeSetup());
        talkMethod(aJoke.getJokePunchLine());
    }




}

