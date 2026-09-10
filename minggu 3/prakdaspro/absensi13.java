import java.util.Scanner;

public class absensi13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        if (databaseAbsensi13.isStudentInClass(nama)) {
            int absen = databaseAbsensi13.getAbsenNumber(nama);

            System.out.println("\nKonfirmasi kehadiran");
            System.out.println("Nama: " + nama);
            System.out.println("Nomor absen: " + absen);
            System.out.println("Status: Hadir");
            System.out.println("Terima kasih, Anda telah hadir.");
        } else {
            System.out.print("Nama belum terdaftar di kelas. Apakah ingin menambah ke kelas? (ya/tidak): ");
            String jawab = input.nextLine();

            if (jawab.equalsIgnoreCase("ya")) {
                databaseAbsensi13.addStudent(nama);
                int absen = databaseAbsensi13.getAbsenNumber(nama);

                System.out.println("\nNama baru berhasil ditambahkan.");
                System.out.println("Nomor absen otomatis: " + absen);
                System.out.println("Status: Hadir");
            } else {
                System.out.println("\nNama tidak terdaftar di kelas ini.");
            }
        }

        input.close();
    }
}
// import data from another file 10/09/26