package com.codurance;

import java.util.LinkedHashMap;

public class ArabicNumeralConverter {
    private LinkedHashMap<String, Integer> arabicList = new LinkedHashMap<>();

    public ArabicNumeralConverter() {
        arabicList.put("I", 1);
        arabicList.put("IV", 4);
        arabicList.put("V", 5);
        arabicList.put("VI", 6);
        arabicList.put("VII", 7);
        arabicList.put("VIII", 8);
    }

    public int convert(String romanNumeral) {
        if(arabicList.containsKey(romanNumeral)){
            return arabicList.get(romanNumeral);
        }

        String substring = romanNumeral.substring(0, romanNumeral.length() - 1);
        return 1 + convert(substring);
    }
}
