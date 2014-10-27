package com.github.lyndaoleary;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void factorial_of_1_is_1() throws Exception {
        // Given
        int input = 1;

        // When
        int output = Factorial.factorial(input);

        // Then
        assertThat(output, is(1));
    }

    @Test
    public void factorial_of_2_is_2() throws Exception {
        // Given
        int input = 2;

        // When
        int output = Factorial.factorial(input);

        // Then
        assertThat(output, is(2));
    }

    @Test
    public void factorial_of_3_is_6() throws Exception {
        // Given
        int input = 3;

        // When
        int output = Factorial.factorial(input);

        // Then
        assertThat(output, is(6));
    }

    @Test
    public void factorial_of_4_is_30() throws Exception {
        // Given
        int input = 4;

        // When
        int output = Factorial.factorial(input);

        // Then
        assertThat(output, is(24));
    }

    @Test
    public void factorial_of_5_is_120() throws Exception {
        // Given
        int input = 5;

        // When
        int output = Factorial.factorial(input);

        // Then
        assertThat(output, is(120));
    }
}