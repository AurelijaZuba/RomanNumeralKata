package com.codurance;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RomanConverterShould {

    private final RomanConverter romanConverter;

    public RomanConverterShould() {

        romanConverter = new RomanConverter();
    }

    @ParameterizedTest
    @MethodSource("romanNumerals")
    void convert_number_to_roman(int number, String expected) {

        String actual = romanConverter.convert(number);

        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> romanNumerals() {
        return Stream.of(
                arguments("1", "I"),
                arguments("2", "II"),
                arguments("3", "III"),
                arguments("4", "IV"),
                arguments("5", "V"),
                arguments("6", "VI"),
                arguments("7", "VII"),
                arguments("8", "VIII"),
                arguments("9", "IX"),
                arguments("10", "X"),
                arguments("11", "XI"),
                arguments("12", "XII"),
                arguments("13", "XIII"),
                arguments("20", "XX")
        );
    }
}
