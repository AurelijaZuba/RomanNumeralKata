package com.codurance;

import java.util.LinkedHashMap;

public class ArabicNumeralConverter {
    private LinkedHashMap<String, Integer> arabicList = new LinkedHashMap<>();

    public ArabicNumeralConverter() {
        arabicList.put("I", 1);
        arabicList.put("IV", 4);
        arabicList.put("V", 5);
        arabicList.put("IX", 9);
        arabicList.put("X", 10);
    }

    public int convert(String romanNumeral) {
        if (arabicList.containsKey(romanNumeral)) {
            return arabicList.get(romanNumeral);
        }
        var result = 0;

        if (romanNumeral.startsWith("X")) {
            romanNumeral = romanNumeral.substring(1);
            result += 10;
        }

        if (romanNumeral.startsWith("V")) {
            romanNumeral = romanNumeral.substring(1);
            result += 5;
        }

        while(!romanNumeral.isEmpty()){
            romanNumeral = romanNumeral.substring(1);
            result += 1;
        }

        return result;
    }
}
