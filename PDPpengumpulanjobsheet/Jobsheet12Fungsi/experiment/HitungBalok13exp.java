package PDPpengumpulanjobsheet.Jobsheet12Fungsi.experiment;

import java.util.Scanner;

public class HitungBalok13exp {

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;
    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;
    }

    // Percobaan 5, Pertanyaan 4: memanfaatkan hitungLuas
    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        return 2 * (hitungLuas(p, l) + hitungLuas(p, t) + hitungLuas(l, t));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.println("Masukkan panjang");
        p = input.nextInt();

        System.out.println("Masukkan lebar");
        l = input.nextInt();

        System.out.println("Masukkan tinggi");
        t = input.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah " + vol);

        System.out.println("Luas Permukaan Balok adalah " + hitungLuasPermukaanBalok(p, l, t));
        input.close();

        // Pertanyaan 4: tiga balok dengan ukuran berbeda (p, l, t)
        int[][] balok = {{4, 3, 5}, {10, 2, 6}, {7, 7, 7}};
        System.out.println();
        for (int i = 0; i < balok.length; i++) {
            int pp = balok[i][0], ll = balok[i][1], tt = balok[i][2];
            System.out.println("Balok ke-" + (i + 1) + " (" + pp + " x " + ll + " x " + tt + "): luas permukaan = "
                    + hitungLuasPermukaanBalok(pp, ll, tt) + ", volume = " + hitungVolume(tt, pp, ll));
        }
    }
}
