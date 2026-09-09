import java.util.Scanner;

public class hitungtotbay13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int harga;
        double potongan;
        double jml_bayar;
        double diskon = 0.15;

        System.out.print("Masukkan harga : Rp ");
        harga = sc.nextInt();

        potongan = diskon * harga;

        jml_bayar = harga - potongan;

        System.out.println("Potongan : Rp " + potongan);
        System.out.println("Jumlah bayar : Rp " + jml_bayar);
        sc.close();
        
    }
}