package org.naveenkumar;

import org.naveenkumar.service.FeedbackService;
import org.naveenkumar.service.Timer;

/**
 * @author <a href="mailto:naveenkumarerroju@gmail.com">
 */
public class Main {
    private static int numberOfWords = 10;

    public static void main(String[] args) throws InterruptedException {

        Timer timer = new Timer();
        FeedbackService feedbackService = new FeedbackService();

        System.out.println(Constants.WELCOME_DISPLAY);
        timer.holdProcess(2);

        String gameMode = feedbackService.gameMode();

        if (gameMode == Constants.GAME_MODE_RANDOM){
            System.out.println("A random text is generating for you");
        } else if (gameMode == Constants.GAME_MODE_CUSTOM_TEXT){
            System.out.println("Enter the custom text");
        } else if (gameMode == Constants.GAME_MODE_CUSTOM_CATOGORY){
            String category = feedbackService.textCategory();
        }

    }

/*

    private void minimumfunctionality(){
        Timer timer = new Timer();

        try {
            timer.countdown(4);
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
            e.printStackTrace();
        }

        String displayedWords = displayWords();

        Scanner scanner = new Scanner(System.in);
        double startTime = LocalTime.now().toNanoOfDay();
        String typedWords = scanner.nextLine();

        double elapsed = (LocalTime.now().toNanoOfDay() - startTime) / 1_000_000_000;

        //int wpm = calculateWPM(typedWords, elapsed);
        //System.out.println("Words per minute: "+wpm);
    }

*/

}