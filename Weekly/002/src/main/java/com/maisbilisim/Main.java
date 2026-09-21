package com.maisbilisim;

import java.util.Map;

public class Main {
    private static final Map<String, String> translationMap = Map.ofEntries(
            Map.entry("hun", "Szia"),
            Map.entry("eng", "Hello"),
            Map.entry("tur", "Merhaba"),
            Map.entry("ger", "Hallo"),
            Map.entry("esp", "Hola"));

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a name and/or a language code as command line arguments.");
            return;
        }

        String chosenLanguage = args.length > 1 ? args[1] : "hun";
        String greeting = translationMap.get(chosenLanguage);
        if (greeting == null) {
            System.out.println("Invalid language code. Please use " + translationMap.keySet() + ".");
            return;
        }

        String name = args[0];

        System.out.println(greeting + ", " + name + "!");
    }
}