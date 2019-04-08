package com.codurance;


import java.util.HashMap;

public class RomanConverter {
    private final HashMap<Integer, String> romanList = new HashMap();

    public RomanConverter() {
        romanList.put(1, "I");
        romanList.put(4, "IV");
        romanList.put(5, "V");
        romanList.put(9, "IX");
        romanList.put(10, "X");
    }

    public String convert(int number) {
        if(romanList.containsKey(number)){
            return romanList.get(number);
        }

        var result = new StringBuilder();
        while(number >= 10) {
            result.append("X");
            number -= 10;
        }

        while(number >= 5) {
            result.append("V");
            number -= 5;
        }

        while(number >= 1) {
            result.append("I");
            number -= 1;
        }

        return result.toString();
    }
}
