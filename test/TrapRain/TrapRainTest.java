package TrapRain;

import org.junit.Test;

import static org.junit.Assert.*;

public class TrapRainTest {

    @Test
    public void trapRainFirstTest() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int expected = 6;
        int actual = TrapRain.trapRain(height);

        assertEquals(expected, actual);
    }

    @Test
    public void trapFirstTest() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int expected = 6;
        int actual = TrapRain.trap(height);

        assertEquals(expected, actual);
    }

    @Test
    public void waterTrapFirstTest() {
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int expected = 6;
        int actual = TrapRain.waterTrap(height);

        assertEquals(expected, actual);
    }
}