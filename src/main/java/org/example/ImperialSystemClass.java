package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ImperialSystemClass extends AbstractConverterSystem{


    public double CmToFamnar(double cm) {
        return cm/this.CONSTANT.FAMNAR_CONST;
    }

    public double CmToAlnar(double cm) {
        return cm/this.CONSTANT.ALNAR_CONST;
    }

    public double CmToTum(double cm) {
        return cm/this.CONSTANT.TUM_CONST;
    }

    public double CmToFot(double cm) {
        return cm/this.CONSTANT.FOT_CONST;
    }


    public void Run(Scanner userInput) {
        Double valueOne = null;
        String functionValue;
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


}