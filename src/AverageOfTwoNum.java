import java.util.Scanner;

public class AverageOfTwoNum {
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2, num3;

        System.out.println( "First number: " );
        num1 = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println( "Second Number: " );
        num2 = keyboard.nextDouble();
        keyboard.nextLine();
        num3 = (num1+num2)/2;

        System.out.println("The average value is : " + num3);
    }
}