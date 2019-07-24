package hbcu.stay.ready.ttime;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void addTest(){
        Calculator calculator = new Calculator(10.0);
        double actual = calculator.add(5);
        double expected = 15;

        Assert.assertEquals(expected, actual, 0);
    }

    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator(10);
        double actual = calculator.subtract(5);
        double expected = 5;

        Assert.assertEquals(expected, actual, 0);
    }
    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator(10);
        double actual = calculator.multiply(5);
        double expected = 50;
        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void divideTest(){
        Calculator calculator=new Calculator(10);
        double actual = calculator.divide(5);
        double expected = 2;
        Assert.assertEquals(expected,actual,0);
    }
    @Test
    public void squareTest(){
        Calculator calculator=new Calculator(10);
        double actual = calculator.square();
        double expected = 100;
        Assert.assertEquals(actual,expected,0);
    }
    @Test
    public void squareRootTest(){
        Calculator calculator=new Calculator(25);
        double actual = calculator.squareRoot();
        double expected = 5;
        Assert.assertEquals(actual,expected,0);
    }
    @Test
    public void expTest(){
        Calculator calculator=new Calculator(3);
        double actual=calculator.exponential(2);
        double expected=9;
        Assert.assertEquals(actual,expected,0);
    }
    @Test
    public void inverseTest(){
        Calculator calculator=new Calculator(3);
        double actual=calculator.inverse();
        double expected = -3;
        Assert.assertEquals(actual,expected,0);
    }


}
