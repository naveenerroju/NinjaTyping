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
        String actualText = service.generateTheText(gameMode);

        timer.countdown(4);

        double startTime = LocalTime.now().toNanoOfDay();
        String testInput = feedbackService.getTextFromUser();
        double elapsed = (LocalTime.now().toNanoOfDay() - startTime) / 1_000_000_000;

        CalculatorImpl calculator = new CalculatorImpl();
        int wpm = calculator.calculateWPM(testInput, elapsed);
        double accuracy = calculator.calculateAccuracy(actualText, testInput);

        FeedbackService.displayTheTestToUser("RESULT: "+wpm+" WPM, "+accuracy+" accuracy");

    }

}