package org.example.fluent;

import org.example.core.Quantity;
import org.example.length.Length;
import org.example.length.LengthUnits;
import org.example.mass.Mass;
import org.example.mass.MassUnits;

/**
 * Step 1: choose the unit.
 */
public class ValueBuilder {

    private final double value;

    public ValueBuilder(double value) {
        this.value = value;
    }

    // MASS
    public MassConversion grams() {
        return new MassConversion(new Quantity<>(value, MassUnits.G));
    }

    public MassConversion kilograms() {
        return new MassConversion(new Quantity<>(value, MassUnits.KG));
    }

    public MassConversion pounds() {
        return new MassConversion(new Quantity<>(value, MassUnits.LB));
    }

    // LENGTH
    public LengthConversion feet() {
        return new LengthConversion(new Quantity<>(value, LengthUnits.FT));
    }

    public LengthConversion meters() {
        return new LengthConversion(new Quantity<>(value, LengthUnits.M));
    }
}