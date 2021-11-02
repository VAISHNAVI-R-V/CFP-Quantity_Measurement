package com.measurements;

public enum Length implements MeasurementUnits {
    FEET(12.0),INCH(1.0), YARD(36.0), CENTIMETER(0.4);

    private final double convertionValue;
   // private final double convertToBaseUnit;

    Length(double convertToBaseUnit) {
        this.convertionValue = convertToBaseUnit;
    }

    @Override
    public double convertToBaseUnit(UnitMeasurementSystem unit) {
        return (unit.value * convertionValue);
    }
}
