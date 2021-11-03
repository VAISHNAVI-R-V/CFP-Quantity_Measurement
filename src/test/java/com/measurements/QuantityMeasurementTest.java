package com.measurements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementTest {
    @Test
    void given_0FeetAnd0Feet_ShouldReturnEqual() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(0.0, Length.FEET);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(0.0, Length.FEET);
        Assertions.assertEquals(feet1, feet2);
    }

    @Test
    void given__0FeetAndNullFeet_ShouldReturnNotEqual() {
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

    @Test
    void given_Value0CentimeterAnd1Centimeter_ShouldReturnNotEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(0.0, Length.CENTIMETER);
        UnitMeasurementSystem centimeter2 = new UnitMeasurementSystem(1.0, Length.CENTIMETER);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void given_0CentimeterAndNullCentimeter_ShouldReturnNotEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(0.0, Length.CENTIMETER);
        UnitMeasurementSystem centimeter2 = null;
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void given_Reference0CentimeterAnd1Centimeter_ShouldReturnNotEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(0.0, Length.CENTIMETER);
        UnitMeasurementSystem centimeter2 = new UnitMeasurementSystem(1.0, Length.CENTIMETER);
        Assertions.assertNotEquals(centimeter1, centimeter2);
    }

    @Test
    void given_Type0CentimeterAnd1Centimeter_ShouldReturnEqual() {
        UnitMeasurementSystem centimeter1 = new UnitMeasurementSystem(0.0, Length.CENTIMETER);
        UnitMeasurementSystem centimeter2 = new UnitMeasurementSystem(1.0, Length.CENTIMETER);
        Assertions.assertEquals(centimeter1.getClass(), centimeter2.getClass());
    }

    @Test
    void given_2InchAnd5Centimeter_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(2.0, Length.INCH);
        UnitMeasurementSystem centimeter = new UnitMeasurementSystem(5.0, Length.CENTIMETER);
        boolean compareCheck = inch.compare(centimeter);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given_5CentimeterAnd2Inch_WhenCompared_ShouldReturnEqualLength() {
        UnitMeasurementSystem centimeter = new UnitMeasurementSystem(5.0, Length.CENTIMETER);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(2.0, Length.INCH);
        boolean compareCheck = centimeter.compare(inch);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given_2InchAnd2Inch_WhenAdded_ShouldReturn4Inch() {
        UnitMeasurementSystem inch1 = new UnitMeasurementSystem(2.0, Length.INCH);
        UnitMeasurementSystem inch2 = new UnitMeasurementSystem(2.0, Length.INCH);
        UnitMeasurementSystem actualValue = inch1.add(inch2, Length.INCH);
        UnitMeasurementSystem expectedValue = new UnitMeasurementSystem(4.0, Length.INCH);
        Assertions.assertEquals(actualValue, expectedValue);
    }

    @Test
    void given1FeetAnd2Inch_WhenAdded_ShouldReturn14Inch() {
        UnitMeasurementSystem feet = new UnitMeasurementSystem(1.0, Length.FEET);
        UnitMeasurementSystem inch = new UnitMeasurementSystem(2.0, Length.INCH);
        UnitMeasurementSystem actualValue = feet.add(inch, Length.INCH);
        UnitMeasurementSystem expectedValue = new UnitMeasurementSystem(14.0, Length.INCH);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given1FeetAnd1Feet_WhenAdded_ShouldReturn24Inch() {
        UnitMeasurementSystem feet1 = new UnitMeasurementSystem(1.0, Length.FEET);
        UnitMeasurementSystem feet2 = new UnitMeasurementSystem(1.0, Length.FEET);
        UnitMeasurementSystem actualValue = feet1.add(feet2, Length.INCH);
        UnitMeasurementSystem expectedValue = new UnitMeasurementSystem(24.0, Length.INCH);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given2InchAnd2Point5Centimeter_WhenAdded_ShouldReturn3Inch() {
        UnitMeasurementSystem inch = new UnitMeasurementSystem(2.0, Length.INCH);
        UnitMeasurementSystem centimeter = new UnitMeasurementSystem(2.5, Length.CENTIMETER);
        UnitMeasurementSystem actualValue = inch.add(centimeter, Length.INCH);
        UnitMeasurementSystem expectedValue = new UnitMeasurementSystem(3.0, Length.INCH);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given0GramAnd0Gram_ShouldReturnEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(0.0, Weight.GRAM);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(0.0, Weight.GRAM);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    void givenValue0GramAnd1Gram_ShouldReturnNotEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(0.0, Weight.GRAM);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(1.0, Weight.GRAM);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void given0GramAndNullGram_ShouldReturnNotEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(0.0, Weight.GRAM);
        UnitMeasurementSystem gram2 = null;
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void givenReference0GramAnd1Gram_ShouldReturnNotEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(0.0, Weight.GRAM);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(1.0, Weight.GRAM);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    void givenType0GramAnd1Gram_ShouldReturnEqual() {
        UnitMeasurementSystem gram1 = new UnitMeasurementSystem(0.0, Weight.GRAM);
        UnitMeasurementSystem gram2 = new UnitMeasurementSystem(1.0, Weight.GRAM);
        Assertions.assertEquals(gram1.getClass(), gram2.getClass());
    }

    @Test
    void given0KilogramAnd0Kilogram_ShouldReturnEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(0.0, Weight.KILOGRAM);
        UnitMeasurementSystem kilogram2 = new UnitMeasurementSystem(0.0, Weight.KILOGRAM);
        Assertions.assertEquals(kilogram1, kilogram2);
    }

    @Test
    void givenValue0KilogramAnd1Kilogram_ShouldReturnNotEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(0.0, Weight.KILOGRAM);
        UnitMeasurementSystem kilogram2 = new UnitMeasurementSystem(1.0, Weight.KILOGRAM);
        Assertions.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    void given0KilogramAndNullKilogram_ShouldReturnNotEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(0.0, Weight.KILOGRAM);
        UnitMeasurementSystem kilogram2 = null;
        Assertions.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    void givenReference0KilogramAnd1Kilogram_ShouldReturnNotEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(0.0, Weight.KILOGRAM);
        UnitMeasurementSystem kilogram2 = new UnitMeasurementSystem(1.0, Weight.KILOGRAM);
        Assertions.assertNotEquals(kilogram1, kilogram2);
    }

    @Test
    void givenType0KilogramAnd1Kilogram_ShouldReturnEqual() {
        UnitMeasurementSystem kilogram1 = new UnitMeasurementSystem(0.0, Weight.KILOGRAM);
        UnitMeasurementSystem kilogram2 = new UnitMeasurementSystem(1.0, Weight.KILOGRAM);
        Assertions.assertEquals(kilogram1.getClass(), kilogram2.getClass());
    }

    @Test
    void given0TonneAnd0Tonne_ShouldReturnEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(0.0, Weight.TONNE);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(0.0, Weight.TONNE);
        Assertions.assertEquals(tonne1, tonne2);
    }

    @Test
    void givenValue0TonneAnd1Tonne_ShouldReturnNotEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(0.0, Weight.TONNE);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(1.0, Weight.TONNE);
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    @Test
    void given0TonneAndNullTonne_ShouldReturnNotEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(0.0, Weight.TONNE);
        UnitMeasurementSystem tonne2 = null;
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    @Test
    void givenReference0TonneAnd1Tonne_ShouldReturnNotEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(0.0, Weight.TONNE);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(1.0, Weight.TONNE);
        Assertions.assertNotEquals(tonne1, tonne2);
    }

    @Test
    void givenType0TonneAnd1Tonne_ShouldReturnEqual() {
        UnitMeasurementSystem tonne1 = new UnitMeasurementSystem(0.0, Weight.TONNE);
        UnitMeasurementSystem tonne2 = new UnitMeasurementSystem(1.0, Weight.TONNE);
        Assertions.assertEquals(tonne1.getClass(), tonne2.getClass());
    }

    @Test
    void given1KilogramAnd1000Gram_WhenCompared_ShouldReturnEqualWeight() {
        UnitMeasurementSystem kilogram = new UnitMeasurementSystem(1.0, Weight.KILOGRAM);
        UnitMeasurementSystem gram = new UnitMeasurementSystem(1000.0, Weight.GRAM);
        boolean compareCheck = kilogram.compare(gram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000GramAnd1Kilogram_WhenCompared_ShouldReturnEqualWeight() {
        UnitMeasurementSystem gram = new UnitMeasurementSystem(1000.0, Weight.GRAM);
        UnitMeasurementSystem kilogram = new UnitMeasurementSystem(1.0, Weight.KILOGRAM);
        boolean compareCheck = gram.compare(kilogram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1TonneAnd1000Kilogram_WhenCompared_ShouldReturnEqualWeight() {
        UnitMeasurementSystem tonne = new UnitMeasurementSystem(1.0, Weight.TONNE);
        UnitMeasurementSystem kilogram = new UnitMeasurementSystem(1000.0, Weight.KILOGRAM);
        boolean compareCheck = tonne.compare(kilogram);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000KilogramAnd1Tonne_WhenCompared_ShouldReturnEqualWeight() {
        UnitMeasurementSystem kilogram = new UnitMeasurementSystem(1000.0, Weight.KILOGRAM);
        UnitMeasurementSystem tonne = new UnitMeasurementSystem(1.0, Weight.TONNE);
        boolean compareCheck = kilogram.compare(tonne);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1TonneAnd1000Gram_WhenAdded_ShouldReturn1001Kilogram() {
        UnitMeasurementSystem tonne = new UnitMeasurementSystem(1.0, Weight.TONNE);
        UnitMeasurementSystem gram = new UnitMeasurementSystem(1000.0, Weight.GRAM);
        UnitMeasurementSystem actualValue = tonne.add(gram, Weight.KILOGRAM);
        UnitMeasurementSystem expectedValue = new UnitMeasurementSystem(1001.0, Weight.KILOGRAM);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given0GallonAnd0Gallon_ShouldReturnEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(0.0, Volume.GALLON);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(0.0, Volume.GALLON);
        Assertions.assertEquals(gallon1, gallon2);
    }

    @Test
    void givenValue0GallonAnd1Gallon_ShouldReturnNotEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(0.0, Volume.GALLON);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(1.0, Volume.GALLON);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void given0GallonAndNullGallon_ShouldReturnNotEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(0.0, Volume.GALLON);
        UnitMeasurementSystem gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void givenReference0GallonAnd1Gallon_ShouldReturnNotEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(0.0, Volume.GALLON);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(1.0, Volume.GALLON);
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    @Test
    void givenType0GallonAnd1Gallon_ShouldReturnEqual() {
        UnitMeasurementSystem gallon1 = new UnitMeasurementSystem(0.0, Volume.GALLON);
        UnitMeasurementSystem gallon2 = new UnitMeasurementSystem(1.0, Volume.GALLON);
        Assertions.assertEquals(gallon1.getClass(), gallon2.getClass());
    }

    @Test
    void given0LitreAnd0Litre_ShouldReturnEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(0.0, Volume.LITRE);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(0.0, Volume.LITRE);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    void givenValue0LitreAnd1Litre_ShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(0.0, Volume.LITRE);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(1.0, Volume.LITRE);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    void given0LitreAndNullLitre_ShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(0.0, Volume.LITRE);
        UnitMeasurementSystem litre2 = null;
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    void givenReference0LitreAnd1Litre_ShouldReturnNotEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(0.0, Volume.LITRE);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(1.0, Volume.LITRE);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    void givenType0LitreAnd1Litre_ShouldReturnEqual() {
        UnitMeasurementSystem litre1 = new UnitMeasurementSystem(0.0, Volume.LITRE);
        UnitMeasurementSystem litre2 = new UnitMeasurementSystem(1.0, Volume.LITRE);
        Assertions.assertEquals(litre1.getClass(), litre2.getClass());
    }

    @Test
    void given0MillilitreAnd0Millilitre_ShouldReturnEqual() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(0.0, Volume.MILLILITRE);
        UnitMeasurementSystem millilitre2 = new UnitMeasurementSystem(0.0, Volume.MILLILITRE);
        Assertions.assertEquals(millilitre1, millilitre2);
    }

    @Test
    void givenValue0MillilitreAnd1Millilitre_ShouldReturnNotEqual() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(0.0, Volume.MILLILITRE);
        UnitMeasurementSystem millilitre2 = new UnitMeasurementSystem(1.0, Volume.MILLILITRE);
        Assertions.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    void given0MillilitreAndNullMillilitre_ShouldReturnNotEqual() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(0.0, Volume.MILLILITRE);
        UnitMeasurementSystem millilitre2 = null;
        Assertions.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    void givenReference0MillilitreAnd1Millilitre_ShouldReturnNotEqual() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(0.0, Volume.MILLILITRE);
        UnitMeasurementSystem millilitre2 = new UnitMeasurementSystem(1.0, Volume.MILLILITRE);
        Assertions.assertNotEquals(millilitre1, millilitre2);
    }

    @Test
    void givenType0MillilitreAnd1Millilitre_ShouldReturnEqual() {
        UnitMeasurementSystem millilitre1 = new UnitMeasurementSystem(0.0, Volume.MILLILITRE);
        UnitMeasurementSystem millilitre2 = new UnitMeasurementSystem(1.0, Volume.MILLILITRE);
        Assertions.assertEquals(millilitre1.getClass(), millilitre2.getClass());
    }

    @Test
    void given0GallonAnd0Litre_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(0.0, Volume.GALLON);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(0.0, Volume.LITRE);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0GallonAnd1Litre_WhenCompared_ShouldReturnNotEqualVolume() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(0.0, Volume.GALLON);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(1.0, Volume.LITRE);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    void given1GallonAnd3Point78Litre_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(1.0, Volume.GALLON);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(3.78, Volume.LITRE);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given3Point78LitreAnd1Gallon_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(3.78, Volume.LITRE);
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(1.0, Volume.GALLON);
        boolean compareCheck = litre.compare(gallon);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given0LitreAnd0Millilitre_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(0.0, Volume.LITRE);
        UnitMeasurementSystem millilitre = new UnitMeasurementSystem(0.0, Volume.MILLILITRE);
        boolean compareCheck = litre.compare(millilitre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1LitreAnd1000Millilitre_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(1.0, Volume.LITRE);
        UnitMeasurementSystem millilitre = new UnitMeasurementSystem(1000.0, Volume.MILLILITRE);
        boolean compareCheck = litre.compare(millilitre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1000MillilitreAnd1Litre_WhenCompared_ShouldReturnEqualVolume() {
        UnitMeasurementSystem millilitre = new UnitMeasurementSystem(1000.0, Volume.MILLILITRE);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(1.0, Volume.LITRE);
        boolean compareCheck = millilitre.compare(litre);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    void given1GallonAnd3Point78Litre_WhenAdded_ShouldReturn7Point57Litre() {
        UnitMeasurementSystem gallon = new UnitMeasurementSystem(1.0, Volume.GALLON);
        UnitMeasurementSystem litre = new UnitMeasurementSystem(3.78, Volume.LITRE);
        UnitMeasurementSystem actualValue = gallon.add(litre, Volume.LITRE);
        UnitMeasurementSystem expectedValue = new UnitMeasurementSystem(7.56, Volume.LITRE);
        Assertions.assertEquals(expectedValue, actualValue);
    }

    @Test
    void given1LitreAnd1000Millilitre_WhenAdded_ShouldReturn2Litre() {
        UnitMeasurementSystem litre = new UnitMeasurementSystem(1.0, Volume.LITRE);
        UnitMeasurementSystem millilitre = new UnitMeasurementSystem(1000.0, Volume.MILLILITRE);
        UnitMeasurementSystem actualValue = litre.add(millilitre, Volume.LITRE);
        UnitMeasurementSystem expectedValue = new UnitMeasurementSystem(2.0, Volume.LITRE);
        Assertions.assertEquals(expectedValue, actualValue);
    }
}