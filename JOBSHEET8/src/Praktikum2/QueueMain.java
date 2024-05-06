package Praktikum2;

import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan kapasitas queue: ");
        int Jumlah = sc.nextInt();
        QueueN antri = new QueueN(Jumlah);
        sc.nextLine(); 

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc.nextInt(); 
                    System.out.print("saldo: ");
                    double saldo = sc.nextDouble(); 
                    Nasabah nb = new Nasabah(nama, norek, alamat, umur, saldo); 
                    antri.enqueue(nb);
                    break;
                case 2:
                    Nasabah data = antri.dequeue ();
                    if(!"".equals(data.norek) && !"".equals(data.nama) && !"".equals (data.alamat)
                        && data.umur != 0 && data.saldo != 0) {
                      System.out.println("Antrian yang keluar: " + data.norek + " " + data.nama + " "
                        + data.alamat + " " + data.umur + " " + data.saldo) ;
                    break;
                }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            }
        } while (pilih != 6); // Perubahan di sini
        
        sc.close();
    }

    public static void menu() {
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua antrian");
        System.out.println("5. Cek Antrian paling belakang");
        System.out.println("-------------------------");
    }
}