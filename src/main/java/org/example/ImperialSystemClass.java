package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ImperialSystemClass {

    public final double FAMNAR_CONST = 182.88;
    public final double ALNAR_CONST = 59.38;
    public final double TUM_CONST = 2.54;
    public final double FOT_CONST = 30.48;


    public double CmToFamnar(double cm) {
        return cm/FAMNAR_CONST;
    }

    public double CmToAlnar(double cm) {
        return cm/ALNAR_CONST;
    }

    public double CmToTum(double cm) {
        return cm/TUM_CONST;
    }

    public double CmToFot(double cm) {
        return cm/FOT_CONST;
    }


    public void Run(Scanner userInput) {
        Double valueOne = null;
        String functionValue = null;
        valueOne = GetUserValue(userInput, valueOne);

        System.out.println("What converter do you want to use? ");
        System.out.println("1 - Cm To Famnar");
        System.out.println("2 - Cm To Alnar");
        System.out.println("3 - Cm To Tum");
        System.out.println("4 - Cm To Fot");
        do {
            functionValue = userInput.nextLine();
        } while (Arrays.stream(new String[] {"1","2","3","4"}).noneMatch(functionValue::equals));

        double result = switch (functionValue) {
            case "1" -> CmToFamnar(valueOne);
            case "2" -> CmToAlnar(valueOne);
            case "3" -> CmToTum(valueOne);
            case "4" -> CmToFot(valueOne);
            default -> 0.0;
        };

        System.out.println("Reslutat: " + result);
    }

    private static double GetUserValue(Scanner userInput, Double valueOne) {
        do {
            try {
                System.out.println("Converted value (CM):");
                String temp_valueOne = userInput.nextLine();

                valueOne = Double.parseDouble(temp_valueOne);
            } catch (NumberFormatException e) {
                continue;
            }
        } while (valueOne == null);

        return valueOne;

    }
}