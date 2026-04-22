package org.example.fluent;


import org.example.core.Quantity;
import org.example.mass.Mass;
import org.example.mass.MassUnits;

/**
 * Handles mass conversions.
 */
public class MassConversion {

    private final Quantity<Mass> quantity;

    public MassConversion(Quantity<Mass> quantity) {
        this.quantity = quantity;
    }

    public double toGrams() {
        return quantity.to(MassUnits.G);
    }

    public double toKilograms() {
        return quantity.to(MassUnits.KG);
    }

    public double toPounds() {
        return quantity.to(MassUnits.LB);
    }
}
