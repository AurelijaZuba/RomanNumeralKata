package com.codurance;

import java.util.LinkedHashMap;

public class ArabicNumeralConverter {
    private LinkedHashMap<String, Integer> arabicList = new LinkedHashMap<>();

    public ArabicNumeralConverter() {
        arabicList.put("I", 1);
        arabicList.put("IV", 4);
        arabicList.put("V", 5);
    }

    public int convert(String romanNumeral) {
        if (arabicList.containsKey(romanNumeral)) {
            return arabicList.get(romanNumeral);
        }

        if (romanNumeral.startsWith("V")) {
            String substring = romanNumeral.substring(1);
            return 5 + convert(substring);
        }

        String substring = romanNumeral.substring(0, romanNumeral.length() - 1);
        return 1 + convert(substring);
    }
}
