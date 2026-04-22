package org.example.SI_UNIT.Registry;

import org.example.SI_UNIT.BaseValues.Unit;
import org.example.SI_UNIT.Interface.IDimensionType;

import java.util.HashMap;
import java.util.Map;

/**
 * Registry for storing and retrieving units of a specific dimension.
 *
 * <p>This ensures units are centrally managed and avoids scattered definitions.</p>
 *
 * @param <D> Dimension type of the units stored
 */
public class UnitRegistry<D extends IDimensionType> {

    private final Map<String, Unit<D>> units = new HashMap<>();

    /**
     * Registers a new unit.
     *
     * @param name unit identifier (e.g. "kg", "m")
     * @param unit unit instance
     */
    public void register(String name, Unit<D> unit) {
        units.put(name.toLowerCase(), unit);
    }

    /**
     * Retrieves a unit by name.
     *
     * @param name unit name
     * @return unit instance
     */
    public Unit<D> get(String name) {
        Unit<D> unit = units.get(name.toLowerCase());

        if (unit == null) {
            throw new IllegalArgumentException("Unknown unit: " + name);
        }

        return unit;
    }
}
