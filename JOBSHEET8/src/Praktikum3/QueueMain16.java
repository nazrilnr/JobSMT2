package Praktikum3;
import java.util.Scanner;

public class QueueMain16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan kapasitas queue: ");
        int Jumlah = sc.nextInt();
        Queue16 antri = new Queue16(Jumlah);
        sc.nextLine(); // Konsumsi newline

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine(); // Konsumsi newline setelah memilih menu
            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli: ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor HP: ");
                    int noHP = sc.nextInt();
                    Costumer16 pembeli = new Costumer16(nama, noHP);
                    antri.enqueue(pembeli);
                    break;
                case 2:
                    if (!antri.isEmpty()) {
                        Costumer16 data = antri.dequeue();
                        System.out.println("Antrian yang keluar: " + data.nama + ", No HP: " + data.noHP);
                    } else {
                        System.out.println("Antrian masih kosong");
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.peekRear();
                    break;
                case 5:
                    System.out.println("Masukkan nama pembeli yang ingin dicari: ");
                    String namaCari = sc.nextLine();
                    antri.peekPosition(namaCari);
                    break;
                case 6:
                    antri.print();
                    break;
            }
        } while (pilih != 7); // Perubahan di sini
        
        sc.close();
    }

    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Antrian paling belakang");
        System.out.println("5. Cek posisi antrian berdasarkan nama");
        System.out.println("6. Cek Semua antrian");
        System.out.println("-------------------------");
    }
}
