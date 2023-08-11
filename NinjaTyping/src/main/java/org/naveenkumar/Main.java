package org.naveenkumar;

import org.naveenkumar.service.Timer;

/**
 * @author <a href="mailto:naveenkumarerroju@gmail.com">
 */
public class Main {
    public static void main(String[] args) {
        try {
            Timer.countdown(4);
        } catch (InterruptedException e) {
            System.out.println("Interrupted!");
            e.printStackTrace();
        }
    }

}