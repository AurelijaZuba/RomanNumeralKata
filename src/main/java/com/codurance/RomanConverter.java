package com.codurance;

public class RomanConverter {
    public String convert(int number) {

        String result = "I";
        if (number > 1) {
            result += "I";
        }
        if (number > 2) {
            result += "I";
        }

        return result;
    }
}
