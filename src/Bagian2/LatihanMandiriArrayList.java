package Bagian2;

import java.util.ArrayList;

public class LatihanMandiriArrayList {
    public static void main(String[] args) {

        System.out.println("=== Soal 1: Daftar Belanja ===");

        ArrayList<String> belanja = new ArrayList<>();
        belanja.add("Susu");
        belanja.add("Roti");
        belanja.add("Telur");
        belanja.add("Minyak");

        System.out.println("Sebelum dihapus : " + belanja);
        belanja.remove(1); // hapus item ke-2 (indeks 1 = "Roti")
        System.out.println("Setelah dihapus : " + belanja);
        System.out.println("Jumlah akhir    : " + belanja.size() + " item");

        System.out.println();

        
        System.out.println("=== Soal 2: Nilai Terbesar ===");

        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(70);
        angka.add(95);
        angka.add(60);
        angka.add(88);
        angka.add(75);

        int max = angka.get(0);
        for (int n : angka) {
            if (n > max) max = n;
        }

        System.out.println("Data angka    : " + angka);
        System.out.println("Nilai terbesar: " + max);

        System.out.println();

       
        System.out.println("=== Soal 3: Nama Berawalan Huruf A ===");

        ArrayList<String> nama = new ArrayList<>();
        nama.add("Andi");
        nama.add("Budi");
        nama.add("Ayu");
        nama.add("Citra");
        nama.add("Adit");
        nama.add("Doni");

        System.out.println("Semua nama  : " + nama);
        System.out.println("Berawalan A :");
        for (String n : nama) {
            if (n.startsWith("A")) {
                System.out.println("  " + n);
            }
        }
    }
}

