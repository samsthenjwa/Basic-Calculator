public class Calculator {
    public static void main(String[] args)
    {
        System.out.println(Calculator.add(1,2));
        System.out.println(Calculator.add(1,2,3));
        System.out.println(Calculator.add(1,2,3,4));
        System.out.println(Calculator.add(1,2,3,4,5));
        System.out.println();

        System.out.println(Calculator.multiply(1,3));
        System.out.println(Calculator.multiply(1,2,3));
        System.out.println(Calculator.multiply(1,2,3,4));
        System.out.println(Calculator.multiply(1,2,3,4,5));
    }




    public static  int add(int num1, int num2)
    {
        int sum = num1 + num2;
        return sum;
    }

    public static  int add(int num1, int num2,int num3)
    {
        int sum = num1 + num2 + num3;
        return sum;
    }

    public static  int add(int num1, int num2,int num3,int num4)
    {
        int sum = num1 + num2 + num3 + num4;
        return sum;
    }

    public static  int add(int num1, int num2,int num3,int num4,int num5)
    {
        int sum = num1 + num2 + num3 + num4 + num5;
        return sum;
    }

    public static int multiply(int num1, int num2)
    {
        int product = num1 * num2;
        return product;
    }

    public static  int multiply(int num1, int num2,int num3)
    {
        int product = num1 * num2 * num3;
        return product;
    }

    public static  int multiply(int num1, int num2,int num3,int num4)
    {
        int product = num1 * num2 * num3 * num4;
        return product;
    }

    public static  int multiply(int num1, int num2,int num3,int num4,int num5)
    {
        int product = num1 * num2 * num3 * num4 * num5;
        return product;
    }

}

