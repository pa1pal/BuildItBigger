package com.example;

import java.util.ArrayList;

public class Jokes {

    private final int totalJokes = 0;
    private ArrayList<String> jokes = new ArrayList<String>();
    public Jokes() {
        jokes.add("example");
        jokes.add("example");
        jokes.add("example");
        jokes.add("example");
        jokes.add("example");
        jokes.add("example");
        jokes.add("example");
        jokes.add("example");
        jokes.add("example");

      //  totalJokes = jokes.size();
    }

    public Jokes (String s) {

    }


    public String getMeJoke(){
        int rand = (int) Math.ceil((totalJokes - 1) * Math.random());
        return jokes.get(rand);
    }
}
