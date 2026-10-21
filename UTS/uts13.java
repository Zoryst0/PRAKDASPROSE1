import java.util.Scanner;

public class uts13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Senjata (AR/SMG/SR): ");
        String senjata = sc.nextLine();
        boolean senjataValid = senjata.equalsIgnoreCase("AR")
                || senjata.equalsIgnoreCase("SMG")
                || senjata.equalsIgnoreCase("SR");

        if (!senjataValid) {
            System.out.println("Input tidak valid. Pastikan senjata = (AR/SMG/SR) dan hitbox = (kepala/badan).");
            sc.close();
            return;
        }

        System.out.print("hitbox (kepala/badan): ");
        String hitbox = sc.nextLine();

        boolean hitboxValid = hitbox.equalsIgnoreCase("kepala")
                || hitbox.equalsIgnoreCase("badan");

        if (!hitboxValid) {
            System.out.println("Input tidak valid. Pastikan senjata = (AR/SMG/SR) dan hitbox = (kepala/badan).");
        } else if (senjata.equalsIgnoreCase("SR") && hitbox.equalsIgnoreCase("kepala")) {
            System.out.println("HEADSHOT! Musuh langsung knock.");
        } else {
            int basedmg = 0;
            int vest = 0;

            if (senjata.equalsIgnoreCase("AR")) {
                if (hitbox.equalsIgnoreCase("kepala")) {
                    basedmg = 60;
                } else {
                    basedmg = 35;
                    vest = 20;
                }
            } else if (senjata.equalsIgnoreCase("SMG")) {
                if (hitbox.equalsIgnoreCase("kepala")) {
                    basedmg = 45;
                } else {
                    basedmg = 25;
                }
                vest = 30;
            } else {
                basedmg = 90;
            }

            double dmgreduced = basedmg * vest / 100.0;
            double finaldmg = basedmg - dmgreduced;

            System.out.println("Damage dasar: " + basedmg);
            System.out.println("Pengurangan rompi: " + vest + "% (" + dmgreduced + ")");
            System.out.println("Damage akhir: " + finaldmg);
        }

        sc.close();
    }
}