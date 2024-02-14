import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class array {
    private static List<List> arrayMatakuliah = new ArrayList<>();
    private static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] sksWeights = { 3, 3, 3, 4, 2, 3, 2, 2 };
        double[] equivalentValues = { 3.5, 4.0, 3.0, 3.5, 4.0, 2.0, 2.0, 4.0 };

        double totalWeightedValue = 0;
        double totalSKS = 0;
        // double equivalentValues = 0; 

        // Input data for each course
        String[] courses = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };

        for (int i = 0; i < courses.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + courses[i] + ": ");
            double nilaiAngka = scanner.nextDouble();

            if (nilaiAngka < 0 || nilaiAngka > 100) {
                System.out.println("Nilai tidak valid");
                return;
            }

            totalWeightedValue += nilaiAngka * sksWeights[i];
            totalSKS += sksWeights[i];
        }

        double ipSemester = totalWeightedValue / totalSKS;

        System.out.println("\nIP Semester: " + ipSemester);
        System.out.println("Keterangan: " + getKeterangan(ipSemester));

            if(arrayMatakuliah.size() < 1){
                System.out.println("Belum ada data Matakuliah yang dimasukkan");
                return;
            }else{
                System.out.println("Matakuliah yang Anda ambil adalah: ");
                int gradeSKS = 0;
                double totalGradeSKS = 0;
                double countSKS = 0;
                for(int i = 0; i < arrayMatakuliah.size(); i++){
                    String kdMatakuliah = (arrayMatakuliah.get(i)).get(0).toString();
                    String nmMatakuliah = (arrayMatakuliah.get(i)).get(1).toString();
                    String grMataKuliah = (arrayMatakuliah.get(i)).get(2).toString().toUpperCase();
                    String sksMatakuliah = (arrayMatakuliah.get(i)).get(3).toString();
    
                    System.out.println(kdMatakuliah + "    " + nmMatakuliah + "    " + grMataKuliah + "    " + sksMatakuliah );
                    int grade;
                    switch (grMataKuliah){
                        case "A":
                            grade = 4;
                            break;
                        case "B":
                            grade = 3;
                            break;
                        case "C":
                            grade = 2;
                            break;
                        case "D":
                            grade = 1;
                            break;
                        default:
                            grade = 0;
                            break;
                    }
                    gradeSKS = grade * Integer.parseInt(sksMatakuliah);
                    totalGradeSKS = totalGradeSKS + gradeSKS;
                    countSKS = countSKS + Integer.parseInt(sksMatakuliah);
                }
    
                double nilaiIPS = totalGradeSKS / countSKS;
                System.out.println("Nilai IPS Anda adalah " + nilaiIPS);
            }
        }

    public static String getKeterangan(double ip) {
        if (ip >= 2.75) {
            return "LULUS";
        } else {
            return "TIDAK LULUS";
        }
    }
}