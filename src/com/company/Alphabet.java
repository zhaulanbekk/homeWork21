package com.company;

public class Alphabet {
    private String[] letters;
    private int[]numbers;

    public Alphabet(String[] letters, int[] numbers) {
        this.letters = letters;
        this.numbers = numbers;
    }

    public String[] getLetters() {
        return letters;
    }

    public void setLetters(String[] letters) {
        this.letters = letters;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }
}
