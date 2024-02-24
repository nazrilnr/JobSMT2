public class Buku19 {
    String judul, pengarang;
    int halaman, stok, harga;

    public Buku19(){

    }

    public Buku19(String jud, String pg, int hal, int stok, int har){
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }

    void tampilInformasi(){
        System.out.println("Judul:  " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga stok : Rp " + harga);
    }
    // void terjual(int jml){
    //     stok -= jml;
    // }
            //  Setelah DImodif 
    void terjual(int jmlh){
        if(stok > 0){
            stok -= jmlh;
        }
        else {
            System.out.println("===STOK HABIS===");
        }
    }
    void restock(int jml){
        stok += jml;
    }
     // Menghitung harga total
    public int hitungHargaTotal(int jml) {
        return jml * harga;
    }
    // Menghitung diskon
    public int hitungDiskon(int total) {
        int diskon;
        if (total > 150000) {
            diskon = total * 12 / 100;
        } else if (total > 75000) {
            diskon = total * 5 / 100;
        } else {
            diskon = 0;
        }
        return diskon;
    }
   // Menghitung harga bayar
   public int hitungHargaBayar(int total, int diskon) {
    return total - diskon;
    }

    void gantiHarga(int hrg){
        harga = hrg;
    }
}