import java.util.Scanner;
public class MainFaktorial {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long awal = System.currentTimeMillis();
        System.out.println("============================================");
        System.out.println("Waktu awal : "+ String.valueOf(awal)+" milidetik");
        System.out.print("Masukkan Jumlah Elemen yang akan dihitung : ");
        int elemen = sc.nextInt();
        
        Faktorial [] fk = new Faktorial[elemen];
        for (int i=0; i<elemen; i++){
            fk[i] = new Faktorial();
            System.out.print("Masukkan nilai data ke-"+(i+1)+" : ");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("======================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].fatorialBF(fk[i].nilai));
        }
        System.out.println("======================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for(int i=0; i<elemen; i++){
            System.out.println("Faktorial dari nilai "+fk[i].nilai+" adalah : "+fk[i].fatorialDC(fk[i].nilai));
        }
        System.out.println("======================================");
        long akhir =  System.currentTimeMillis();
        System.out.println("Waktu Akhir\t: "+ String.valueOf(akhir)+" milidetik");
        
        long elapsTime = akhir-awal;
        System.out.println("Interval Waktu\t: "+ String.valueOf(elapsTime)+ " milidetik");
        sc.close();
    }
}