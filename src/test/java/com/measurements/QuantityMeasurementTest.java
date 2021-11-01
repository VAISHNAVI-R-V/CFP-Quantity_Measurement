package com.measurements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given_0FeetAndNullFeet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assertions.assertNotEquals(feet1, null);
    }

    @Test
    void given_0FeetAndReference1Feet_ShouldReturnNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given_Type0FeetAnd1Feet_ShouldReturnEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    void given_Value0FeetAnd1Feet_ShouldReturnsNotEquals() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given_0InchAnd0Inch_ShouldReturnEquals() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given_0InchAnd1Inch_ShouldReturnNotEquals() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = null;
        Assertions.assertNotEquals(inch1, null);
    }

    @Test
    void given_0InchAndReference1Inch_ShouldReturnNotEquals() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void given_Type0InchAndInch_ShouldReturnEquals() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    void given_Value0InchAnd1Inch_ShouldReturnNotEquals() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void given_1FeetAnd12Inch_Compared_ShouldReturnEqual() {
        Feet feet = new Feet(1.0);
        double actualResults = feet.feetToInch();
        Assertions.assertEquals(12, actualResults);
    }

    @Test
    void given_3FeetAnd1Yard_Compared_ShouldReturnEqualS() {
        Feet feet = new Feet(3.0);
        double actualResults = feet.feetTOYard();
        Assertions.assertEquals(1, actualResults);
    }

    @Test
    void given_1FeetAnd1Yard_Compared_ShouldReturnNotEqualS() {
        Feet feet = new Feet(1.0);
        double actualResults = feet.feetTOYard();
        Assertions.assertNotEquals(1, actualResults);
    }

}
