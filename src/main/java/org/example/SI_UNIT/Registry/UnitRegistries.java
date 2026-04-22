package org.example.SI_UNIT.Registry;

import org.example.SI_UNIT.DimensionTypes.Length;
import org.example.SI_UNIT.DimensionTypes.Mass;
import org.example.SI_UNIT.DimensionTypes.Volume;

public class UnitRegistries {
    public static final UnitRegistry<Mass> MASS = new UnitRegistry<>();
    public static final UnitRegistry<Length> LENGTH = new UnitRegistry<>();
    public static final UnitRegistry<Volume> VOLUME = new UnitRegistry<>();
}
