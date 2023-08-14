package org.naveenkumar.service;

import java.util.concurrent.TimeUnit;

/**
 * @author <a href="mailto:naveenkumarerroju@gmail.com">
 *
 * This class provides functionalities related to timer
 */
public class Timer {

    /**
     * Note: The last second will be printed as 'Start'
     * @param seconds
     * @throws InterruptedException
     */
    public void countdown(int seconds) throws InterruptedException {
        for (int i= 1; i <= seconds; i++) {
            if(i == seconds) {
                System.out.println("Start");
            } else {
                System.out.println(i);
            }
            TimeUnit.SECONDS.sleep(1);
        }
    }

    public void holdProcess(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

}
