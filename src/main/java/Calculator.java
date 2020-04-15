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




    public static  int add(int...num1)
    {
        int total = 0;

        for (int x:num1) {
            total+=x;
        }

        return total;
    }


    public static int multiply(int... num2)
    {
        int product = num2[0];

        for (int i = 1; i < num2.length; i++) {
            product  = product * num2[i];
        }
        return product;
    }

}

