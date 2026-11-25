package PDPpengumpulanjobsheet.Jobsheet12Fungsi.experiment;

public class PengunjungCafe13exp {

    // Varargs: namaPengunjung diperlakukan sebagai array String
    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    // Varargs harus menjadi parameter terakhir
    static void daftarPengunjungMeja(int nomorMeja, String... namaPengunjung) {
        System.out.println("Meja nomor " + nomorMeja + " - Daftar Nama Pengunjung:");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
    }

    static int hitungTotalBelanja(int... harga) {
        int total = 0;
        for (int h : harga) {
            total += h;
        }
        return total;
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");

        // Pertanyaan 1: tanpa argumen
        daftarPengunjung();

        // Pertanyaan 2b: argumen berupa array
        String[] tamu = {"Ali", "Budi", "Citra"};
        daftarPengunjung(tamu);

        // Pertanyaan 3: nomor meja + varargs
        daftarPengunjungMeja(5, "Rina", "Sinta");

        // Pertanyaan 4: hitungTotalBelanja dengan 1, 3, dan 5 argumen
        System.out.println("Total (1 argumen) : " + hitungTotalBelanja(15000));
        System.out.println("Total (3 argumen) : " + hitungTotalBelanja(15000, 20000, 22000));
        System.out.println("Total (5 argumen) : " + hitungTotalBelanja(15000, 20000, 22000, 12000, 10000));
    }
}
