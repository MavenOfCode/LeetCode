package addDigits;

import org.junit.Test;

import static org.junit.Assert.*;

public class addDigitsTest {

    @Test
    public void addDigitsBaseTest() {
        int expected = 2;
        int actual =Add addDigits.addDigits(38);
        assertEquals(expected,actual);
    }

    @Test
    public void addDigitsZeroTest() {
        int expected = 0;
        int actual = addDigits.addDigits(0);
        assertEquals(expected,actual);
    }

    @Test
    public void addDigitsSingleDigitTest() {
        int expected = 7;
        int actual = addDigits.addDigits(7);
        assertEquals(expected,actual);
    }

    @Test
    public void addDigitsTripleDigitTest() {
        int expected = 6;
        int actual = addDigits.addDigits(123);
        assertEquals(expected,actual);
    }

    @Test
    public void addDigits2TripleDigitTest(){
        int expected = 6;
        int actual = addDigits.addDigits2(123);
        assertEquals(expected,actual);
    }

    @Test
    public void addDigits2SingleDigitTest() {
        int expected = 7;
        int actual = addDigits.addDigits2(7);
        assertEquals(expected,actual);
    }
}