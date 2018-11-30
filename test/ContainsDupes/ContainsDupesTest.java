package ContainsDupes;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContainsDupesTest {

    @Test
    public void containsDupes() {
        int[] input = {1,2,3,1};
        boolean expected = true;
        boolean actual = ContainsDupes.containsDupes(input);
        assertTrue(ContainsDupes.containsDupes(input));
    }

    @Test
    public void containsDupesS() {
    }
}