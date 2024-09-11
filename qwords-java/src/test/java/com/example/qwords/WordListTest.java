package com.example.qwords;

import com.example.qwords.repository.WordList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class WordListTest {

  @Test
	public void contextLoads() {
	}
    /* 
    Create a unit test that tests getRandomWord in the WordList class in the WordList.java file.
    The test should include for checking the length of the word is 6 characters in length.
    */

    @Test
    public void testGetRandomWordLength() {
        WordList wordList = new WordList();
        String randomWord = wordList.getRandomWord();
        assert randomWord.length() == 6;
    }






    

    /*
    Create a unit test to verify getRandomWord is returning random responses.
    */
    @Test
    public void testGetRandomWordIsRandom() {
        WordList wordList = new WordList();
        String randomWord1 = wordList.getRandomWord();
        String randomWord2 = wordList.getRandomWord();
        assert !randomWord1.equals(randomWord2);
    }


  

    
}

