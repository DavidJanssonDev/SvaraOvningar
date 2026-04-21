package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MetricSystemClass {

    public final double FAMNAR_CONST = 182.88;
    public final double ALNAR_CONST = 59.38;
    public final double TUM_CONST = 2.54;
    public final double FOT_CONST = 30.48;

    public double FamnarToCm(double famnar) {
        return FAMNAR_CONST * famnar;
    }

    public double AlnarToCm(double alnar) {

        return ALNAR_CONST * alnar;
    }

    public double TumToCm(double tum) {

        return TUM_CONST * tum;
    }

    public double FotTOCm(double fot) {

        return FOT_CONST * fot;
    }

    public void Run(Scanner userInput) {
        Double valueOne = null;
        String functionValue = null;
        valueOne = GetUserValue(userInput, valueOne);

        System.out.println("What converter do you want to use? ");
        System.out.println("1 - Famnar to Cm");
        System.out.println("2 - Alnar to cm");
        System.out.println("3 - Tum to cm");
        System.out.println("4 - Fot to cm");
        do {
            functionValue = userInput.nextLine();
        } while (Arrays.stream(new String[] {"1","2","3","4"}).noneMatch(functionValue::equals));

        double result = switch (functionValue) {
            case "1" -> FamnarToCm(valueOne);
            case "2" -> AlnarToCm(valueOne);
            case "3" -> TumToCm(valueOne);
            case "4" -> FotTOCm(valueOne);
            default -> 0.0;
        };

        System.out.println("Reslutat: " + result);
    }

    private static double GetUserValue(Scanner userInput, Double valueOne) {
        do {
            try {
                System.out.println("Converted value (Famnar/Alnar/Tum/Fot):");
                String temp_valueOne = userInput.nextLine();

                valueOne = Double.parseDouble(temp_valueOne);
            } catch (NumberFormatException e) {
                continue;
            }
        } while (valueOne == null);

        return valueOne;

    }


}
