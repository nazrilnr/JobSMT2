import java.util.Scanner;
public class mainHotel {
    public static void main(String[] args) {
        Scanner dt = new Scanner(System.in);
        System.out.print("Masukan Banyaknya Konsumen: ");
        int banyak = dt.nextInt();
        System.out.println("");

        konsumen[] konsumens = new konsumen[banyak];

        for (int i = 0; i < konsumens.length; i++) {
            System.out.println("Masukan informasi konsumen ke-" + (i + 1));
            System.out.print("Nama: ");
            String nama = dt.next();
            System.out.print("Umur: ");
            String umur = dt.next();
            System.out.print("Alamat: ");
            String  alamat = dt.next();
            System.out.print("Nomor telepon: ");
            int nohp = dt.nextInt();

            konsumens[i] = new konsumen(nama, umur, alamat, alamat, nohp);
        }

        kamar[] kamars = new kamar[banyak];

        for (int i = 0; i < kamars.length; i++){
            System.out.println("Masukan informasi kamar ke-");
            System.out.print("Type kamar: ");
            String type = dt.next();
            System.out.print("Nomor kamar: ");
            int  nomer = dt.nextInt();
            System.out.print("Banyaknya tamu: ");
            int banyakTamu = dt.nextInt();
            System.out.print("Harga kamar: ");
            int harga = dt.nextInt();
            System.out.print("Jenis pembayaran: ");
            String payment =  dt.next();

            kamars[i] = new kamar(type, payment, harga, banyakTamu, nomer);
        }
    }
    
}