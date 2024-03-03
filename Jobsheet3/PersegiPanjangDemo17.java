import java.util.Scanner;
public class PersegiPanjangDemo17 {
    public static void main(String[] args) {
        Scanner naz = new Scanner(System.in);

        System.out.print("Isi panjang array : ");
        int leght = naz.nextInt();
        System.out.println("");

        PersegiPanjang17[] arrayOfPersegiPanjang = new PersegiPanjang17[leght];

        for (int i = 0; i < arrayOfPersegiPanjang.length; i++){
            arrayOfPersegiPanjang[i] = new PersegiPanjang17();

            System.out.println("Persegi panjang ke -" + (i + 1));
            System.out.print("Masukan panjang: ");
            int panjang = naz.nextInt();
            System.out.print("Masukan lebar: ");
            int lebar = naz.nextInt();

            arrayOfPersegiPanjang[i] = new PersegiPanjang17(panjang,lebar);
        }

        for (int i = 0; i <  arrayOfPersegiPanjang.length; i++){
            System.out.println("Persegi panjang ke-" + (i+ 1));
            System.out.println("Luas: " + arrayOfPersegiPanjang[i].hitungLuas());
            System.out.println("Keliling: " + arrayOfPersegiPanjang[i].hitungKeliling());
        }

        for (int i = 0; i < arrayOfPersegiPanjang.length; i++){
            System.out.println("Persegi panjang ke-" + (i+1) + ", panjang: " + arrayOfPersegiPanjang[i].panjang + ", Lebar: " + arrayOfPersegiPanjang[i].lebar + ", Luas: " + arrayOfPersegiPanjang[i].hitungLuas() + ", Keliling: 2" + arrayOfPersegiPanjang[i].hitungKeliling());
        }
        // arrayOfPersegiPanjang[0] = new PersegiPanjang17();
        // arrayOfPersegiPanjang[0].panjang = 110;
        // arrayOfPersegiPanjang[0].lebar = 30;

        // arrayOfPersegiPanjang[1] = new PersegiPanjang17();
        // arrayOfPersegiPanjang[1].panjang = 80;
        // arrayOfPersegiPanjang[1].lebar = 30;

        // arrayOfPersegiPanjang[2] = new PersegiPanjang17();
        // arrayOfPersegiPanjang[2].panjang = 100;
        // arrayOfPersegiPanjang[2].lebar = 20;

        // System.out.println("Persegi panjang ke-1, Panjang : " + arrayOfPersegiPanjang[0].panjang + ", Lebar : " + arrayOfPersegiPanjang[0].lebar);
        // System.out.println("Persegi panjang ke-1, Panjang : " + arrayOfPersegiPanjang[1].panjang + ", Lebar : " + arrayOfPersegiPanjang[1].lebar);
        // System.out.println("Persegi panjang ke-1, Panjang : " + arrayOfPersegiPanjang[2].panjang + ", Lebar : " + arrayOfPersegiPanjang[2].lebar);
    }
}