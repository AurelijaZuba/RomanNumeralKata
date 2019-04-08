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

        for (var item : arabicList.entrySet()){
            var key = item.getKey();
            var value = item.getValue();

            if(romanNumeral.startsWith(key)){
                romanNumeral = romanNumeral.substring(1);
                result += value;
            }
        }

        while(!romanNumeral.isEmpty()){
            romanNumeral = romanNumeral.substring(1);
            result += 1;
        }

        return result;
    }
}
