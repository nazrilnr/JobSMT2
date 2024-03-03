public class DataMahasiswa {
    public double ipk;
    public String nama, nim, jenisKelamin;;

    DataMahasiswa(){

    }

    DataMahasiswa(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
   }

    public String nambahNama() {
        return nama;
    }
    public String nambahNIM(){
        return nim;
    }
    public String nambahJK(){
        return jenisKelamin;
    }
    public double nambahIpk(){
        return ipk;
    }
}
