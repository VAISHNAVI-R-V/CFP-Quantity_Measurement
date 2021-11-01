package com.measurements;

import java.util.Objects;

/**
 * @author VAISHNAVI VISHWAKARMA
 * @Purpose : To implement Quantity Measurement Program.
 * @since 31-10-2021
 */
public class Feet {

    private final double value;

    public Feet(double value) {
        this.value = value;
    }

    // generated override method.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }

    /**
     * @return value
     */
    public double feetToInch() {
        return value * 12;
    }

    /**
     *
     * @return value
     */
    public double feetTOYard() {
        return value / 3;
    }
}
