package com.trendyol.bootcamp;

import com.trrendyol.bootcamp.WordCounter;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class WordCounterTests {

    @Test
    public void add_whenAddEmptyString_shouldHashNoWords(){
        String str="";
        WordCounter wordcounter =new WordCounter();
        wordcounter.addWord(str);
        assertThat(wordcounter.wordCount, equalTo(0));
    }

    @Test
    public void add_whenAddNotEmptyString_shouldHashsingleWord(){
        String str="bir";
        WordCounter wordcounter =new WordCounter();
        wordcounter.addWord(str);
        assertThat(wordcounter.wordCount, equalTo(1));
    }

    @Test
    public void add_whenAddNotEmptyString_shouldHashMultipleWords(){
        String str="bir iki üç dört";
        WordCounter wordcounter =new WordCounter();
        wordcounter.addWord(str);
        assertThat(wordcounter.wordCount, equalTo(4));
    }

    @Test
    public void add_whenMultipleUniqueStrings_shouldHashMultipleWords(){
        String str="bir iki üç dört";
        String str2="beş altı yedi";
        WordCounter wordcounter =new WordCounter();
        wordcounter.addWord(str);
        wordcounter.addWord(str2);
        assertThat(wordcounter.wordCount, equalTo(7));
    }

    @Test
    public void add_whenMultipleNonUniqueStrings_shouldHashMultipleWords(){
        String str="bir iki iki üç dört";
        String str2="beş beş altı yedi sekiz";
        WordCounter wordcounter =new WordCounter();
        wordcounter.addWord(str);
        wordcounter.addWord(str2);
        assertThat(wordcounter.wordCount, equalTo(8));
    }

    @Test
    public void add_whenAddNotEmptyStringwithMultipleSpace_shouldHashMultipleWords(){
        String str="        bir  iki    üç      dört    ";
        WordCounter wordcounter =new WordCounter();
        wordcounter.addWord(str);
        assertThat(wordcounter.wordCount, equalTo(4));
    }
}
