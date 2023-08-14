package org.naveenkumar.service;

import org.naveenkumar.Constants;
import java.util.Scanner;

public class FeedbackService {

    Scanner scanner = new Scanner(System.in);

    public String gameMode(){

        System.out.println(Constants.ASK_GAME_MODE);
        System.out.println("1. Randomly generate text \n2. Choose a category to generate. \n3. Custom text");
        int gamemode = scanner.nextInt();

        return switch (gamemode) {
            case 1 -> Constants.GAME_MODE_RANDOM;
            case 2 -> Constants.GAME_MODE_CUSTOM_CATOGORY;
            case 3 -> Constants.GAME_MODE_CUSTOM_TEXT;
            default -> null;
        };
    }
    public String textCategory(){

        System.out.println("Please select a category to generate text:");
        System.out.println("1. Random colors \n2. random fruit names. \n3. Long words. \n4. Great literature passages. \n5. Poems");
        int category = scanner.nextInt();

        return switch (category) {
            case 1 -> Constants.CATOGORY_COLOURS;
            case 2 -> Constants.CATOGORY_FRUIT_NAMES;
            case 3 -> Constants.CATOGORY_LONG_WORDS;
            case 4 -> Constants.CATOGORY_LITERATURE;
            case 5 -> Constants.CATOGORY_POETRY;
            default -> null;
        };

    }

    public static void displayTheTestToUser(String text){
        System.out.println(text);
    }

    /**
     * added double scanner.nextLine, because if single line was added, it wasn't waiting for the user to enter. as per developer's community suggestion, added two.
     * @return
     */
    public String getTextFromUser(){
        scanner.nextLine();
        return scanner.nextLine();
    }
}
