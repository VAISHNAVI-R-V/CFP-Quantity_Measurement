package com.measurements;

/**
 * Purpose : To implement Quantity Measurement Program.
 *
 * @author VAISHNAVI VISHWAKARMA
 * @since 2-11-2021
 */
public enum Length implements MeasurementUnits {
    FEET(12.0), INCH(1.0), YARD(36.0), CENTIMETER(0.4);

    //  Instance variable
    private final double conversionValue;

    /**
     * @param convertToBaseUnit to Convert values
     */
    Length(double convertToBaseUnit) {
        this.conversionValue = convertToBaseUnit;
    }

    /**
     * purpose: To override convertBaseUnit Method
     *
     * @param unit takes the Length value for conversion
     * @return converted Length value
     */
    @Override
    public double convertToBaseUnit(UnitMeasurementSystem unit) {
        return (unit.value * conversionValue);
    }
}
