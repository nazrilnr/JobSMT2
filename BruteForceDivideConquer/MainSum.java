import java.util.Scanner;
public class MainSum {

    public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("============================================");
    // System.out.println("Program penghitungan keuntungan total: ");
    // System.out.print("Masukan Jumlah Bulan: ");
    // int elemen = sc.nextInt();

    // double[] keuntungan = new double[elemen];
    // System.out.println("============================================");
    // for (int i = 0; i < elemen; i++) {
    //     System.out.print("Masukan untung bulan ke- " + (i+1) + " = ");
    //     keuntungan[i] = sc.nextDouble();
    // }
    // System.out.println("============================================");
    
    // Sum15 sm = new Sum15(elemen);
    // sm.setKeuntungan(keuntungan);

    // System.out.println("Algoritma Brute Force: ");
    // System.out.println("Total keuntungan perusahaan selama " + elemen + " bulan adalah " + sm.totalBF());
    // System.out.println("============================================");
    // System.out.println("Algoritma Devide and Conquer");
    // System.out.println("Total keuntungan perusahaan selama " + elemen + " bulan adalah " + sm.totalDC());
    // System.out.println("============================================");

    // // Menutup scanner setelah digunakan
    // sc.close();

    Scanner sc = new Scanner(System.in);
        
        // Meminta input jumlah perusahaan
        System.out.print("Masukkan jumlah perusahaan: ");
        int jumlahPerusahaan = sc.nextInt();
        
        // Inisialisasi array untuk menyimpan keuntungan perusahaan
        double[][] keuntunganPerusahaan = new double[jumlahPerusahaan][];
        
        // Memasukkan keuntungan untuk setiap perusahaan
        for (int i = 0; i < jumlahPerusahaan; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i+1) + ": ");
            int jumlahBulan = sc.nextInt();
            keuntunganPerusahaan[i] = new double[jumlahBulan];
            System.out.println("Masukkan keuntungan perusahaan ke-" + (i+1) + ":");
            for (int j = 0; j < jumlahBulan; j++) {
                System.out.print("Keuntungan bulan ke-" + (j+1) + ": $");
                keuntunganPerusahaan[i][j] = sc.nextDouble();
            }
        }
        
        // Menghitung total keuntungan setiap perusahaan
        System.out.println("Total Keuntungan Setiap Perusahaan:");
        for (int i = 0; i < jumlahPerusahaan; i++) {
            double totalKeuntungan = hitungTotalKeuntungan(keuntunganPerusahaan[i]);
            System.out.println("Perusahaan ke-" + (i+1) + ": $" + totalKeuntungan);
        }
    }
    
    // Metode untuk menghitung total keuntungan perusahaan dalam satu array bulan
    public static double hitungTotalKeuntungan(double[] keuntunganBulan) {
        double total = 0;
        for (double keuntungan : keuntunganBulan) {
            total += keuntungan;
        }
        return total;
    }
}
