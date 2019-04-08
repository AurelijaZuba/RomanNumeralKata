package com.codurance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
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
                arguments("2", "II")
        );
    }
}
