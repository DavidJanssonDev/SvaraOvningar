package org.example.core;

/**
 * Represents a unit with conversion factor to base unit.
 */
public class Unit<D extends Dimension> {

    private final String name;
    private final double toBase;

    public Unit(String name, double toBase) {
        this.name = name;
        this.toBase = toBase;
    }

    public double toBase(double value) {
        return value * toBase;
    }

    public double fromBase(double value) {
        return value / toBase;
    }

    public String getName() {
        return name;
    }
}