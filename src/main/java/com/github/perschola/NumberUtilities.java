package com.github.perschola;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {

        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = start; i < stop; i++) {
            if(i % 2 == 0) {
                stringBuilder.append(String.valueOf(i));
            }
        }
        return stringBuilder.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = start; i < stop; i++) {
            if(i % 2 == 1) {
                stringBuilder.append(String.valueOf(i));
            }
        }
        return stringBuilder.toString();
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = start; i < stop; i = i + step) {
            stringBuilder.append(i*i);
        }
        return stringBuilder.toString();
    }

    public static String getRange(int stop) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < stop; i++) {
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }

    public static String getRange(int start, int stop) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = start; i < stop; i++) {
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = start; i < stop; i = i + step) {
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = start; i < stop; i += step) {
            stringBuilder.append((int)Math.pow(i,exponent));
        }
        return stringBuilder.toString();
    }
}
