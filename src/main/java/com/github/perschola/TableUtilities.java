package com.github.perschola;

public class TableUtilities {

    public static String getSmallMultiplicationTable() {

        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {

        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 1; i <= tableSize; i++) {
            stringBuilder.append(getOneLineOfMultiplicationTable(i, tableSize, i));
        }
        return stringBuilder.toString();
    }

    public static String getPaddedString(int i) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (i < 10)
            stringBuilder.append("  " + i + " |");
        else if (i >= 10 && i <= 99)
            stringBuilder.append(" " + i + " |");
        else
            stringBuilder.append("" + i + " |");
        return stringBuilder.toString();
    }
    public static String getOneLineOfMultiplicationTable(int start, int size, int step) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = start; i <= size*step; i += step) {
            stringBuilder.append(getPaddedString(i));
        }
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }
}
