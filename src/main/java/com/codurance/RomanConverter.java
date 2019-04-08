package com.codurance;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanConverter {
    private final LinkedHashMap<Integer, String> romanList = new LinkedHashMap<>();

    public RomanConverter() {
        romanList.put(10, "X");
        romanList.put(9, "IX");
        romanList.put(5, "V");
        romanList.put(4, "IV");
        romanList.put(1, "I");
    }

    public String convert(int arabicNumeral) {
        if(romanList.containsKey(arabicNumeral)){
            return romanList.get(arabicNumeral);
        }

        var romanNumeralBuilder = new StringBuilder();
        for (var item : romanList.entrySet()) {
            while (arabicNumeral >= item.getKey()) {
                romanNumeralBuilder.append(item.getValue());
                arabicNumeral -= item.getKey();
            }
        }

        return romanNumeralBuilder.toString();
    }
}
