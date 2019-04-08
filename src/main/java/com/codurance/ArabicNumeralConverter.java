package com.codurance;

import java.util.LinkedHashMap;

public class ArabicNumeralConverter {
    private LinkedHashMap<String, Integer> arabicList = new LinkedHashMap<>();

    public ArabicNumeralConverter() {
        arabicList.put("I", 1);
        arabicList.put("II", 2);
        arabicList.put("III", 3);
        arabicList.put("IV", 4);
    }

    public int convert(String romanNumeral) {
        return arabicList.get(romanNumeral);

    }
}
