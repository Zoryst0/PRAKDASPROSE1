package PDPpengumpulanjobsheet.Jobsheet12Fungsi.experiment;

public class LacakFungsi13exp {
    static int kali2(int x) {
        return x * 2;
    }

    static int tambah(int a, int b) {
        return a + b;
    }

    static void cetak(int n) {
        for (int i = n; i > 0; i -= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int a = kali2(3);
        int b = tambah(a, kali2(1));
        cetak(b);
        cetak(tambah(b, -a) + 1);
    }
}
