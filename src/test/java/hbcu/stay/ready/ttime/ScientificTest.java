package hbcu.stay.ready.ttime;

import org.junit.Assert;
import org.junit.Test;

public class ScientificTest {
    @Test
    public void sineTest(){
        Scientific scientific = new Scientific(Math.PI/6);
        double actual = scientific.sine();
        double expected = 0.5;
        Assert.assertEquals(actual,expected,0.01);
    }
    @Test
    public void cosTest(){
        Scientific scientific = new Scientific(Math.PI);
        double actual = scientific.cosine();
        double expected = -1;
        Assert.assertEquals(actual,expected,0);
    }
    @Test
    public void tanTest(){
        Scientific scientific = new Scientific(Math.PI/4);
        double actual = scientific.tangent();
        double expected =1;
        Assert.assertEquals(actual,expected,0.001);
    }
    @Test
    public void asineTest(){
        Scientific scientific=new Scientific(Math.PI/4);
        double actual = scientific.aSine();
        double expected = Math.asin(Math.PI/4);
        Assert.assertEquals(actual,expected,0);
    }
    @Test
    public void aCosTest(){
        Scientific scientific = new Scientific(Math.PI/4);
        double actual = scientific.aCosine();
        double expected = Math.acos(Math.PI/4);
        Assert.assertEquals(actual,expected,0);
    }
    @Test
    public void aTanTest(){
        Scientific scientific =new Scientific(Math.PI/4);
        double actual = scientific.aTangent();
        double expected = Math.atan(Math.PI/4);
        Assert.assertEquals(actual,expected,0);
    }
    @Test
    public void logTest(){
        Scientific scientific = new Scientific(10);
        double actual = scientific.log();
        double expected = 1;
        Assert.assertEquals(actual,expected,0);
    }
    @Test
    public void inverseLogTest(){
        Scientific scientific = new Scientific(1);
        double actual = scientific.inverseLog();
        double expected = 10;
        Assert.assertEquals(actual,expected,0);
    }
    @Test
    public void naturalLogTest(){
        Scientific scientific = new Scientific(Math.E);
        double actual = scientific.naturalLog();
        double expected = 1;
        Assert.assertEquals(actual,expected,0);
        }
    @Test
    public void inverseNaturalLogTest(){
        Scientific scientific = new Scientific(1);
        double actual = scientific.inverseNaturalLog();
        double expected = Math.E;
        Assert.assertEquals(actual,expected,0);
        }
    @Test
    public void factorialTest(){
        Scientific scientific = new Scientific(5);
        double actual = scientific.factorial();
        double expected = 120;
        Assert.assertEquals(actual,expected,0);
        }
    @Test
    public void switchUnitsModeTest(){
        Scientific scientific = new Scientific(Math.PI);
        double actual = scientific.switchUnitsMode();
        double expected = 180;
        System.out.println(actual);
        Assert.assertEquals(actual,expected,0);

        double actual2 = scientific.switchUnitsMode();
        double expected2 = Math.PI;
        System.out.println(actual2);
        Assert.assertEquals(actual2,expected2,0);
    }
    @Test
    public void clearMemoryTest(){
        Scientific scientific = new Scientific(30);
        double actual = scientific.clearMemory();
        double expected = 0;
        Assert.assertEquals(actual,expected,0);
    }

}
