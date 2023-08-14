package org.naveenkumar.service;

import org.naveenkumar.errors.ComingSoonExceotion;

import java.util.Scanner;

public class MainService {

    private static final int NUMBER_OF_WORDS = 2;

    public void performCategoryMode() {
        throw new ComingSoonExceotion("This feature is coming soon. It's not fully implemented.");
    }
    public String performDefaultMode() {
        String generatedText = Generator.generateRandomWords(NUMBER_OF_WORDS).toLowerCase();
        FeedbackService.displayTheTestToUser(generatedText);
        return generatedText;
    }

    public String performCustomMode() {
        FeedbackService.displayTheTestToUser("Type the custom text and press enter:");
        FeedbackService.displayTheTestToUser("When the timer says to Start, start your test.");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }
}
