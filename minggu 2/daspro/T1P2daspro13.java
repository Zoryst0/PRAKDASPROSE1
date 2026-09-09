import java.util.Scanner;

public class T1P2daspro13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input by ell
        System.out.println("=== PROGRAM MENGHITUNG GAJI BERSIH PAK DANUR ===");

        System.out.print("Masukkan gaji pokok : Rp ");
        double gajiPokok = input.nextDouble();

        System.out.print("Masukkan jumlah anak : ");
        int jumlahAnak = input.nextInt();

        System.out.print("Masukkan tunjangan/anak : Rp ");
        double tunjanganPerAnak = input.nextDouble();

        System.out.print("Masukkan potongan pensiun% : ");
        double persenPensiun = input.nextDouble();

        // Proses mengira 🤯
        double totalTunjangan = jumlahAnak * tunjanganPerAnak;
        double potonganPensiun = gajiPokok * persenPensiun / 100;
        double gajiBersih = gajiPokok + totalTunjangan - potonganPensiun;

        // Output by ell
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Gaji Pokok : Rp " + gajiPokok);
        System.out.println("Jumlah Anak : " + jumlahAnak);
        System.out.println("Total Tunjangan : Rp " + totalTunjangan);
        System.out.println("Potongan Pensiun : Rp " + potonganPensiun);
        System.out.println("Gaji Bersih : Rp " + gajiBersih);

        input.close();
    }
}