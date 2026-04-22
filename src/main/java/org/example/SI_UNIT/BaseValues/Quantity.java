package org.example.SI_UNIT.BaseValues;

import org.example.SI_UNIT.Interface.IDimensionType;

public class Quantity<D extends IDimensionType> {

    private final double baseValue;
    private final Unit<D> unit;


    public Quantity(double value, Unit<D> unit) {
        this.unit = unit;
        this.baseValue = unit.toBase(value);
    }

    public double to(Unit<D> targetUnit) {
        return targetUnit.fromBase(baseValue);
    }

    public double getBaseValue() {
        return baseValue;
    }
    public double format(Unit<D> targetUnit) {
        return targetUnit.fromBase(baseValue);
    }
}

