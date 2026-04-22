package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class MetricSystemClass extends AbstractConverterSystem {


    public double FamnarToCm(double famnar) {

        return famnar * this.CONSTANT.FAMNAR_CONST;
    }

    public double AlnarToCm(double alnar) {

        return alnar * this.CONSTANT.ALNAR_CONST;
    }

    public double TumToCm(double tum) {

        return tum * this.CONSTANT.TUM_CONST;
    }

    public double FotTOCm(double fot) {

        return fot * this.CONSTANT.FOT_CONST;
    }

    public void Run(Scanner userInput) {
        Double valueOne = null;
        String functionValue;
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
}
