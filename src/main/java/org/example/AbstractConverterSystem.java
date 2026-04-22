package org.example;

import java.util.Scanner;

public abstract class AbstractConverterSystem {
    public final ConverterConstant CONSTANT = new ConverterConstant();


    public double GetUserValue(Scanner userInput, Double valueOne) {
        do {
            try {
                System.out.println("Converted value (Famnar/Alnar/Tum/Fot):");
                String temp_valueOne = userInput.nextLine();

                valueOne = Double.parseDouble(temp_valueOne);
            } catch (NumberFormatException _) {}
        } while (valueOne == null);

        return valueOne;
    }
}
