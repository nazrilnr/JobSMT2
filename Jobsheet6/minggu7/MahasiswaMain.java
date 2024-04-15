package minggu7;
import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        // PencarianMhs data = new PencarianMhs();
        // int jumMhs = 5;

        // System.out.print("Masukkan jumlah mahasiswa: ");
        // int jumMhs = s.nextInt();
        
        // System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil");
        // for(int i = 0; i < jumMhs; i++){
        //     System.out.println("-----------------------------------------");
        //     System.out.print("Nim\t : ");
        //     int nim = s.nextInt();
        
        //     s.nextLine();
        
        //     System.out.print("Nama\t : ");
        //     String nama = s.nextLine();
        
        //     System.out.print("Umur\t : ");
        //     int umur = s.nextInt();
        //     System.out.print("IPK\t : ");
        //     double ipk = s.nextDouble();
        
        //     Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
        //     data.tambah(m); // Menambahkan objek Mahasiswa ke dalam array ListMHS
        // }


        // System.out.println("============================================");
        // System.out.println("Data keseluruhan");
        // data.tampil();

        // System.out.println("");
        // System.out.println("Pencarian Data : ");
        // System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        // System.out.print("Nama : ");
        // String cariNama = s.next();
        // System.out.println("menggunakan binary Search");
        // int[] posisi = data.FindBinarySearchNama(cariNama);
        // data.TampilposisiNama(cariNama, posisi);
        // data.TampilDataNama(cariNama, posisi);
        Scanner s = new Scanner(System.in);
        PencarianMahasiswa data = new PencarianMahasiswa();
        // int jumMhs = 5;

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = s.nextInt();

        System.out.println("Masukkan data mahasiswa secara Urut dari Nim Terkecil");
        for(int i = 0; i < jumMhs; i++){
            System.out.println("-----------------------------------------");
            System.out.print("Nim\t : ");
            int nim = s.nextInt();

            s.nextLine();
             
            System.out.print("Nama\t : ");
            String nama = s.nextLine();

            System.out.print("Umur\t : ");
            int umur = s.nextInt();
            System.out.print("IPK\t : ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }


        System.out.println("============================================");
        System.out.println("Data keseluruhan");
        data.tampil();

        System.out.println("");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan Nama Mahasiswa yang dicari: ");
        System.out.print("Nama : ");
        String cariNama = s.next();

        int posisi = data.FindBinarySearch(cariNama, 0, jumMhs - 1);

        if (posisi != -1) {
            System.out.println("Data dengan nama '" + cariNama + "' ditemukan pada indeks " + posisi + ".");
            // Check for multiple results
            int count = 1;
            // Search to the left
            int left = posisi - 1;
            while (left >= 0 && data.ListMHS[left].nama.equalsIgnoreCase(cariNama)) {
                count++;
                left--;
            }
            // Search to the right
            int right = posisi + 1;
            while (right < jumMhs && data.ListMHS[right].nama.equalsIgnoreCase(cariNama)) {
                count++;
                right++;
            }
            if (count > 1) {
                System.out.println("Peringatan: Terdapat " + count + " hasil pencarian yang sama.");
            }
            // Show the found data
            data.TampilData(data.ListMHS[posisi].nim, posisi);
        } else {
            System.out.println("Data dengan nama '" + cariNama + "' tidak ditemukan.");
        }
    }
        // System.out.println("");
        //  System.out.println("Pencarian Data : ");
        //  System.out.println("Masukkan Nim Mahasiswa yang dicari: ");
        //  System.out.print("NIM : ");
        //  int cari = s.nextInt();
        //  System.out.println("menggunakan sequential Search");
        //  int posisi = data.FindSeqSearch(cari);

        //  System.out.println("menggunakan binary Search");
        //  posisi = data.FindBinarySearch(cari, 0 ,jumMhs -1);
        //  data.Tampilposisi(cari, posisi);
        //  data.TampilData(cari, posisi);
    }
    

