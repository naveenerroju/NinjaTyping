package org.naveenkumar.service;

import org.naveenkumar.data.*;

import java.util.Random;

public class Generator {

    static Random rand = new Random();

    public static String generateRandomWord(){
        Words wordsData = new Words();
        String[] words = wordsData.getWords();

        return words[rand.nextInt(words.length)];
    }

    public static String generateRandomWords(int size){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++){
            result.append(generateRandomWord());
            result.append(" ");
        }
        return result.substring(0,result.length()-1);
    }

    public static String retrieveRandomPoem(){

        Poetry poetry = new Poetry();
        String[] poems = poetry.getPoems();
        int randomIndex = rand.nextInt(poems.length);
        return poems[randomIndex];

    }

    public static String retrieveRandomColors(int size){
        StringBuilder colors = new StringBuilder();
        Colors colorsObj = new Colors();

        for (int i = 0; i < size; i++) {
            colors.append(colorsObj.getRandomcolor());
            colors.append(" ");
        }

        return colors.substring(0, colors.length()-1).toLowerCase();

    }

    public static String retrieveRandomFruitVegetable(int size){
        StringBuilder fruits = new StringBuilder();
        FruitsVegetables fruitsVegetables = new FruitsVegetables();

        for (int i = 0; i < size; i++) {
            fruits.append(fruitsVegetables.getRandomFruitVegetable());
            fruits.append(" ");
        }

        return fruits.substring(0, fruits.length()-1).toLowerCase();

    }

    public static String retrieveRandomPassage(){
        GreatestOpeningLines passages = new GreatestOpeningLines();
        String[] passage = passages.getOpenings();
        int randomIndex = rand.nextInt(passage.length);
        return passage[randomIndex];

    }

}
