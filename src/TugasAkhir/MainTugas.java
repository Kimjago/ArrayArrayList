// Nama: Muhammad Adit Syahputra
// NPM: 2410010122
package TugasAkhir;

public class MainTugas {
    public static void main(String[] args) {

        // Array String mata kuliah (ukuran tetap, minimal 3)
        String[] mataKuliah = {"Pemrograman Berbasis Objek 1", "Struktur Data", "Basis Data"};
        System.out.println("== Daftar Mata Kuliah ==");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }

        System.out.println();

        // Membuat objek KelasKuliah dan menambah minimal 5 mahasiswa
        KelasKuliah kelas = new KelasKuliah();
        kelas.tambahMahasiswa(new Mahasiswa("Andi Pratama",  "2401023", 85.0));
        kelas.tambahMahasiswa(new Mahasiswa("Budi Santoso",  "2401057", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Muhammad Adit Syahputra",    "2410010122", 90.0));
        kelas.tambahMahasiswa(new Mahasiswa("Dito Rahmat",   "2401012", 45.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eka Putri",     "2401045", 72.0));

        kelas.tampilkanSemua();

        System.out.println();
        System.out.printf("Rata-rata nilai : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());

        // Menambah satu mahasiswa baru, lalu tampilkan jumlah terbaru
        System.out.println();
        System.out.println("== Menambah Mahasiswa Baru ==");
        kelas.tambahMahasiswa(new Mahasiswa("Fajar Nugroho", "2401078", 78.0));
        kelas.tampilkanSemua();

        System.out.println();
        System.out.printf("Rata-rata nilai : %.2f%n", kelas.hitungRataRata());
        System.out.println("Jumlah lulus    : " + kelas.jumlahLulus());
    }
}