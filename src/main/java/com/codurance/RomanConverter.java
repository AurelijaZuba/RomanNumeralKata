package com.codurance;

public class RomanConverter {
    public String convert(int number) {

        if(number > 1)
            return "II";
        return "I";
    }
}
