package org.example;

import org.example.SI_UNIT.BaseValues.Quantity;
import org.example.SI_UNIT.BaseValues.Unit;
import org.example.SI_UNIT.DimensionTypes.Length;
import org.example.SI_UNIT.DimensionTypes.Mass;
import org.example.SI_UNIT.DimensionTypes.Volume;
import org.example.SI_UNIT.Registry.UnitDefinitions;
import org.example.SI_UNIT.Registry.UnitRegistries;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static ImperialSystemClass ImperialSystem;

    public static MetricSystemClass MetricSystem;

    public static SystemsEnum SelectedSystem;

    public static Scanner UserInputScanner;

    private static void SetUpSystems() {
        ImperialSystem = new ImperialSystemClass();
        MetricSystem = new MetricSystemClass();
        UserInputScanner = new Scanner(System.in);
    }

    static void main() {
        // 1. Initialize all units
        UnitDefinitions.init();

        // 2. Get strongly-typed units (NO strings leaking outside anymore)
        Unit<Mass> kg = UnitRegistries.MASS.get("kg");
        Unit<Mass> g  = UnitRegistries.MASS.get("g");

        Unit<Length> m  = UnitRegistries.LENGTH.get("m");
        Unit<Length> cm = UnitRegistries.LENGTH.get("cm");

        Unit<Volume> L = UnitRegistries.VOLUME.get("L");

        // 3. Create quantities (type-safe)
        Quantity<Mass> mass = new Quantity<>(1500, g);   // 1500 g
        Quantity<Length> length = new Quantity<>(250, cm); // 250 cm
        Quantity<Volume> volume = new Quantity<>(2.5, L);  // 2.5 L

        // 4. Convert within same dimension only
        System.out.println("Mass in kg: " + mass.to(kg));
        System.out.println("Mass formatted: " + mass.format(kg));

        System.out.println("Length in m: " + length.to(m));
        System.out.println("Length formatted: " + length.format(m));

        System.out.println("Volume formatted: " + volume.format(L));

        // 5. Demonstrate safety (this would NOT compile if uncommented)
        // mass.to(m); // ❌ cannot convert MASS → LENGTH

        System.out.println("System initialized successfully.");
    }

    public static void OldSystem(){
        SetUpSystems();
        SelectedSystem = ChoiceBetweenSystem();
        switch (SelectedSystem) {
            case SystemsEnum.IMPERIAL_SYSTEM:
                ImperialSystem.Run(UserInputScanner);
                break;
            case SystemsEnum.METRIC_SYSTEM:
                MetricSystem.Run(UserInputScanner);
                break;
        }
    }

    public static SystemsEnum ChoiceBetweenSystem() {

        String userInput = GetUserInput(new String[]{"Imperial", "Metric", "None"}, "What Format System you using? (Imperial, Metric or None): ");

        return switch (userInput) {
            case "imperial" -> SystemsEnum.IMPERIAL_SYSTEM;
            case "metric" -> SystemsEnum.METRIC_SYSTEM;
            default -> SystemsEnum.NONE;
        };

    }

    public static String GetUserInput(String[] allowedPhrases, String InputQuestion) {
        String userAnwser;
        do {
            System.out.println(InputQuestion);
            userAnwser = UserInputScanner.nextLine().toLowerCase(Locale.ROOT);

        } while (Arrays.stream(allowedPhrases).map(String::toLowerCase).noneMatch(userAnwser::equals));

        return userAnwser;
    }
}
