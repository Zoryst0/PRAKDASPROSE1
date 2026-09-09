import java.util.Scanner;

public class TugasMatdasP2M2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n==== PROGRAM CEK KELULUSAN MAHASISWA ====");

        System.out.print("Masukkan nilai mahasiswa (0-100) : ");
        double nilai = input.nextDouble();

        System.out.print("Masukkan kehadiran (0-100%)      : ");
        double kehadiran = input.nextDouble();

        boolean p = nilai >= 60;
        boolean q = kehadiran >= 80;

        System.out.println("\n------------- H  A  S  I  L -------------");
        System.out.println("Nilai                            : " + nilai);
        System.out.println("Kehadiran                        : " + (int) kehadiran + "%");
        System.out.println("p (nilai >= 60)                  : " + p);
        System.out.println("q (kehadiran >= 80%)             : " + q);


        // PERHITUNGAN KELULUSAN
        if (!p) {
            System.out.println("Status                           : TIDAK LULUS");
        } if (!q) {
            System.out.println("Status                           : TIDAK LULUS");
        } else {
            System.out.println("Status                           : LULUS");
        }

        // DE MORGAN
        // !(p AND q) ≡ (!p) OR (!q)

        if (!p) {
            System.out.println("De Morgan                        : TIDAK LULUS");
        } else if (!q) {
            System.out.println("De Morgan                        : TIDAK LULUS");
        } else {
            System.out.println("De Morgan                        : LULUS");
        }

        input.close();
    }
}

// 013_Elia Beril_TI-1D_TugasMatdasPertemuan2