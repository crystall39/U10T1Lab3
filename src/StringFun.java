public class StringFun
{
    public static void main(String [] args)
    {
        mystery("computers");
    }

    public static void mystery(String s)
    {
        if (s.length() > 1)
        {
            mystery(s.substring(2));
            System.out.print(s.substring(0, 1));
        }
        // BASE CASE IS IMPLICIT: no recursive call if length <= 1
    }
}