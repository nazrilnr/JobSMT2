import java.util.Scanner;
public class pemilihannilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pemograman Menghitung Nilai Akhir");
        System.out.println("====================================");

        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = input.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        int kuis = input.nextInt();
        System.out.print("Masukkan Nilai UTS  : ");
        int uts = input.nextInt();
        System.out.print("Masukkan Nilai UAS  : ");
        int uas = input.nextInt();
        System.out.println("=================");

        double nilaiAkhir = (0.2 * tugas) + (0.3 * kuis) + (0.35 * uts) + (0.15 * uas);

        if (nilaiAkhir >= 60) {
            System.out.println("Nilai Akhir: " + nilaiAkhir);
            System.out.println("SELAMAT ANDA LULUS");
            if (nilaiAkhir >= 80) {
                System.out.println("Nilai Huruf: A");
            } else if (nilaiAkhir >= 73) {
                System.out.println("Nilai Huruf: B+");
            } else if (nilaiAkhir >= 65) {
                System.out.println("Nilai Huruf: B");
            } else if (nilaiAkhir >= 60) {
                System.out.println("Nilai Huruf: C+");
            } else if (nilaiAkhir >= 50){
                System.out.println("Nilai Huruf: C");
            } else {
                System.out.println("Nilai Huruf: D");
            }
        } else {
            System.out.println("nilai tidak valid");
        }
    }
}