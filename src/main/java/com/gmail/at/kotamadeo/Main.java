package com.gmail.at.kotamadeo;

public class Main {
    private static final int SIZE = 100_000;
    private static final String ABC_LOWER_CASE = "abc";

    public static void main(String[] args) {
        TextAnalyzer textAnalyzer = new TextAnalyzer(ABC_LOWER_CASE, SIZE);
        textAnalyzer.findMaxLetterValue('a');
        textAnalyzer.findMaxLetterValue('b');
        textAnalyzer.findMaxLetterValue('c');
        textAnalyzer.findMaxLetterValue('d');
    }
}
