package org.example.SI_UNIT.BaseValues;
import org.example.SI_UNIT.Interface.IDimensionType;

/**
 * Represents a physical quantity (value + unit) stored internally in base units.
 *
 * <p>All operations are performed in base units to ensure consistency and correctness.</p>
 *
 * <p>Example:
 * <ul>
 *     <li>1500 g → stored as 1.5 kg internally</li>
 * </ul>
 * </p>
 *
 * @param <D> Dimension type (Mass, Length, Volume, etc.)
 */
public class Quantity<D extends IDimensionType> {

    private final double baseValue;
    private final Unit<D> unit;


    /**
     * Creates a quantity and converts it to base unit internally.
     *
     * @param value value in the given unit
     * @param unit unit of the value
     */
    public Quantity(double value, Unit<D> unit) {
        this.unit = unit;
        this.baseValue = unit.toBase(value);
    }

    /**
     * Converts this quantity to another unit of the same dimension.
     *
     * @param targetUnit target unit
     * @return value expressed in target unit
     */
    public double to(Unit<D> targetUnit) {
        return targetUnit.fromBase(baseValue);
    }

    /**
     * Adds two quantities of the same dimension.
     *
     * @param other another quantity of same type
     * @return new quantity in the same unit system
     */
    public Quantity<D> Add(Quantity<D> other) {
        double sum = this.baseValue + other.baseValue;

        return new Quantity<>(this.unit.fromBase(sum), this.unit);
    }

    /**
     * Subtracts another quantity from this one.
     *
     * @param other quantity to subtract
     * @return result quantity
     */
    public Quantity<D> subtract(Quantity<D> other) {
        double diff = this.baseValue - other.baseValue;
        return new Quantity<>(this.unit.fromBase(diff), this.unit);
    }

    /**
     * Formats this quantity in a specific unit (no automatic scaling).
     *
     * @param targetUnit unit to display in
     * @return numeric value in that unit
     */
    public double format(Unit<D> targetUnit) {
        return targetUnit.fromBase(baseValue);
    }
    /**
     * @return raw value in base unit
     */
    public double getBaseValue() {
        return baseValue;
    }

}


