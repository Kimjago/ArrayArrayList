package Bagian1;

public class LatihanMandiriArray {
     public static void main(String[] args) {

         
        System.out.println("=== Soal 1: Suhu Harian ===");

        double[] suhu = {30.5, 28.0, 33.2, 27.8, 31.1, 29.4};

        double suhuMax = suhu[0];
        double suhuMin = suhu[0];

        for (double s : suhu) {
            if (s > suhuMax) suhuMax = s;
            if (s < suhuMin) suhuMin = s;
        }

        for (int i = 0; i < suhu.length; i++) {
            System.out.println("  Hari " + (i + 1) + "   : " + suhu[i] + " C");
        }
        System.out.println("Suhu tertinggi: " + suhuMax + " C");
        System.out.println("Suhu terendah : " + suhuMin + " C");

        System.out.println();

   
        System.out.println("=== Soal 2: Nama Hari (lebih dari 5 huruf) ===");

        String[] namaHari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        for (String hari : namaHari) {
            if (hari.length() > 5) {
                System.out.println("  " + hari + " (" + hari.length() + " huruf)");
            }
        }

        System.out.println();

        
        System.out.println("=== Soal 3: Hitung Angka Genap ===");

        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;

        for (int a : angka) {
            if (a % 2 == 0) {
                jumlahGenap++;
            }
        }

        System.out.print("Data angka    : ");
        for (int i = 0; i < angka.length; i++) {
            System.out.print(angka[i]);
            if (i < angka.length - 1) System.out.print(", ");
        }
        System.out.println();
        System.out.println("Jumlah genap  : " + jumlahGenap);
    }
}
