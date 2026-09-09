import java.util.Scanner;
public class absensi13 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlahSiswa;
        System.out.print("Masukkan jumlah siswa: ");
        jumlahSiswa = input.nextInt();
        String[] namaSiswa = new String[jumlahSiswa];
        int[] absenSiswa = new int[jumlahSiswa];

        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nama siswa ke-" + (i + 1) + ": ");
            namaSiswa[i] = input.next();
            System.out.print("Masukkan absen siswa ke-" + (i + 1) + ": ");
            absenSiswa[i] = input.nextInt();
        }

        System.out.println("\nDaftar Absensi Siswa:");
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("Nama: " + namaSiswa[i] + ", Absen: " + absenSiswa[i]);
        input.close();
        }
    }

}
