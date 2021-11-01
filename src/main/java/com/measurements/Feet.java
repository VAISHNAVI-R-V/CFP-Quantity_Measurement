package com.measurements;

import java.util.Objects;

/**
 * @Purpose : To implement Quantity Measurement Program.
 *
 * @author VAISHNAVI VISHWAKARMA
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
     *
     * @return 0
     */
    public double feetToInch() {
        return 0;
    }


}
