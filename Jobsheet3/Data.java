import java.util.Scanner;
public class Data {
    public static void main(String[] args) {
         Scanner dt = new Scanner(System.in); 
            System.out.print("Masukan Banyaknya Data Mahasiswa: ");
            int banyak = dt.nextInt();
            System.out.println("");

            DataMahasiswa[] mahasiswa = new DataMahasiswa[banyak];
            
            for (int i = 0; i < mahasiswa.length; i++){
                mahasiswa[i] = new DataMahasiswa();

                System.out.println("Mahasiswa ke-" + (i + 1));
                System.out.print("Nama: ");
                String nama = dt.next();
                System.out.print("NIM: ");
                String nim = dt.next();
                System.out.print("Jenis Kelamin (L/P): ");
                String jenisKelamin = dt.next();
                System.out.print("IPK: ");
                double ipk = dt.nextDouble();
                System.out.println("");
                dt.nextLine();

                mahasiswa[i] = new DataMahasiswa(nama, nim, jenisKelamin, ipk);
            }

            for(int i = 0; i < mahasiswa.length; i++){
                System.out.println("Mahasiswa ke-" + (i+1));
                System.out.println("Nama: " + mahasiswa[i].nambahNama());
                System.out.println("NIM: " + mahasiswa[i].nambahNIM());
                System.out.println("Jenis Kelamin: " + mahasiswa[i].nambahJK());
                System.out.println("IPK : " + mahasiswa[i].nambahIpk());
            }
            double totalIpk = 0;
            for (int i = 0; i < mahasiswa.length; i++) {
                totalIpk += mahasiswa[i].nambahIpk();
            }
            double rataRataIpk = totalIpk / mahasiswa.length;
                System.out.println("Rata-rata IPK: " + rataRataIpk);
        }    
    }
    
