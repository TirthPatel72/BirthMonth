import java.util.Scanner;

public class BirthMonth
{
    public static void main(String[] args)
    {
        int birthMonth = 0;
        String trash;

       Scanner in = new Scanner(System.in);

        System.out.print("Enter your birth month (1-12): ");
        if (in.hasNextInt())
        {

            birthMonth = in.nextInt();
            in.nextLine(); // Consume newline

            if (birthMonth >= 1 && birthMonth <= 12) {
                System.out.println("You were born in month: " + birthMonth);
            }
            else
            {
                System.out.println("Invalid month number: " + birthMonth);
                System.out.println("Exiting... Run the program again");
                System.exit(0);
            }
        }
            else
            {
                trash = in.nextLine(); // Consume invalid input

                System.out.println("Invalid input. Please enter a number between 1 and 12.");
                System.out.println("Exiting... Run the program again");
                System.exit(0);
            }

    }

}



