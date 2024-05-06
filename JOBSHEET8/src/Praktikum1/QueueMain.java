package Praktikum1;
import java.util.Scanner;

public class QueueMain {
    public static void menu(){
        System.out.println ("Masukkan operasi yang diinginkan:");
        System.out.println ("1. Enqueue") ;
        System.out.println ("2. Dequeue") ;
        System.out.println ("3. Print");
        System.out.println ("4. Peek");
        System.out.println ("5. Clear");
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        Scanner naz = new Scanner (System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = naz.nextInt();
        Queue Q = new Queue(n);
        int pilih;

        do {
            menu();
            pilih = naz.nextInt();
            switch (pilih){
                case 1 :
                System.out.println("Masukkan data baru: ");
                int dataMasuk = naz.nextInt();
                Q.Enqueue(dataMasuk);
                break;
                case 2 :
                int dataKeluar = Q.Dequeue();
                if (dataKeluar != 0){
                    System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    break;
                }
                case 3:
                Q.print();
                break;
                case 4:
                Q.peek();
                break;
                case 5:
                Q.clear();
            }
        }
        while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}

