package org.naveenkumar.service;

import org.naveenkumar.Constants;
import org.naveenkumar.errors.InvalidInputException;

import java.text.ParseException;
import java.util.Scanner;

public class MainService {

    private int numberOfWords = 10;

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

        return actualText.toString();
    }

    public String performCategoryMode(String category) {
        StringBuilder text = new StringBuilder();

        if(Constants.CATOGORY_POETRY.equals(category)){
            text.append(Generator.retrieveRandomPoem());
            FeedbackService.displayTheTestToUser(text.toString());
        } else if(Constants.CATOGORY_COLOURS.equals(category)) {
            text.append(Generator.retrieveRandomColors(numberOfWords));
            FeedbackService.displayTheTestToUser(text.toString());
        } else if (Constants.CATOGORY_FRUIT_NAMES.equals(category)) {
            text.append(Generator.retrieveRandomFruitVegetable(numberOfWords));
            FeedbackService.displayTheTestToUser(text.toString());
        } else if (Constants.CATOGORY_LONG_WORDS.equals(category)){
            FeedbackService.displayTheTestToUser("This feature is coming soon. Instead enjoy the default mode.");
            performDefaultMode();
        } else if (Constants.CATOGORY_LITERATURE.equals(category)) {
            text.append(Generator.retrieveRandomPassage());
            FeedbackService.displayTheTestToUser(text.toString());
        } else {
            throw new InvalidInputException("Please choose a valid input.");
        }
        return text.toString();
    }

    public String performDefaultMode() {
        String generatedText = Generator.generateRandomWords(numberOfWords).toLowerCase();
        FeedbackService.displayTheTestToUser(generatedText);
        return generatedText;
    }

    public String performCustomMode() {
        FeedbackService.displayTheTestToUser("Type the custom text and press enter:");
        FeedbackService.displayTheTestToUser("When the timer says to Start, start your test.");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public void setDefaultNumberOfWords(){
        FeedbackService feedbackService = new FeedbackService();
        FeedbackService.displayTheTestToUser("Enter the number of words you want to type:");
        String input = feedbackService.getTextFromUser();
        try {
            this.numberOfWords = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new InvalidInputException("Please enter a valid input.");
        }
    }
}
