package com.android.androidunittestingandtestdrivendevelopment;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PositiveNumberValidatorTest {
    PositiveNumberValidator systemUnderTest;

    @Before
    public void setup() {
        systemUnderTest = new PositiveNumberValidator();
    }

    @Test
    public void isTheNumberPositive() {
        boolean result = systemUnderTest.isPositive(-1);
        Assert.assertFalse(String.valueOf(result), false);
    }

    @Test
    public void isZero() {
        boolean result = systemUnderTest.isPositive(0);
        Assert.assertFalse(String.valueOf(result), false);
    }

    @Test
    public void validatingThePositive() {
        boolean result = systemUnderTest.isPositive(1);
        Assert.assertTrue(String.valueOf(result), true);
    }
}