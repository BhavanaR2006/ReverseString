package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testReverseString() {
        App obj = new App();
        assertEquals("olleh", obj.reverseString("hello"));
    }

    @Test
    public void testReverseJava() {
        App obj = new App();
        assertEquals("avaJ", obj.reverseString("Java"));
    }

    @Test
    public void testSingleCharacter() {
        App obj = new App();
        assertEquals("A", obj.reverseString("A"));
    }
}