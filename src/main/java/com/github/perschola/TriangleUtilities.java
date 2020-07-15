package com.github.perschola;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 1; i <= numberOfRows; i++) {
            stringBuilder.append(getRow(i) + "\n");
        }
        return stringBuilder.toString();
    }

    public static String getRow(int numberOfStars) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < numberOfStars; i++) {
            stringBuilder.append("*");
        }
        return stringBuilder.toString();
    }

    public static String getSmallTriangle() {

        return getTriangle(4);
    }

    public static String getLargeTriangle() {

        return getTriangle(9);
    }
}
