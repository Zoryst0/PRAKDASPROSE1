import java.util.Scanner;

public class caseM1prakdasproP2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== PROGRAM MENGHITUNG GAJI BERSIH ===");

        System.out.print("Masukkan gaji pokok : Rp ");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan tunjangan anak : Rp ");
        double tunjanganAnak = input.nextDouble();

        System.out.print("Masukkan jumlah anak : ");
        int jumlahAnak = input.nextInt();

        double tunjangan = jumlahAnak * tunjanganAnak;
        double potongan = gajiPokok * 0.10;
        double gajiBersih = gajiPokok + tunjangan - potongan;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Tunjangan       : Rp " + tunjangan);
        System.out.println("Potongan pensiun: Rp " + potongan);
        System.out.println("Gaji bersih     : Rp " + gajiBersih);

        input.close();
    }
}
