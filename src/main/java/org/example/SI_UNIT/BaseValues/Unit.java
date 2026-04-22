package org.example.SI_UNIT.BaseValues;

import org.example.SI_UNIT.Interface.IDimensionType;

public class Unit<D extends IDimensionType> {

    private final String displayName;
    private final double toBaseFactor;

    public Unit(String displayName, double toBaseFactor) {
        this.displayName = displayName;
        this.toBaseFactor = toBaseFactor;
    }

    public String getDisplayName() {
        return displayName;
    }

    public double toBase(double value) {
        return value * toBaseFactor;
    }

    public double fromBase(double baseValue) {
        return baseValue / toBaseFactor;
    }
}
