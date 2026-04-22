package org.example.SI_UNIT.Registry;

import org.example.SI_UNIT.BaseValues.Unit;

public class UnitDefinitions {

    public static void init() {

        // MASS
        UnitRegistries.MASS.register("kg", new Unit<>("kg", 1.0));
        UnitRegistries.MASS.register("g",  new Unit<>("g", 0.001));

        // LENGTH
        UnitRegistries.LENGTH.register("m", new Unit<>("m", 1.0));
        UnitRegistries.LENGTH.register("cm", new Unit<>("cm", 0.01));

        // VOLUME
        UnitRegistries.VOLUME.register("L", new Unit<>("L", 1.0));
        UnitRegistries.VOLUME.register("m3", new Unit<>("m3", 1000.0));
    }
}
