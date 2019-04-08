package com.codurance;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class ArabicNumeralConverterShould {


    @ParameterizedTest
    @MethodSource("arabicNumerals")
    void convert_roman_numeral_to_arabic(String romanNumeral, int arabicNumeral) {
        ArabicNumeralConverter arabicConverter = new ArabicNumeralConverter();
        int expectedNumeral = arabicConverter.convert(romanNumeral);

        assertThat(expectedNumeral).isEqualTo(arabicNumeral);
    }
    static Stream<Arguments> arabicNumerals() {
        return Stream.of(
                Arguments.arguments("I", "1"),
                Arguments.arguments("II", "2"),
                Arguments.arguments("III", "3"),
                Arguments.arguments("IV", "4"),
                Arguments.arguments("V", "5"),
                Arguments.arguments("VI", "6"),
                Arguments.arguments("VII", "7"),
                Arguments.arguments("VIII", "8"),
                Arguments.arguments("IX", "9"),
                Arguments.arguments("X", "10"),
                Arguments.arguments("XI", "11"),
                Arguments.arguments("XII", "12"),
                Arguments.arguments("XIII", "13"),
                Arguments.arguments("XX", "20")

        );
    }
}
