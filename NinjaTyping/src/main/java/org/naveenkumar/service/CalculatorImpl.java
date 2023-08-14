package org.naveenkumar.service;

public class CalculatorImpl implements Calculator{

    @Override
    public int calculateWPM(String words, double seconds){
        int charsInWord = words.length();

        return (int) ((((double) charsInWord / 5) / seconds)*60);
    }

    @Override
    public double calculateAccuracy(String text1, String text2) {
        return 0;
    }


}
