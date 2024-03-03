public class PersegiPanjang17 {
    public int panjang;
    public int lebar;

    PersegiPanjang17(){
    }

    PersegiPanjang17(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int hitungLuas(){
        return this.panjang * this.lebar;
    }

    public int hitungKeliling(){
        return 2 * (this.panjang + this.lebar);
    }
}