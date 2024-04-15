package minggu7;

public class PencarianMahasiswa {
//     Mahasiswa ListMHS[] = new Mahasiswa[5];
//     int idx;

//     void tambah(Mahasiswa m) {
//         if(idx < ListMHS.length) {
//             ListMHS[idx] = m;
//             idx++;
//         } else {
//             System.out.println("Data sudah penuh !!!");
//         }
//     }

//     void tampil(){
//         for(Mahasiswa Mahasiswa : ListMHS) {
//             Mahasiswa.tampil();
//             System.out.println("------------------------");
//         }
//     }

//     public int[] FindBinarySearchNama(String cari) {
//         int[] posisi = new int[5]; // untuk menyimpan posisi-posisi hasil pencarian
//         int counter = 0; // untuk menghitung jumlah hasil pencarian
//         int left = 0;
//         int right = idx - 1;

//         while (left <= right) {
//             int mid = (left + right) / 2;
//             int cmp = ListMHS[mid].nama.compareToIgnoreCase(cari);
            
//             if (cmp == 0) {
//                 // Nama ditemukan
//                 posisi[counter++] = mid;
                
//                 // Mencari ke kiri dari posisi saat ini
//                 int idxLeft = mid - 1;
//                 while (idxLeft >= 0 && ListMHS[idxLeft].nama.equalsIgnoreCase(cari)) {
//                     posisi[counter++] = idxLeft;
//                     idxLeft--;
//                 }
                
//                 // Mencari ke kanan dari posisi saat ini
//                 int idxRight = mid + 1;
//                 while (idxRight < idx && ListMHS[idxRight].nama.equalsIgnoreCase(cari)) {
//                     posisi[counter++] = idxRight;
//                     idxRight++;
//                 }

//                 return posisi;
//             } else if (cmp < 0) {
//                 left = mid + 1;
//             } else {
//                 right = mid - 1;
//             }
//         }

//         // Nama tidak ditemukan
//         return new int[] {-1};
//     }

//     public void TampilposisiNama(String x, int[] pos){

//         if (pos[0] != -1) {
//             System.out.println("Data dengan nama '" + x + "' ditemukan pada indeks:");
//             for (int i = 0; i < pos.length && pos[i] != -1; i++) {
//                 System.out.println(pos[i]);
//             }
//         } else {
//             System.out.println("Data dengan nama '" + x + "' tidak ditemukan");
//         }
//     }

//     public void TampilDataNama(String x, int[] pos) {
//         if (pos[0] != -1) {
//             System.out.println("Data dengan nama '" + x + "' ditemukan pada indeks:");
//             for (int i = 0; i < pos.length && pos[i] != -1; i++) {
//                 int idx = pos[i];
//                 System.out.println("Nim\t: " + ListMHS[idx].nim);
//                 System.out.println("Nama\t: " + ListMHS[idx].nama);
//                 System.out.println("Umur\t: " + ListMHS[idx].umur);
//                 System.out.println("IPK\t: " + ListMHS[idx].ipk);
//                 System.out.println("------------------------");
//             }
//         } else {
//             System.out.println("Data dengan nama '" + x + "' tidak ditemukan");
//         }
//     }
// }
    Mahasiswa ListMHS[] = new Mahasiswa[10];
    int idx;

    void tambah(Mahasiswa m) {
        if(idx < ListMHS.length) {
            ListMHS[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh !!!");
        }
    }

    void tampil(){
        for(int i = 0; i < idx; i++) {
            ListMHS[i].tampil();
            System.out.println("------------------------");
        }
        // for(Mahasiswa Mahasiswa : ListMHS) {
        //     ListMHS[Mahasiswa].tampil();
        //     Mahasiswa.tampil();
        //     System.out.println("------------------------");
        // }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < ListMHS.length; j++) {
            if (ListMHS[j].nim==cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    
    public void Tampilposisi(int x, int pos){

            if (pos!= -1) {
                System.out.println("data : " + x + "ditemukan pada inedeksssz" + pos);

            } else {
                System.out.println("data : " + x + "Tida ditemukan NDEs ");
            }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t: " + x);
            System.out.println("Nama\t: " + ListMHS[pos].nama);
            System.out.println("Umur\t: " + ListMHS[pos].umur);
            System.out.println("IPK\t: " + ListMHS[pos].ipk);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public int FindBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            int cmp = ListMHS[mid].nama.compareToIgnoreCase(cari);
            if (cmp == 0) {
                return mid;
            } else if (cmp > 0) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    // public int FindBinarySearch(int cari, int left, int right) {
    //     int mid;
    //     if (right >= left) {
    //         mid = (left + right) / 2;
    //         if (cari == ListMHS[mid].nim) {
    //             return (mid);
    //         } else if (ListMHS[mid].nim > cari) {
    //             return FindBinarySearch(cari, left, mid - 1);
    //         } else {
    //             return FindBinarySearch(cari, mid + 1, right);
    //         }
    //     }
    //     return -1;
    // }

   
}   
    
    
    
    
