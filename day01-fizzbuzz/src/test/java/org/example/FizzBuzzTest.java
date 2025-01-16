package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private final FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void Given1_WhenFizzBuzzConvert_ThenItShouldReturn1() {

        assertEquals("1", fizzBuzz.convert(1));
    }

}