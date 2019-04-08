package com.codurance;


public class RomanConverter {
    private final String[] numberList = {"I", "II", "III", "IV"};

    public String convert(int number) {

        return numberList[number -1];
    }
}
