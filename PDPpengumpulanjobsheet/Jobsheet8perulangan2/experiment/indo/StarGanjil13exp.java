// StarGanjil13exp.java (Pertanyaan 3: cetak bilangan ganjil positif <= n)
import java.util.Scanner;

public class StarGanjil13exp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        sc.close();
    }
}
