package org.naveenkumar;

import org.naveenkumar.service.Generator;
import org.naveenkumar.service.Timer;

import java.time.LocalTime;
import java.util.Scanner;

/**
 * @author <a href="mailto:naveenkumarerroju@gmail.com">
 */
public class Main {
    private static int numberOfWords = 10;

    public static void main(String[] args) {

        try {
            Timer.countdown(4);
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
            e.printStackTrace();
        }

        String displayedWords = displayWords();

        Scanner scanner = new Scanner(System.in);
        double startTime = LocalTime.now().toNanoOfDay();
        String typedWords = scanner.nextLine();

        double elapsed = (LocalTime.now().toNanoOfDay() - startTime) / 1_000_000_000;

        int wpm = calculateWPM(typedWords, elapsed);
        System.out.println("Words per minute: "+wpm);

    }

    private static String displayWords(){

        String words = Generator.generateRandomWords(numberOfWords);
        System.out.println(words);
        return words;

    }

    private static int calculateWPM(String words, double seconds){
        int charsInWord = words.length();

        return (int) ((((double) charsInWord / 5) / seconds)*60);
    }


}