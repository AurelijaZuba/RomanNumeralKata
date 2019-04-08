package com.codurance;


public class RomanConverter {
    private final String[] numberlist = {"I", "II", "III"};

    public String convert(int number) {

        return numberlist[number -1];
    }
}
