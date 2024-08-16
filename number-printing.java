// ECHAVEZ ANDREA A. 
// BSCPE 2-1 
// LOOP FLOW CONTROL ACT 1A - PRINTING TWO NUMBERS

import java.util.Scanner;
public class Loop_Activity_1A 
{
    public static void main(String[] args) 
    {
        System.out.println("************************************");
        System.out.println("     NUMBER PRINTING GENERATOR      ");
        System.out.println("************************************");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Print this two number, ten (10) times:");

        System.out.print("\nPress Enter to print...");
        scanner.nextLine();
        scanner.nextLine();


        System.out.print("  ___________________________________");
        System.out.print("\n    First Number: |  Second Number:  ");
        System.out.print("\n  ________________|__________________\n");

        int count = 0;

        while (count < 10) 
        {
            System.out.println("        "+ firstNumber + "         |          " + secondNumber);
            count++;
        }
    }
}
