package com.review.variables;

public class Variables {
    public static void main(String[] args) {

        int integerVariable = 120;
        float floatVariable = (float) 3.1415;
        double anotherFloatVariable = 3.1415;
        long longVariable = 99999999999999L;

        boolean trueOrFalseVariable = true;

        char oneCharVariable = 'M';
        String stringVariable = "This is a string variable";

        // Casting
        longVariable = integerVariable;
        integerVariable = (int) longVariable;
        anotherFloatVariable = floatVariable;
        floatVariable = (float) anotherFloatVariable;
    }
}
