package minggu5;

public class Mahasiswa {
    String nama;
    int thnMasuk, umur;
    double ipk;

    // Konstruktor Mahasiswa
    Mahasiswa(String n, int t, int u, double i) {
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    }

    // Metode untuk menampilkan informasi mahasiswa
    void tampil() {
        System.out.println("Nama =" + nama);
        System.out.println("Tahun masuk =" + thnMasuk);
        System.out.println("Umur =" + umur);
        System.out.println("IPK =" + ipk);
    }
}
