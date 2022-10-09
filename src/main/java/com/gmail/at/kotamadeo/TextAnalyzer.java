package com.gmail.at.kotamadeo;

import java.util.Random;

public class TextAnalyzer {
    private final String letters;

    public TextAnalyzer(String letters, int length) {
        this.letters = generateText(letters, length);
    }

    private String generateText(String letters, int length) {
        Random random = new Random();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < length; i++) {
            text.append(letters.charAt(random.nextInt(letters.length())));
        }
        return text.toString();
    }

    public void findMaxLetterValue(char letter) {
        int counter = letters.chars()
                .parallel()
                .mapToObj(c -> (char) c)
                .filter(c -> c == letter)
                .toList()
                .size();
        System.out.printf("Количество букв '%c' - %d.%n", letter, counter);
    }
}
