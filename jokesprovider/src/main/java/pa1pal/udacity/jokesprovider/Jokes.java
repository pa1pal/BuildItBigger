package pa1pal.udacity.jokesprovider;

import java.util.ArrayList;

public class Jokes {

    private final int totalJokes;
    private ArrayList<String> jokes = new ArrayList<String>();
    public Jokes() {
        jokes.add("Funny Joke");
        jokes.add("Funny Joke");
        jokes.add("Funny Joke");
        jokes.add("Funny Joke");
        jokes.add("Funny Joke");
        jokes.add("Funny Joke");
        jokes.add("Funny Joke");
        jokes.add("Funny Joke");
        jokes.add("Funny Joke");
        jokes.add("Funny Joke");
        jokes.add("Funny Joke");
        jokes.add("Funny Joke");
        jokes.add("Funny Joke");
        jokes.add("Funny Joke");
        jokes.add("Funny Joke");

        totalJokes = jokes.size();
    }

    public String getMeJoke(){
        int rand = (int) Math.ceil((totalJokes - 1) * Math.random());
        return jokes.get(rand);
    }
}
