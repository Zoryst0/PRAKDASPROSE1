import java.util.Scanner;

public class StudiKasus213 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa  : ");
        String nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenis = sc.nextLine().trim().toUpperCase();
        System.out.print("Jumlah dokumen  : ");
        int dokumen = sc.nextInt();

        String status;

        if (jenis.equals("BELMAWA") || jenis.equals("BAKORMA") || jenis.equals("MANDIRI")) {
            // Cabang perlombaan
            System.out.print("Peringkat juara : ");
            int peringkat = sc.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (dokumen >= 4) {
                    status = "Berhak memperoleh dana penghargaan (Juara " + peringkat + ").";
                } else {
                    status = "Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).";
            }
        } else if (jenis.equals("PKM")) {
            // Cabang PKM
            System.out.print("Status pendanaan PKM (1=lolos, 0=tidak lolos) : ");
            int pendanaan = sc.nextInt();

            if (pendanaan == 1) {
                if (dokumen >= 4) {
                    status = "Berhak memperoleh dana penghargaan (PKM lolos pendanaan).";
                } else {
                    status = "Dokumen tidak lengkap (kurang " + (4 - dokumen) + " dokumen). Dana penghargaan tidak diberikan.";
                }
            } else {
                status = "Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).";
            }
        } else if (jenis.equals("LAINNYA")) {
            // Cabang Lainnya
            status = "Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).";
        } else {
            status = "Jenis kegiatan tidak valid.";
        }

        System.out.println("Status : " + status);
    }
}
