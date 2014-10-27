package com.github.lyndaoleary;

public class Factorial {
    public static int factorial(int input) {
        int output = 1;
        for(int i = 1; i <= input; i++) {
            output = output * i;
        }
        return output;
    }
}
