public class Summing
{
    public static void main(String[] args)
    {
        System.out.println(sum(6));  // should print 21
        System.out.println(sum(10)); // should print 55
    }

    public static int sum(int n)
    {
        int sum = 0;
        if (n != 0)
        {
            return n + sum(n - 1);
        }
        return sum;
    }
}
