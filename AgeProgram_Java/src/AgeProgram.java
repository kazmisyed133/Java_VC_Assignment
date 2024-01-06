import java.util.Scanner;

public class AgeProgram 
{
    public static void main(String[] args)
    {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your birth year: ");

        int birthYear = scanner.nextInt();
        

        scanner.close();

        int currentYear = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        int age = currentYear - birthYear;
        System.out.println("Your age is: " + age);
    }
}
