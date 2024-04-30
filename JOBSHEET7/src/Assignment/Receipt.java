package Assignment;

import java.util.Scanner;
import java.util.Stack;

public class Receipt {
    String transactionId;
    String date;
    int quantity;
    double totalPrice;
    
    public Receipt(String transactionId, String date, int quantity, double totalPrice) {
        this.transactionId = transactionId;
        this.date = date;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }
    @Override
    public String toString() {
        return "Transaction ID: " + transactionId + ", Date: " + date + ", Quantity: " + quantity + ", Total Price: " + totalPrice;
    }
}
