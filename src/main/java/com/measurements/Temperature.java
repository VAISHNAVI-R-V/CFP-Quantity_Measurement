package com.measurements;

import java.util.function.Function;

public enum Temperature implements MeasurementUnits {
    FAHRENHEIT(true), CELSIUS(false);
    final Function<Double, Double> degreeFahrenheitToCelsius = (Double degreeFahrenheit) ->
            (degreeFahrenheit - 32) * 5 / 9;
    final Function<Double, Double> degreeCelsiusToCelsius = (Double degreeCelsius) ->
            degreeCelsius;
    final Function<Double, Double> conversionValue;

    Temperature(boolean isFahrenheit) {
        if (isFahrenheit) this.conversionValue = degreeFahrenheitToCelsius;
        else this.conversionValue = degreeCelsiusToCelsius;
    }


    @Override
    public double convertToBaseUnit(UnitMeasurementSystem units) {
        return conversionValue.apply(units.value);
    }
}
