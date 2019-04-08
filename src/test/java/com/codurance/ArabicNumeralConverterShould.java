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
                Arguments.arguments("II", "2")

        );
    }
}
