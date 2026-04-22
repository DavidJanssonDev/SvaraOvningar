package org.example.mass;

import org.example.core.Unit;

/**
 * Mass units (base = kg)
 */
public final class MassUnits {

    private MassUnits() {}

    public static final Unit<Mass> KG = new Unit<>("kg", 1.0);
    public static final Unit<Mass> G  = new Unit<>("g", 0.001);
    public static final Unit<Mass> LB = new Unit<>("lb", 0.45359237);
}