package com.codurance;

import java.util.LinkedHashMap;

public class ArabicNumeralConverter {
    private LinkedHashMap<String, Integer> arabicList = new LinkedHashMap<>();

    public ArabicNumeralConverter() {
        arabicList.put("X", 10);
        arabicList.put("IX", 9);
        arabicList.put("V", 5);
        arabicList.put("IV", 4);
        arabicList.put("I", 1);
    }

    public int convert(String romanNumeral) {
        if (arabicList.containsKey(romanNumeral)) {
            return arabicList.get(romanNumeral);
        }
        var result = 0;

        while (!romanNumeral.isEmpty()) {
            for (var item : arabicList.entrySet()) {
                if (romanNumeral.startsWith(item.getKey())) {
                    romanNumeral = romanNumeral.substring(1);
                    result += item.getValue();
                }
            }
        }

        return result;
    }
}
