package Assignment;

import java.util.Scanner;
import java.util.Stack;

public class DewiReceipt {
    public static void main(String[] args) {
        Stack<Receipt> receiptStack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 8; i++) {
            System.out.println("Enter details for Receipt " + i + ":");
            System.out.print("Transaction ID: ");
            String transactionId = scanner.nextLine();
            System.out.print("Date: ");
            String date = scanner.nextLine();
            System.out.print("Quantity of Items: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.print("Total Price: ");
            double totalPrice = Double.parseDouble(scanner.nextLine());
            
            Receipt receipt = new Receipt(transactionId, date, quantity, totalPrice);
            receiptStack.push(receipt);
        }

        System.out.println("\nRetrieving Receipts:");
        while (!receiptStack.isEmpty()) {
            Receipt receipt = receiptStack.pop();
            System.out.println(receipt);
        }
    }
}