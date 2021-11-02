package com.measurements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given0FeetAnd0Feet_ShouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(0.0, Length.FEET);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(0.0, Length.FEET);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given_0FeetAndNullFeet_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(0.0, Length.FEET);
        UnitMeasurementSystem feet2 = null;
        Assertions.assertNotEquals(feet1, null);
    }

    @Test
    void given_0FeetAndReference1Feet_ShouldReturnNotEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(0.0, Length.FEET);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(1.0, Length.FEET);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given_Type0FeetAnd1Feet_ShouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(0.0, Length.FEET);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(1.0, Length.FEET);
        Assertions.assertEquals(feet1.getClass(), feet2.getClass());
    }

    @Test
    void given_Value0FeetAnd1Feet_ShouldReturnsNotEquals() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(0.0, Length.FEET);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(1.0, Length.FEET);
        Assertions.assertNotEquals(feet1, feet2);
    }

    @Test
    void given_0InchAnd0Inch_ShouldReturnEquals() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(0.0, Length.INCH);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(0.0, Length.INCH);
        Assertions.assertEquals(inch1, inch2);
    }

    @Test
    void given_0InchAnd1Inch_ShouldReturnNotEquals() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(0.0, Length.INCH);
        UnitMeasurementSystem inch2 = null;
        Assertions.assertNotEquals(inch1, null);
    }

    @Test
    void given_0InchAndReference1Inch_ShouldReturnNotEquals() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(0.0, Length.INCH);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(1.0, Length.INCH);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void given_Type0InchAndInch_ShouldReturnEquals() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(0.0, Length.INCH);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(1.0, Length.INCH);
        Assertions.assertEquals(inch1.getClass(), inch2.getClass());
    }

    @Test
    void given_Value0InchAnd1Inch_ShouldReturnNotEquals() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(0.0, Length.INCH);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(1.0, Length.INCH);
        Assertions.assertNotEquals(inch1, inch2);
    }

    @Test
    void given_1FeetAnd12Inch_Compared_ShouldReturnEqual() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(1.0, Length.FEET);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(1.0, Length.INCH);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given_3FeetAnd1Yard_Compared_ShouldReturnEquals() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(3.0, Length.FEET);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(1.0, Length.YARD);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given_1FeetAnd1Yard_Compared_ShouldReturnNotEquals() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(1.0, Length.FEET);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(1.0, Length.YARD);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given_36InchAnd1Yard_Compared_ShouldReturnEquals() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(36.0, Length.INCH);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(1.0, Length.YARD);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given_1InchAnd1Yard_Compared_ShouldReturnNotEquals() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(1.0, Length.INCH);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(1.0, Length.YARD);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given_1YardAnd3Feet_Compared_ShouldReturnEquals() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(1.0, Length.FEET);
        UnitMeasurementSystem yard = new UnitMeasurementSystem(1.0, Length.YARD);
        boolean compareCheck = yard.compare(feet);
        Assertions.assertFalse(compareCheck);
    }
}