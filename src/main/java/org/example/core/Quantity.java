package org.example.core;

/**
 * Represents a value stored internally in base units.
 */
public class Quantity<D extends Dimension> {

    private final double baseValue;

    public Quantity(double value, Unit<D> unit) {
        this.baseValue = unit.toBase(value);
    }

    public double to(Unit<D> target) {
        return target.fromBase(baseValue);
    }
}