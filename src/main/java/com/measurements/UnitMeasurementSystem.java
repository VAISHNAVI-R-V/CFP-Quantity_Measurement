package com.measurements;

import java.util.Objects;

public class UnitMeasurementSystem {
    public double value;
    public MeasurementUnits unit;

    public UnitMeasurementSystem(double value, MeasurementUnits unit) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(UnitMeasurementSystem thatUnit) {
        if (this.unit.equals((thatUnit)))
            return this.equals(thatUnit);
        return Double.compare(this.unit.convertToBaseUnit(this),
                thatUnit.unit.convertToBaseUnit(thatUnit)) == 0;
    }

    public UnitMeasurementSystem add(UnitMeasurementSystem thatUnit, MeasurementUnits unitRequired) {
        double inputSum = this.unit.convertToBaseUnit(this) + thatUnit.unit.convertToBaseUnit(thatUnit);
        return new UnitMeasurementSystem(inputSum, unitRequired);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UnitMeasurementSystem that = (UnitMeasurementSystem) o;
        return Double.compare(that.value, value) == 0 && Objects.equals(unit, that.unit);
    }

}
