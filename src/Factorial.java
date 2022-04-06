public class Factorial
{
    public static void main(String[] args)
    {
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }

    public static int factorial(int number)
    {
        int product = number;
        for (int i = number - 1; i > 0; i--)
        {
            product *= i;
        }
        return product;
    }
}
