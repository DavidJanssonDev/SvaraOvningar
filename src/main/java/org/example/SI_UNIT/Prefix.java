package org.example.SI_UNIT;

public enum Prefix {
    YOTTA(1e24, "Y"),
    ZETTA(1e21, "Z"),
    EXA(1e18, "E"),
    PETA(1e15, "P"),
    TERA(1e12, "T"),
    GIGA(1e9,  "G"),
    MEGA(1e6,  "M"),
    KILO(1e3,  "k"),
    NONE(1.0,  ""),
    MILLI(1e-3, "m"),
    MICRO(1e-6, "µ"),
    NANO(1e-9,  "n");

    private final double factor;
    private final String symbol;

    Prefix(double factor, String symbol) {
        this.factor = factor;
        this.symbol = symbol;
    }

// <--- Getter -->

    public double getFactor() {
        return factor;
    }

    public String getSymbol() {
        return symbol;
    }

// <-- Other Methods -->

    public static Prefix bestFit(double baseValue) {

        double abs = Math.abs(baseValue);

        if (abs >= 1e24) return YOTTA;
        if (abs >= 1e21) return ZETTA;
        if (abs >= 1e18) return EXA;
        if (abs >= 1e15) return PETA;
        if (abs >= 1e12) return TERA;
        if (abs >= 1e9)  return GIGA;
        if (abs >= 1e6)  return MEGA;
        if (abs >= 1e3)  return KILO;
        if (abs >= 1)    return NONE;
        if (abs >= 1e-3) return MILLI;
        if (abs >= 1e-6) return MICRO;

        return NANO;
    }

}

