import java.util.Scanner;

public class studentfee {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student fee (INR): ");
        double fee = input.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discountPercent = input.nextDouble();
        double discount = (fee * discountPercent) / 100.0;
        double discountedFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
        input.close();
    }

}
