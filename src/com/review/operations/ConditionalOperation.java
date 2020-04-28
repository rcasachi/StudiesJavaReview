package com.review.operations;

import java.awt.*;

public class ConditionalOperation {
    public static void main(String[] args) {

        // Switch Case Conditional Operator
        int var = 3;
        switch (var) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Another number");
        }

        // While Loop
        int j = 0;
        while(j <= 100) {
            System.out.println("Number: " + j);
            j++;
        }

        // For Loop
        for(int i = 0; i < 100; i++) {
            System.out.println("Number: " + i);
        }

        // If Conditional Operator
        if(true) {
            System.out.println("If first expression is true");
        } else if (true) {
            System.out.println("If second expression is true");
        } else {
            System.out.println("If both expression are false");
        }

    }
}
