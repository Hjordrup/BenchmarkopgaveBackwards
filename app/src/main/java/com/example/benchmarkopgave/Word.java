package com.example.benchmarkopgave;

public class Word {

    String originalWord;
    String reverseWord;


    public Word(String originalWord){
        this.originalWord = originalWord;
        this.reverseWord = reverseWord(originalWord);
    }

    public String reverseWord(String word){
        String reverse = " ";
        for(int i = word.length() - 1; i >= 0; i--){
            reverse = reverse + word.charAt(i);
        }
        return reverse;
    }

    public String getReverseWord() {
        return reverseWord;
    }
}
