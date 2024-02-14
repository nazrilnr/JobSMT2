public class royalgarden {
    public static void main(String[] args) {
        tampilpendapatan();
        jumlahstok();
    }
    static void tampilpendapatan () {
    int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        int[] harga = {75000, 50000, 60000, 10000};

        // Menghitung pendapatan setiap cabang
        for (int i = 0; i < stock.length; i++) {
            int pendapatanCabang = 0;
            for (int j = 0; j < stock[i].length; j++) {
                pendapatanCabang += stock[i][j] * harga[j];
            }
            System.out.println("Pendapatan RoyalGarden " + (i + 1) + ": Rp " + pendapatanCabang);
        }
    }; 
    static void jumlahstok() {
        int[][] stock = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };

        // Pengurangan stock karena bunga mati
        stock[3][0] -= 1; // Aglonema
        stock[3][1] -= 2; // Keladi
        // Alocasia tidak berubah
        stock[3][3] -= 5; // Mawar

        // Menampilkan jumlah stock setiap jenis bunga pada cabang RoyalGarden 4
        System.out.println("Jumlah Stock pada Cabang RoyalGarden 4:");
        System.out.println("Aglonema: " + stock[3][0]);
        System.out.println("Keladi: " + stock[3][1]);
        System.out.println("Alocasia: " + stock[3][2]);
        System.out.println("Mawar: " + stock[3][3]);
    }
    };

