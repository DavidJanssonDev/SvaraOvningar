package org.example.fluent;

import org.example.core.Quantity;
import org.example.length.Length;
import org.example.length.LengthUnits;

public class LengthConversion {

    private final Quantity<Length> quantity;

    public LengthConversion(Quantity<Length> quantity) {
        this.quantity = quantity;
    }

    public double toMeters() {
        return quantity.to(LengthUnits.M);
    }

    public double toFeet() {
        return quantity.to(LengthUnits.FT);
    }
}
