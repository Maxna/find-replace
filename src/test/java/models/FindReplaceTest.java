package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindReplaceTest {

    @Test
    public void replaceWord_replaceLetterForSingleLetter_String() {
        FindReplace testFindReplace = new FindReplace();
        String expected = "b";
        assertEquals(expected, testFindReplace.replace("a", "a", "b"));
    }

    @Test
    public void replaceWord_replaceWord_String() {
        FindReplace testFindReplace = new FindReplace();
        String expected = "cat";
        assertEquals(expected, testFindReplace.replace("dog", "dog", "cat"));
    }

    @Test
    public void replaceWord_replaceWordInSentence_String() {
        FindReplace testFindReplace = new FindReplace();
        String expected = "hello universe";
        assertEquals(expected, testFindReplace.replace("hello world", "world", "universe"));
    }

    @Test
    public void replaceWord_replaceWordCaseInsensitive_String() {
        FindReplace testFindReplace = new FindReplace();
        String expected = "hello universe";
        assertEquals(expected, testFindReplace.replace("Hello World", "world", "universe"));
    }

    @Test
    public void replaceWord_replaceWordCaseInsensitiveInput_String() {
        FindReplace testFindReplace = new FindReplace();
        String expected = "hello universe";
        assertEquals(expected, testFindReplace.replace("Hello world", "World", "universe"));
    }
}