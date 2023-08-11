package org.naveenkumar.service;

import org.naveenkumar.data.Words;

import java.util.Random;

public class Generator {

    public static String generateRandomWord(){
        Random rand = new Random();
        Words wordsData = new Words();
        String[] words = wordsData.getWords();

        return words[rand.nextInt(words.length)];
    }
}
