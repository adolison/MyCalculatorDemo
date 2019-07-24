package hbcu.stay.ready.ttime;

import org.junit.Assert;
import org.junit.Test;

public class DisplayTest {
    @Test
    public void currentNumberTest(){
        Display display = new Display();
        display.setCurrentNumber(32);
        display.getCurrentNumber();

        double expected = 32;
        double actual = display.getCurrentNumber();
        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void clearTest(){
        Display display = new Display();

        display.setCurrentNumber(2);
        display.clear();

        double expected = 0.0;
        double actual = display.getCurrentNumber();
        Assert.assertEquals(expected,actual, 0.0);
    }

    @Test
    public void displayModeTest(){
        Display display = new Display();
        String actual = display.switchDisplayMode();
        String expected = "octal";
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void displayUnitTest(){
        Display display = new Display();
        String actual = display.switchDisplayUnit();
        String expected = "Radians";
        Assert.assertEquals(expected,actual);
    }
}

