package com.qa;

public class Factorial {

    public static String findFact(int number) {
        String result = "";
        int divisor = 2;
        int dividend = number;


        if (number == 0 || number == 1) {
            result = "1";
            return "Factorial of " + number + ": " + result + "!";
        } else if (number == 2) {
            result = "2";
            return "Factorial of " + number + ": " + result + "!";
        } else if (number > 2){
                while (number % divisor == 0 && dividend >= divisor) {
                    result = Integer.toString(divisor);
                    dividend /= divisor;
                    divisor++;
                    }
                if (result.equals("2") || result.equals("")) {return "Factorial of " + number + ": NONE";}
                else { return "Factorial of " + number + ": " + result + "!"; }
        } else {
        return "Factorial of " + number + ": NONE";
    }}}
