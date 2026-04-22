package org.example;

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
        String userAwnser;
        do {
            System.out.println(InputQuestion);
            userAwnser = UserInputScanner.nextLine().toLowerCase(Locale.ROOT);

        } while (Arrays.stream(allowedPhrases).map(String::toLowerCase).noneMatch(userAwnser::equals));

        return userAwnser;
    }
}
