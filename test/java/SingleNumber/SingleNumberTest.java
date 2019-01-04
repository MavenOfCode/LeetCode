package SingleNumber;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleNumberTest {

    @Test
    public void singleNumberTest1Sooz() {
        int[] inputArray = {2,2,1};
        int expected = 1;
        int actual = SingleNumber.singleNumberSooz(inputArray);

        assertEquals(expected,actual);
    }

    @Test
    public void singleNumberTest2Sooz() {
        int[] inputArray = {4,1,2,1,2};
        int expected = 4;
        int actual = SingleNumber.singleNumberSooz(inputArray);

        assertEquals(expected,actual);
    }

    @Test
    public void singleNumberTest1Ahmed() {
        int[] inputArray = {2,2,1};
        int expected = 1;
        int actual = SingleNumber.singleNumberAhmed(inputArray);

        assertEquals(expected,actual);
    }

    @Test
    public void singleNumberTest2Ahmed() {
        int[] inputArray = {4,1,2,1,2};
        int expected = 4;
        int actual = SingleNumber.singleNumberAhmed(inputArray);

        assertEquals(expected,actual);
    }
}