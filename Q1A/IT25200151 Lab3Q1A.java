import java.util.Scanner;

public class RicePrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter price of 1kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter number of kilograms: ");
        double kg = input.nextDouble();

        double amount = price * kg;

        System.out.println("Amount to pay = " + amount);
    }
}