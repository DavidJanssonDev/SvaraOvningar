package org.example.SI_UNIT.BaseValues;
import org.example.SI_UNIT.Interface.IDimensionType;

/**
 * Represents a physical unit within a specific dimension (Mass, Length, Volume, etc.).
 *
 * <p>A Unit defines how to convert values between itself and the system's base unit.</p>
 *
 * <p>Example:
 * <ul>
 *     <li>1 kg = 1.0 base mass unit</li>
 *     <li>1 g = 0.001 kg</li>
 * </ul>
 * </p>
 *
 * @param <D> The dimension type this unit belongs to
 */
public class Unit<D extends IDimensionType> {

    private final String displayName;
    private final double toBaseFactor;

    /**
     * Creates a new unit.
     *
     * @param displayName Human-readable symbol (e.g. "kg", "m", "L")
     * @param toBaseFactor Conversion factor to the base unit
     */
    public Unit(String displayName, double toBaseFactor) {
        this.displayName = displayName;
        this.toBaseFactor = toBaseFactor;
    }

    /**
     * Converts a value in this unit to the base unit.
     *
     * @param value value in this unit
     * @return value in base unit
     */
    public double toBase(double value) {
        return value * toBaseFactor;
    }

    /**
     * Converts a base unit value to this unit.
     *
     * @param baseValue value in base unit
     * @return value in this unit
     */
    public double fromBase(double baseValue) {
        return baseValue / toBaseFactor;
    }

    /**
     * @return display symbol of this unit (e.g. "kg")
     */
    public String getDisplayName() {
        return displayName;
    }
}
