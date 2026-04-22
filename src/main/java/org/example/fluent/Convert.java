package org.example.fluent;

public final class Convert {

    private Convert() {}

    public static ValueBuilder convert(double value) {
        return new ValueBuilder(value);
    }
}