import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void addMethodTwoValue() {
        Assert.assertEquals(3,Calculator.add(1,2));
    }

    @Test
    public void addMethodThreeValue() {
        Assert.assertEquals(6,Calculator.add(1,2,3));
    }

    @Test
    public void addMethodFourValue() {
        Assert.assertEquals(10,Calculator.add(1,2,3,4));
    }

    @Test
    public void addMethodFiveValue() {
        Assert.assertEquals(15,Calculator.add(1,2,3,4,5));
    }



    @Test
    public void multiplyMethodTwoValue() {
        Assert.assertEquals(3,Calculator.multiply(1,3));
    }
    @Test
    public void multiplyMethodThreeValue() {
        Assert.assertEquals(6,Calculator.multiply(1,2,3));
    }

    @Test
    public void multiplyMethodFourValue() {
        Assert.assertEquals(24,Calculator.multiply(1,2,3,4));
    }

    @Test
    public void multiplyMethodFiveValue() {
        Assert.assertEquals(120,Calculator.multiply(1,2,3,4,5));
    }

}
