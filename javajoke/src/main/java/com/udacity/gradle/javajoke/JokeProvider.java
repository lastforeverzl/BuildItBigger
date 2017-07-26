package com.udacity.gradle.javajoke;

import java.util.Random;

public class JokeProvider {
    private String[] jokes = {
            "A bear walks into a bar and says to the bartender, \"I'll have a pint of beer and a.......... packet of peanuts.\"\n" +
                    "The bartender asks, \"Why the big pause?\"",
            "Q: What do you call a masturbating bull?\n" + "A: Beef Strokinoff.",
            "Q: How do you know that carrots are good for your eyesight?\n" + "A: Have you ever seen a rabbit with glasses?",
            "Q: Why do dogs lick themselves?\n" + "A: Because they can."
    };

    public String getJoke() {
        int index = new Random().nextInt(jokes.length);
        return jokes[index];
    }
}
