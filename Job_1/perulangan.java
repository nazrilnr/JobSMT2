import java.util.Scanner;
public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input NIM
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();

        // Mendapatkan 2 digit terakhir NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // Jika n < 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }

        // Menampilkan deretan bilangan
        System.out.print("OUTPUT: ");
        System.out.println("n = " + n);
        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 != 0) {
                    System.out.print("* ");
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}