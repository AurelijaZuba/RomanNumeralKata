package com.codurance;


import java.util.HashMap;

public class RomanConverter {
    private final HashMap<Integer, String> romanList = new HashMap();
    ;

    public RomanConverter() {

        romanList.put(1, "I");
        romanList.put(2, "II");
        romanList.put(3, "III");
        romanList.put(4, "IV");
    }

    public String convert(int number) {

        return romanList.get(number);
    }
}
