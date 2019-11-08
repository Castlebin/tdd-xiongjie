package com.heller.tdd.task1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import task1.GameNumer;

public class GameNumerTest {
/*

    @ParameterizedTest(name = "given {0} should return {1}")
    @CsvSource({
            "-1, '-1'",
            "1, '1'",
            "2, '2'",
            "4, '4'",
            "8, '8'",
    })
    public void testReturnRawNumForNormalNumbers(int num, String result) {
        testToString(num, result);
    }

    @ParameterizedTest(name = "given {0} should return {1}")
    @CsvSource({
            "3, 'Fizz'",
            "13, 'Fizz'",
    })
    public void testReturnFizzForNumbersRelatedTo3(int num, String result) {
        testToString(num, result);
    }

    @ParameterizedTest(name = "given {0} should return {1}")
    @CsvSource({
            "5, 'Buzz'",
            "55, 'Buzz'",
    })
    public void testReturnFizzForNumbersRelatedTo5(int num, String result) {
        testToString(num, result);
    }

    @ParameterizedTest(name = "given {0} should return {1}")
    @CsvSource({
            "15, 'FizzBuzz'",
            "35, 'FizzBuzz'",
            "335, 'FizzBuzz'",
            "355, 'FizzBuzz'"
    })
    public void testReturnFizzForNumbersRelatedTo3And5(int num, String result) {
        testToString(num, result);
    }
*/

    @ParameterizedTest(name = "given {0} should return {1}")
    @CsvSource({
            // testReturnRawNumForNormalNumbers
            "-1, '-1'",
            "1, '1'",
            "2, '2'",
            "4, '4'",
            "8, '8'",

            // testReturnFizzForNumbersRelatedTo3
            "3, 'Fizz'",
            "13, 'Fizz'",

            // testReturnFizzForNumbersRelatedTo5
            "5, 'Buzz'",
            "55, 'Buzz'",

            // testReturnFizzForNumbersRelatedTo3And5
            "15, 'FizzBuzz'",
            "35, 'FizzBuzz'",
            "335, 'FizzBuzz'",
            "355, 'FizzBuzz'"
    })
    public void testGameNumerToString(int num, String result) {
        testToString(num, result);
    }

    private void testToString(int num, String result) {
        Assertions.assertEquals(result, new GameNumer(num).toString());
    }

}
