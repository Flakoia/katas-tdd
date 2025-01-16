package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class LeapYearCheckTest {

    private final LeapYearCheck leapYearCheck = new LeapYearCheck();

    @ParameterizedTest
    @ValueSource(ints = {1600, 2000, 2400})
    void GivenAYearDivisibleBy400_WhenIsLeapYear_ThenItShouldReturnTrue(int year) {
        Assertions.assertTrue(leapYearCheck.isLeapYear(year));
    }

}