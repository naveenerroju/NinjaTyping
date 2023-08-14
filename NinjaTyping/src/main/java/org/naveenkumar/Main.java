package org.naveenkumar;

import org.naveenkumar.service.*;

import java.time.LocalTime;

/**
 * @author <a href="mailto:naveenkumarerroju@gmail.com">
 */
public class Main {
    static MainService service = new MainService();

    public static void main(String[] args) throws InterruptedException {

        Timer timer = new Timer();
        FeedbackService feedbackService = new FeedbackService();

        FeedbackService.displayTheTestToUser(Constants.WELCOME_DISPLAY);

        String gameMode = feedbackService.gameMode();
        StringBuilder actualText = new StringBuilder();

        if (Constants.GAME_MODE_RANDOM.equals(gameMode)) {
            actualText.append(service.performDefaultMode());
        } else if (Constants.GAME_MODE_CUSTOM_TEXT.equals(gameMode)){
            actualText.append(service.performCustomMode());
        } else if (Constants.GAME_MODE_CUSTOM_CATOGORY.equals(gameMode)){
            String category = feedbackService.textCategory();
            FeedbackService.displayTheTestToUser("You have chosen "+category);
            service.performCategoryMode();
        }

        timer.countdown(4);

        double startTime = LocalTime.now().toNanoOfDay();
        String testInput = feedbackService.getTextFromUser();
        double elapsed = (LocalTime.now().toNanoOfDay() - startTime) / 1_000_000_000;

        CalculatorImpl calculator = new CalculatorImpl();
        int wpm = calculator.calculateWPM(testInput, elapsed);
        double accuracy = calculator.calculateAccuracy(actualText.toString(), testInput);

        FeedbackService.displayTheTestToUser("RESULT: "+wpm+" WPM, "+accuracy+" accuracy");

    }

}