package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class LeapYearCheckTest {
    @ParameterizedTest()
    @ValueSource(ints = { 2017, 2019, 2021, 2023 })
    public void When_year_is_not_divisible_by_4_Then_they_are_not_leap_years(int year) {
        Assertions.assertFalse(new LeapYearCheck(year).isLeap());
    }

    @ParameterizedTest()
    @ValueSource(ints = { 2008, 2012, 2016 })
    public void When_year_is_divisible_by_4_Then_they_are_leap_years(int year) {
        Assertions.assertTrue(new LeapYearCheck(year).isLeap());
    }

    @ParameterizedTest()
    @ValueSource(ints = { 400, 800, 1200 })
    public void When_year_is_divisible_by_400_Then_they_are_leap_years(int year) {
        Assertions.assertTrue(new LeapYearCheck(year).isLeap());
    }

    @ParameterizedTest()
    @ValueSource(ints = { 1700, 1800, 1900 })
    public void When_year_is_divisible_by_100_and_not_by_400_Then_they_are_not_leap_years(int year) {
        Assertions.assertFalse(new LeapYearCheck(year).isLeap());
    }
}