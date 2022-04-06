import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        /*
        --------------------------------------
                        Minimum
        --------------------------------------
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int inputNum = 0;

        while (inputNum != -1)
        {
            System.out.print("Please enter numbers. Enter -1 to quit: ");
            inputNum = input.nextInt();
            if (inputNum != -1)
            {
                numbers.add(inputNum);
            }
        }

        int minimum = findMinimum(numbers);  // call to findMinimum method
        System.out.println("Minimum: " + minimum);
        */

        /*
        --------------------------------------
                    How many hours
        --------------------------------------
        Scanner input = new Scanner(System.in);
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        int bacteria = numBacteriaAlive(hours);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
        */

        /*
        --------------------------------------
                How many hours (long)
        --------------------------------------
        Scanner input = new Scanner(System.in);
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        long bacteria = numBacteriaAlive(hours);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
        */

        /*
        --------------------------------------
                   Initial bacteria
        --------------------------------------
         */
        Scanner input = new Scanner(System.in);
        System.out.print("How many initial bacteria? ");
        int initialBac = input.nextInt();
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        long bacteria = numBacteriaAlive(hours, initialBac);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
    }


    /*
    --------------------------------------
                   Minimum
    --------------------------------------
    public static int findMinimum(ArrayList<Integer> numbers)
    {
        if (numbers.size() == 1)
        {
            return numbers.get(0);
        }
        else
        {
            if (numbers.get(0) > numbers.get(1))
            {
                numbers.remove(0);
            }
            else
            {
                numbers.remove(1);
            }
            return findMinimum(numbers);
        }
    }
    */

    /*
    --------------------------------------
                How many hours
    --------------------------------------
    public static int numBacteriaAlive(int hour)
    {
        if (hour == 0)
        {
            return 10;
        }
        return numBacteriaAlive(hour - 1) * 2 + numBacteriaAlive(hour - 1);
    }
    */

    /*

    --------------------------------------
            How many hours (long)
    --------------------------------------
    public static long numBacteriaAlive(int hour)
    {
        if (hour == 0)
        {
            return 10;
        }
        return numBacteriaAlive(hour - 1) * 2 + numBacteriaAlive(hour - 1);
    }
    */

    /*
    --------------------------------------
               Initial bacteria
    --------------------------------------
    */
    public static long numBacteriaAlive(int hour, int initial)
    {
        if (hour == 0)
        {
            return initial;
        }
        return numBacteriaAlive(hour - 1, initial) * 2 + numBacteriaAlive(hour - 1, initial);
    }
}