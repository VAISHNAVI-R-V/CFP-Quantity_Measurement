package com.measurements;

/**
 * purpose: to create enum of Weight toPerform as instance variable
 */
public enum Weight implements MeasurementUnits {
    GRAM(.001), KILOGRAM(1.0), TONNE(1000.0);
    /**
     * Instance Variable
     */
    private final double conversionValue;

    Weight(double convertToBaseUnit) {
        this.conversionValue = convertToBaseUnit;
    }

    /**
     * purpose: To override convertBaseUnit Method
     *
     * @param units takes the unit Weight value for conversion
     * @return converted unit weight value
     */
    @Override
    public double convertToBaseUnit(UnitMeasurementSystem units) {
        return (units.value * conversionValue);
    }
}
