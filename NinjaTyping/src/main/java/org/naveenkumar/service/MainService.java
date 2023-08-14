package org.naveenkumar.service;

import org.naveenkumar.Constants;
import org.naveenkumar.errors.InvalidInputException;

import java.util.Scanner;

public class MainService {

    private static final int NUMBER_OF_WORDS = 2;

    public String generateTheText(String gameMode){
        StringBuilder actualText = new StringBuilder();
        FeedbackService feedbackService = new FeedbackService();

        if (Constants.GAME_MODE_RANDOM.equals(gameMode)) {
            actualText.append(performDefaultMode());
        } else if (Constants.GAME_MODE_CUSTOM_TEXT.equals(gameMode)){
            actualText.append(performCustomMode());
        } else if (Constants.GAME_MODE_CUSTOM_CATOGORY.equals(gameMode)){
            String category = feedbackService.textCategory();
            FeedbackService.displayTheTestToUser("You have chosen "+category);
            actualText.append(performCategoryMode(category));
        }  else {
            throw new InvalidInputException("Please choose a valid input.");
        }
        FeedbackService.displayTheTestToUser(actualText.toString());

        return actualText.toString();
    }

    public String performCategoryMode(String category) {
        StringBuilder text = new StringBuilder();

        if(Constants.CATOGORY_POETRY.equals(category)){
            text.append(Generator.retrieveRandomPoem());
        } else if(Constants.CATOGORY_COLOURS.equals(category)) {
            text.append(Generator.retrieveRandomColors(NUMBER_OF_WORDS));
        } else if (Constants.CATOGORY_FRUIT_NAMES.equals(category)) {
            text.append(Generator.retrieveRandomFruitVegetable(NUMBER_OF_WORDS));
        } else if (Constants.CATOGORY_LONG_WORDS.equals(category)){
            performDefaultMode();
        } else if (Constants.CATOGORY_LITERATURE.equals(category)) {
            text.append(Generator.retrieveRandomPassage());
        } else {
            throw new InvalidInputException("Please choose a valid input.");
        }
        return text.toString();
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
