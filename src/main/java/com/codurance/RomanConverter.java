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

    public String convert(int number) {
        if(romanList.containsKey(number)){
            return romanList.get(number);
        }

        var result = new StringBuilder();
        for (Map.Entry item : romanList.entrySet()) {
            while (number >= (int) item.getKey()) {
                var key = (int)item.getKey();
                var value = item.getValue();
                result.append(value);
                number -= key;
            }
        }

        return result.toString();
    }
}
