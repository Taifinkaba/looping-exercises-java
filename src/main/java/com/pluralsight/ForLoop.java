package com.pluralsight;

public class ForLoop {
    static void main() throws InterruptedException{
        for (int i = 10; i >= 1; i--){
            System.out.println(i);

            // timer to pause
            Thread.sleep(1000);

        }

        System.out.println("Launch!");
    }
}
