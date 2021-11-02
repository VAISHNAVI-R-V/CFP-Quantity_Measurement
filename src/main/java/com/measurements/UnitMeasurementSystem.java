package com.measurements;

import java.util.Objects;

/**
 * Purpose : To implement Quantity Measurement Program
 *
 * @author VAISHNAVI VISHWAKARMA
 * @since 2-11-2021
 */
public class UnitMeasurementSystem {

    // Instance Variables
    public double value;
    public MeasurementUnits unit;

    public UnitMeasurementSystem(double value, MeasurementUnits unit) {
        this.unit = unit;
        this.value = value;
    }

    /**
     * purpose: To compare the lengths.
     *
     * @param thatUnit it takes the length
     * @return value that is compared
     */
    public boolean compare(UnitMeasurementSystem thatUnit) {
        if (this.unit.equals((thatUnit)))
            return this.equals(thatUnit);
        return Double.compare(this.unit.convertToBaseUnit(this),
                thatUnit.unit.convertToBaseUnit(thatUnit)) == 0;
    }

    /**
     * purpose: to Add the values of that unit.
     *
     * @param thatUnit     takes the value of length as per unit
     * @param unitRequired takes the Enum values
     * @return Addition of values
     */
    public UnitMeasurementSystem add(UnitMeasurementSystem thatUnit, MeasurementUnits unitRequired) {
        double inputSum = this.unit.convertToBaseUnit(this) + thatUnit.unit.convertToBaseUnit(thatUnit);
        return new UnitMeasurementSystem(inputSum, unitRequired);
    }

    /**
     * purpose: to check equality of abject reference and object values
     *
     * @param o taking the Object class
     * @return checked values of objects
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitMeasurementSystem that = (UnitMeasurementSystem) o;
        return Double.compare(that.value, value) == 0 && Objects.equals(unit, that.unit);
    }

}
