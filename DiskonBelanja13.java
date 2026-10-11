import java.util.Scanner;

public class DiskonBelanja13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Total belanja (Rp)          : ");
        double total = sc.nextDouble();
        System.out.print("Member? (1 = Ya, 0 = Tidak) : ");
        int member = sc.nextInt();

        double persen;

        if (total >= 100000) {
            if (member == 1) {
                persen = 20;
            } else {
                persen = 10;
            }
        } else if (total >= 50000) {
            if (member == 1) {
                persen = 10;
            } else {
                persen = 5;
            }
        } else {
            if (member == 1) {
                persen = 5;
            } else {
                persen = 0;
            }
        }

        double diskon = total * persen / 100;
        double bayar = total - diskon;

        System.out.println("----------------------------");
        System.out.println("Total belanja : Rp" + total);
        System.out.println("Diskon        : " + persen + "% (Rp" + diskon + ")");
        System.out.println("Total bayar   : Rp" + bayar);
        sc.close();
    }
}
