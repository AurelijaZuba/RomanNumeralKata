package com.codurance;


public class RomanConverter {
    private final String[] romanList = {"I", "II", "III", "IV"};

    public String convert(int number) {

        return romanList[number -1];
    }
}
