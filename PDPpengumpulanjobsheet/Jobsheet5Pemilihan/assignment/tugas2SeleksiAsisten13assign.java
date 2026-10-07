import java.util.Scanner;

public class tugas2SeleksiAsisten13assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Seleksi Calon Asisten Praktikum ===");
        System.out.print("Apakah mahasiswa berstatus aktif? (true/false): ");
        boolean aktif = sc.nextBoolean();
        System.out.print("Apakah sedang mendapat sanksi akademik? (true/false): ");
        boolean sanksi = sc.nextBoolean();
        System.out.print("Nilai Dasar Pemrograman: ");
        int nilaiDasPro = sc.nextInt();
        System.out.print("Punya sertifikat kompetensi pemrograman? (true/false): ");
        boolean sertifikat = sc.nextBoolean();

        // Tahap 1: status administrasi
        if (aktif && !sanksi) {
            // Tahap 2: syarat kompetensi
            if (nilaiDasPro >= 80 || sertifikat) {
                // Tahap 3: wawancara
                System.out.println("Lolos seleksi berkas. Mahasiswa dipanggil wawancara.");
                System.out.print("Nilai wawancara: ");
                int nilaiWawancara = sc.nextInt();

                if (nilaiWawancara >= 75) {
                    System.out.println("Selamat! Mahasiswa DITERIMA sebagai asisten praktikum");
                } else {
                    System.out.println("Gagal wawancara: nilai wawancara kurang dari 75");
                }
            } else {
                System.out.println("Gagal seleksi berkas: nilai Dasar Pemrograman kurang dari 80 dan tidak memiliki sertifikat kompetensi");
            }
        } else if (!aktif) {
            System.out.println("Gagal: mahasiswa tidak berstatus aktif");
        } else {
            System.out.println("Gagal: mahasiswa sedang mendapat sanksi akademik");
        }
        sc.close();
    }
}