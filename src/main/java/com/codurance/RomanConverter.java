package com.codurance;


import java.util.HashMap;

public class RomanConverter {
    private final HashMap<Integer, String> romanList = new HashMap();
    ;

    public RomanConverter() {

        romanList.put(1, "I");
        romanList.put(4, "IV");
    }

    public String convert(int number) {

        if(romanList.containsKey(number)){

            return romanList.get(number);
        }

        return "I" + convert(number - 1);
    }
}
