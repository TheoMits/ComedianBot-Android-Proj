package com.j2.comedianbot;

public class ComedianB extends Jokebot{

    public ComedianB(String aName) {
        super(null);
        setName(aName);
        jokesIKnow = JokeWriter.getJokeListTwo();
    }



    public void performShow(){
        talkMethod("Good evening everyone, my name is " + getName());
        talkMethod("Why dont I tell you some of my favorite jokes?");

        for(Joke joke : jokesIKnow){
            sayJoke(joke);
        }

        talkMethod("Thanks everyone, Goodnight!");
    }


    @Override
    protected void sayJoke(Joke aJoke) {
        talkMethod(aJoke.getJokeSetup() + " " + aJoke.getJokePunchLine());
    }


}


