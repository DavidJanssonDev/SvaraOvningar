package org.example.SI_UNIT.Registry;

import org.example.SI_UNIT.BaseValues.Unit;
import org.example.SI_UNIT.Interface.IDimensionType;

import java.util.HashMap;
import java.util.Map;

public class UnitRegistry<D extends IDimensionType> {

    private final Map<String, Unit<D>> units = new HashMap<>();

    public void register(String name, Unit<D> unit) {
        units.put(name.toLowerCase(), unit);
    }

    public Unit<D> get(String name) {
        Unit<D> unit = units.get(name.toLowerCase());

        if (unit == null) {
            throw new IllegalArgumentException("Unknown unit: " + name);
        }

        return unit;
    }
}
