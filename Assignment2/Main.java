import java.util.Scanner;

public class Main
{

	public static void main(String[] args)
	{

        Scanner keyboard = new Scanner(System.in);

        int[] data = new int[5];

        // Input 5 numbers
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": " );
            data[i] = keyboard.nextInt();
        }

        //Constructor
        Database database = new Database(data);

        int[] sorted = database.quickSort();
        System.out.print("Quick Sorted Array: [ ");
        for(int i = 0; i < sorted.length; i++)
        {
            System.out.print(sorted[i] + " ");
        }
        System.out.print("]\n");

        //Call bubble sort and print result
        int[] sortedData = database.bubbleSort();
        System.out.print("Bubble Sorted Array: [ ");
        for(int i = 0; i < sortedData.length; i++)
        {
            System.out.print(sortedData[i] + " ");
        }
        System.out.print("]\n");

        //Call min and print result
        System.out.println("Min: " + database.min());

        //Call average and print resul
        System.out.println("Average: " + database.average());

        //Call max and print result
        System.out.println("Max: " + database.max());

        //Call indexOf and print result
        System.out.print("Enter Number to find: " );
        int search = keyboard.nextInt();
        System.out.println("Index of: " + database.indexOf(search));

        keyboard.close();

	}

}