package org.naveenkumar;

import org.naveenkumar.service.CalculatorImpl;
import org.naveenkumar.service.FeedbackService;
import org.naveenkumar.service.Generator;
import org.naveenkumar.service.Timer;

import java.time.LocalTime;

/**
 * @author <a href="mailto:naveenkumarerroju@gmail.com">
 */
public class Main {
    private static final int NUMBER_OF_WORDS = 2;

    public static void main(String[] args) throws InterruptedException {

        Timer timer = new Timer();
        FeedbackService feedbackService = new FeedbackService();

        feedbackService.displayTheTestToUser(Constants.WELCOME_DISPLAY);
        timer.holdProcess(2);

        String gameMode = feedbackService.gameMode();
        StringBuilder actualText = new StringBuilder();

        if (Constants.GAME_MODE_RANDOM.equals(gameMode)) {
            actualText.append(Generator.generateRandomWords(NUMBER_OF_WORDS).toLowerCase());
        } else if (Constants.GAME_MODE_CUSTOM_TEXT.equals(gameMode)){
            feedbackService.displayTheTestToUser("Type the custom text and press enter:");
            actualText.append(feedbackService.getTextFromUser());
        } else if (Constants.GAME_MODE_CUSTOM_CATOGORY.equals(gameMode)){
            String category = feedbackService.textCategory();
            feedbackService.displayTheTestToUser("You have chosen "+category);
            feedbackService.displayTheTestToUser("This feature is coming soon");
        }
        feedbackService.displayTheTestToUser(actualText.toString());

        timer.countdown(4);

        double startTime = LocalTime.now().toNanoOfDay();
        String testInput = feedbackService.getTextFromUser();
        double elapsed = (LocalTime.now().toNanoOfDay() - startTime) / 1_000_000_000;

        CalculatorImpl calculator = new CalculatorImpl();
        int wpm = calculator.calculateWPM(testInput, elapsed);
        double accuracy = calculator.calculateAccuracy(actualText.toString(), testInput);

        feedbackService.displayTheTestToUser("RESULT: "+wpm+" WPM, "+accuracy+" accuracy");

    }

}