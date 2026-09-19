import java.util.Scanner;

public class RicePrice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter price of 1kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter number of kilograms: ");
        double kg = input.nextDouble();

        double total = price * kg;

        double discount = total * 10 / 100;

        double amountToPay = total - discount;

        System.out.println("Total = " + total);
        System.out.println("Discount = " + discount);
        System.out.println("Amount to pay = " + amountToPay);
    }
}