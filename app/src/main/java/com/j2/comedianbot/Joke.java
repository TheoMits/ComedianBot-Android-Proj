package com.j2.comedianbot;

public class Joke {

    private String jokeSetup;
    private String jokePunchLine;

    public Joke(String jokeSetup, String jokePunchLine) {
        this.jokeSetup = jokeSetup;
        this.jokePunchLine = jokePunchLine;
    }

    public String getJokeSetup() {
        return jokeSetup;
    }

    public void setJokeSetup(String jokeSetup) {
        this.jokeSetup = jokeSetup;
    }

    public String getJokePunchLine() {
        return jokePunchLine;
    }

    public void setJokePunchLine(String jokePunchLine) {
        this.jokePunchLine = jokePunchLine;
    }


}
