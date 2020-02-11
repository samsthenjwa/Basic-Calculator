import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void addMethodTwoValue() {
        int num1 = 1,num2 = 2;
        Assert.assertEquals(3,num1 + num2);
    }

    @Test
    public void addMethodThreeValue() {
        int num1 = 1,num2 = 2 , num3 = 3;
        Assert.assertEquals(6,num1 + num2 + num3);
    }

    @Test
    public void addMethodFourValue() {
        int num1 = 1,num2 = 2, num3 = 3, num4 = 4;
        Assert.assertEquals(10,num1 + num2 + num3 + num4);
    }

    @Test
    public void addMethodFiveValue() {
        int num1 = 1,num2 = 2, num3 = 3, num4 = 4, num5 = 5;
        Assert.assertEquals(15,num1 + num2 + num3 + num4 + num5);
    }



    @Test
    public void multiplyMethodTwoValue() {
        int num1 = 1,num2 = 2;
        Assert.assertEquals(2,num1 * num2);
    }
    @Test
    public void multiplyMethodThreeValue() {
        int num1 = 1,num2 = 2, num3 = 3;
        Assert.assertEquals(6,num1 * num2 * num3);
    }

    @Test
    public void multiplyMethodFourValue() {
        int num1 = 1,num2 = 2, num3 = 3, num4 = 4;
        Assert.assertEquals(24,num1 * num2 * num3 * num4);
    }

    @Test
    public void multiplyMethodFiveValue() {
        int num1 = 1,num2 = 2, num3 = 3, num4 = 4, num5 = 5;
        Assert.assertEquals(120,num1 * num2 * num3 * num4 * num5);
    }

}
