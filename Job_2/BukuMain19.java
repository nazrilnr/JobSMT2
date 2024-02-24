
public class BukuMain19 {
 
    public static void main(String[] args) {
        // Membuat objek dari kelas Buku
        Buku19 bk1 = new Buku19();
        bk1.judul = "Leserafim";
        bk1.pengarang= "Yunji";
        bk1.stok = 10;
        bk1.halaman = 190;
        bk1.harga = 100000;
        bk1.tampilInformasi();
        bk1.terjual(5);

        System.out.println();

        bk1.gantiHarga(800000);
        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.hitungHargaTotal(150000);
        bk1.hitungDiskon(0);
        bk1.hitungHargaBayar(0, 0);

        System.out.println("");

        Buku19 bk2 = new Buku19("Ndk Ada", "Asep", 40, 15, 30000);
        bk2.terjual(11);
        bk2.tampilInformasi();
    }
 }