import java.util.Scanner;

public class T2P2daspro13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input by ell
        System.out.println("=== PROGRAM MENGHITUNG LUAS TANAH PAK TONO ===");

        System.out.print("Masukkan panjang tanah       : ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar tanah         : ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan diameter kolam      : ");
        double diameter = input.nextDouble();

        System.out.print("Masukkan sisi taman          : ");
        double sisi = input.nextDouble();

        // Proses menghitung 🔥
        double phi = 3.14;
        double jariJari = diameter / 2;

        double luasTanah = panjang * lebar;
        double luasKolam = phi * jariJari * jariJari;
        double luasTaman = sisi * sisi;

        double luasDigunakan = luasKolam + luasTaman;
        double luasTidakDigunakan = luasTanah - luasDigunakan;

        // Output by ell
        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Luas Tanah                 : " + luasTanah + " m2");
        System.out.println("Jari-jari Kolam            : " + jariJari + " m");
        System.out.println("Luas Kolam                 : " + luasKolam + " m2");
        System.out.println("Luas Taman                 : " + luasTaman + " m2");
        System.out.println("Luas yang Digunakan        : " + luasDigunakan + " m2");
        System.out.println("Luas Tidak Digunakan       : " + luasTidakDigunakan + " m2");

        input.close();
    }
}