package minggu7;

public class Mahasiswa {
  
        int nim;
        String nama;
        int umur;
        double ipk;

        public void tampilData() {
            System.out.println("NIM : " + this.nim);
            System.out.println("Nama : " + this.nama);
            System.out.println("Umur : "+this.umur+" Tahun");
            System.out.println("IPK : "+this.ipk);
        } 

    Mahasiswa(int ni, String n, int u, double i) {
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    
        
    }
    void tampil() {
        System.out.println("Nim = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }

    // void tampil() {
    //     System.out.println("Nim = " + nim);
    //     System.out.println("Nama = " + nama);
    //     System.out.println("Umur = " + umur);
    //     System.out.println("IPK = " + ipk);
    // }
   


    
}