package ContainsDupes;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDupesTest {

    @Test
    public void containsDupesTest1() {
        int[] input = {1,2,3,1};
        boolean expected = true;
        boolean actual =
                ContainsDupes.containsDupes(input);
        assertTrue(ContainsDupes.containsDupes(input));
    }

    @Test
    public void containsDupesTest2() {
        int[] input = {99,2,3,4};
        boolean expected = false;
        boolean actual = ContainsDupes.containsDupes(input);
        assertFalse(ContainsDupes.containsDupes(input));
    }

    @Test
    public void containsDupesTest3() {
        int[] input = {1,1,1,3,3,4,3,2,4,2};
        boolean expected = true;
        boolean actual = ContainsDupes.containsDupes(input);
        assertTrue(ContainsDupes.containsDupes(input));
    }

    @Test
    public void containsDupesSTest1() {
        int[] input = {1,2,3,1};
        boolean expected = true;
        boolean actual = ContainsDupes.containsDupesS(input);
        assertTrue(ContainsDupes.containsDupesS(input));
    }

    @Test
    public void containsDupesSTest2() {
        int[] input = {1,2,3,4};
        boolean expected = true;
        boolean actual = ContainsDupes.containsDupesS(input);
        assertFalse(ContainsDupes.containsDupesS(input));
    }

    @Test
    public void containsDupesSTest3() {
        int[] input = {1,1,1,3,3,4,3,2,4,2};
        boolean expected = true;
        boolean actual = ContainsDupes.containsDupesS(input);
        assertTrue(ContainsDupes.containsDupesS(input));
    }
}