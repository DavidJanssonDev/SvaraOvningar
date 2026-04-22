package org.example.length;

import org.example.core.Unit;

/**
 * Length units (base = meter)
 */
public final class LengthUnits {

    private LengthUnits() {}

    public static final Unit<Length> M  = new Unit<>("m", 1.0);
    public static final Unit<Length> FT = new Unit<>("ft", 0.3048);
}