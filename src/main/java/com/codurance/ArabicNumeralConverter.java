package com.codurance;

public class ArabicNumeralConverter {
    public int convert(String romanNumeral) {
        var result = 1;
        if(romanNumeral.length() > 1)
        {
            result += 1;
        }
        return result;
    }
}
