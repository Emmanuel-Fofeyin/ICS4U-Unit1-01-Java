/*
* The program shows how to many logs can fit
*   on a truck given the length of the logs.
*
* @author  Emmanuel.FN
* @version 1.0
* @since   2024-02-19
*/

import java.util.Scanner;

/**
* This is the standard "LogTruck" program.
*/
final class LogTruck {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private LogTruck() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
	// This method of getting user input was generated by ChatGPT

	// Create a Scanner object to read user input
	final Scanner scanner = new Scanner(System.in);

	System.out.print("What length do you want your logs to be?");
        System.out.print("(0.25, 0.5, 1): ");
        final double logLength = scanner.nextDouble();

	final double logWeight = 20.0;
        final double truckMaxWeight = 1100.0;
	final double numberOfLogs = truckMaxWeight / (logWeight * logLength);

        System.out.println("The truck can carry " + numberOfLogs);
        System.out.println(" logs if they are " + logLength + "m long.");
        System.out.println("\nDone.");

	scanner.close();
    }
}
