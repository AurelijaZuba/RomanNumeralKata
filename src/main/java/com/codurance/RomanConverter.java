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
        romanList.put(20, "XX");
    }

    public String convert(int number) {
        if(romanList.containsKey(number)){
            return romanList.get(number);
        }

        if(number > 5) {
            return "V" + convert(number - 5);
        }

        return "I" + convert(number - 1);
    }
}
