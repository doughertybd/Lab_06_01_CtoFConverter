import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double celsius = 0;
        double fahrenheit = 0;
        String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a temperature you would like to be changed from degrees celsius to fahrenheit: ");
        if (in.hasNextDouble())
        {
            celsius = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("Must enter a valid temperature: " + trash);
        }

        fahrenheit = (celsius * 1.8) + 32;
        System.out.println("The temperature " + celsius + "C is " + fahrenheit + "F");
    }
}