package com.qa;

public class Factorialv2 {

    public static String reverseFact(float num) {
        int count = 1;
        while (num > 1) num /= ++count;
        return num == 1 ? count + "!" : "NONE";
    }
}