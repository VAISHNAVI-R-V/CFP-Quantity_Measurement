package com.measurements;

import java.util.Objects;

public class Yard {
    private final double value;

    /**
     *
     * @param value
     */
    public Yard(double value) {
        this.value = value;
    }

    // generated override method.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Yard yard = (Yard) o;
        return Double.compare(yard.value, value) == 0;
    }
}
