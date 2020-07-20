package com.j2.comedianbot;

import android.util.Log;

public class Bot {

    public final static String creatorName = "Theo";
    private String name = "ROBOT";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void talkMethod(String whatToSay) {
        Log.e(getName(), whatToSay);
    }



}

