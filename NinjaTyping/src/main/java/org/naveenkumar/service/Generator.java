package org.naveenkumar.service;

import org.naveenkumar.data.GreatestOpeningLines;
import org.naveenkumar.data.Poetry;
import org.naveenkumar.data.Words;

import java.util.Random;

public class Generator {

    public static String generateRandomWord(){
        Random rand = new Random();
        Words wordsData = new Words();
        String[] words = wordsData.getWords();

        return words[rand.nextInt(words.length)];
    }

    public static String generateRandomWords(int size){
        String result = "";
        for (int i = 0; i < size; i++){
            result+=generateRandomWord();
            result+=" ";
        }
        return result.substring(0,result.length()-1);
    }

    public static String retrieveRandomPoem(){
        Random rand = new Random();

        Poetry poetry = new Poetry();
        String[] poems = poetry.getPoems();
        int randomIndex = rand.nextInt(poems.length);
        return poems[randomIndex];

    }

    public static String retrieveRandomPassage(){
        Random rand = new Random();

        GreatestOpeningLines passages = new GreatestOpeningLines();
        String[] passage = passages.getOpenings();
        int randomIndex = rand.nextInt(passage.length);
        return passage[randomIndex];

    }

}
