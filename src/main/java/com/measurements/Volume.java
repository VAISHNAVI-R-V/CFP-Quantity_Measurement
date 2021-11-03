package com.measurements;

/**
 * purpose: to create enum of Volume to Perform as instance variable
 */
public enum Volume implements MeasurementUnits {
    GALLON(3.78), LITRE(1.0), MILLILITRE(0.001);

    //  Instance variable
    private final double conversionValue;

    Volume(double conversionBaseUnit) {
        this.conversionValue = conversionBaseUnit;
    }

    /**
     * purpose: To override convertBaseUnit Method
     *
     * @param units takes the volume value for conversion
     * @return converted volume value
     */
    @Override
    public double convertToBaseUnit(UnitMeasurementSystem units) {
        return (units.value * conversionValue);
    }
}
