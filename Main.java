import java.io.File;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        File myFile = new File("Assignment1.txt");

        try {
            Scanner myScanner = new Scanner(myFile);

            while (myScanner.hasNextLine())
            {
                String line = myScanner.nextLine();

                String[] tokens = line.split(",");
                int length = tokens.length;

                // Fetch the name
                String name = tokens[0];

                // Add up the sums
                double sum = 0;
                for (int i = 1; i < length; ++i)
                // changing values in ++i gives error and not infinite loop.
                {
                    // probably the right way to parse a double?
                    double value = Double.parseDouble(tokens[i]);

                    // double value = Double.valueOf(tokens[i]);
                    sum += value;
                }
                System.out.println("Name: " + name + ", Average Spent: " + (sum / (length - 1)));
            }

            myScanner.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}