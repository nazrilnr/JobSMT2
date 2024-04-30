package pratikum1;
import java.util.Scanner;

// public class StackMain {
//     public static void main(String[] args) {
//         Stack stk = new Stack(5);
//         stk.push(15);
//         stk.push(27);
//         stk.push(13);
//         stk.print();
//         stk.push(11);
//         stk.push(34);

//         //ADD two more data
//         stk.push(18);
//         stk.push(40);

//         stk.pop();
//         stk.peek();
//         stk.print();
//     }
// }
public class StackMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack stk = new Stack(5);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Print");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter book author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter published year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter pages amount: ");
                    int pages = scanner.nextInt();
                    System.out.print("Enter price: ");
                    int price = scanner.nextInt();
                    stk.push(new Book(title, author, year, pages, price));
                    break;
                case 2:
                    stk.pop();
                    break;
                case 3:
                    stk.peek();
                    break;
                case 4:
                    stk.print();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}