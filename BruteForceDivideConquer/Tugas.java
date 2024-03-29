import java.util.Scanner;

public class Tugas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Meminta input bilangan yang akan dihitung akarnya
        System.out.print("Masukkan bilangan: ");
        int bilangan = sc.nextInt();
        
        // Menghitung akar bilangan menggunakan algoritma Brute Force
        double akarBruteForce = hitungAkarBruteForce(bilangan);
        System.out.println("Akar dengan Brute Force: " + akarBruteForce);
        
        // Menghitung akar bilangan menggunakan algoritma Divide Conquer
        double akarDivideConquer = hitungAkarDivideConquer(bilangan);
        System.out.println("Akar dengan Divide Conquer: " + akarDivideConquer);
    }
    
    // Metode untuk menghitung akar bilangan dengan algoritma Brute Force
    public static double hitungAkarBruteForce(int bilangan) {
        double akar = 0;
        while (akar * akar <= bilangan) {
            akar++;
        }
        return akar - 1; // Bulatkan ke bawah jika bukan kuadrat sempurna
    }
    
    // Metode untuk menghitung akar bilangan dengan algoritma Divide Conquer
    public static double hitungAkarDivideConquer(int bilangan) {
        return Math.floor(Math.sqrt(bilangan)); // Bulatkan ke bawah jika bukan kuadrat sempurna
    }
}
