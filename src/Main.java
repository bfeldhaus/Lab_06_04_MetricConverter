import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double meters;
        double miles;
        double feet;
        double inches;
        boolean trash;

        System.out.print("Please enter a Measurement in Meters: ");
        if (input.hasNextDouble())
        {
            meters = input.nextDouble();
            miles = meters * 0.000621371192;
            feet = meters * 3.2808399;
            inches = meters * 39.3700787;

            System.out.printf("\nMiles: %.4f\n", miles);

            System.out.printf("Feet: %.4f\n", feet);

            System.out.printf("Inches: %.4f",inches);
        }
        else
        {
            trash = input.hasNextDouble();
            System.out.println("You must enter a valid integer!");
            System.out.println("Run the code again!");
            System.exit(0);
        }
    }
}