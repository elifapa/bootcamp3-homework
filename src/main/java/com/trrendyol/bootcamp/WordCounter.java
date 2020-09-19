package com.trrendyol.bootcamp;

import java.util.Arrays;
import java.util.HashSet;

public class WordCounter {
    public HashSet<String> words = new HashSet<String>();
    public int wordCount=0;

    public void addWord(String string){
        if(!string.isEmpty()) {
            words.addAll(Arrays.asList(string.trim().split("\\s+")));
            wordCount = words.size();
            System.out.println(words);
        }
    }
}
