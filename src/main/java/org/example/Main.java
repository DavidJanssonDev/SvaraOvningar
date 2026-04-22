package org.example;

import static org.example.fluent.Convert.convert;

public class Main {

    static void main() {

        double massResult = convert(1000).grams().toPounds();
        System.out.println("1000 g in lb: " + massResult);

        double lengthResult = convert(10).feet().toMeters();
        System.out.println("10 ft in m: " + lengthResult);
    }
}
