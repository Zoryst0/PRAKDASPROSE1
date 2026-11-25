import java.util.Locale;
import java.util.Scanner;

public class RekapLaundryDinamis13assign {

    static Scanner sc = new Scanner(System.in);
    static Locale id = Locale.forLanguageTag("id-ID");

    static int[][] inputData(String[] layanan, String[] hari) {
        int[][] data = new int[layanan.length][hari.length];
        for (int i = 0; i < layanan.length; i++) {
            for (int j = 0; j < hari.length; j++) {
                System.out.print("Berat cucian " + layanan[i] + " | " + hari[j] + " (kg): ");
                data[i][j] = sc.nextInt();
            }
        }
        return data;
    }

    static void tampilTabel(String[] layanan, String[] hari, int[][] data) {
        System.out.println("--- Rekap Berat Cucian (kg) ---");
        System.out.print(String.format("%-14s", "Layanan"));
        for (String h : hari) {
            System.out.print(String.format("%10s", h));
        }
        System.out.println();
        for (int i = 0; i < data.length; i++) {
            System.out.print(String.format("%-14s", layanan[i]));
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(String.format("%10d", data[i][j]));
            }
            System.out.println();
        }
    }

    static int totalPerLayanan(int[][] data, int idxLayanan) {
        int total = 0;
        for (int j = 0; j < data[idxLayanan].length; j++) {
            total += data[idxLayanan][j];
        }
        return total;
    }

    static void tampilLayananTertinggi(String[] layanan, int[][] data) {
        int idxTertinggi = 0;
        for (int i = 1; i < data.length; i++) {
            if (totalPerLayanan(data, i) > totalPerLayanan(data, idxTertinggi)) {
                idxTertinggi = i;
            }
        }
        System.out.println("Layanan dengan cucian terbanyak: " + layanan[idxTertinggi]
                + " (" + totalPerLayanan(data, idxTertinggi) + " kg)");
    }

    static int hariTersibuk(int[][] data) {
        int idxTersibuk = 0;
        int totalTerbesar = -1;
        for (int j = 0; j < data[0].length; j++) {
            int totalHari = 0;
            for (int i = 0; i < data.length; i++) {
                totalHari += data[i][j];
            }
            if (totalHari > totalTerbesar) {
                totalTerbesar = totalHari;
                idxTersibuk = j;
            }
        }
        return idxTersibuk;
    }

    static void tampilPendapatan(String[] layanan, int[] harga, int[][] data) {
        System.out.println("--- Pendapatan Setiap Layanan ---");
        long totalPendapatan = 0;
        for (int i = 0; i < data.length; i++) {
            int berat = totalPerLayanan(data, i);
            long pendapatan = (long) berat * harga[i];
            totalPendapatan += pendapatan;
            System.out.println(String.format(id, "%-14s: %d kg x Rp%,d = Rp%,d", layanan[i], berat, harga[i], pendapatan));
        }
        System.out.println(String.format(id, "Total pendapatan: Rp%,d", totalPendapatan));
    }

    public static void main(String[] args) {
        System.out.println("=== Rekap Laundry (Dinamis) ===");
        System.out.print("Jumlah layanan: ");
        int jumlahLayanan = sc.nextInt();
        System.out.print("Jumlah hari: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine();

        if (jumlahLayanan <= 0 || jumlahHari <= 0) {
            System.out.println("Jumlah layanan dan jumlah hari harus lebih dari 0.");
            return;
        }

        String[] layanan = new String[jumlahLayanan];
        int[] harga = new int[jumlahLayanan];
        for (int i = 0; i < jumlahLayanan; i++) {
            System.out.print("Nama layanan ke-" + (i + 1) + ": ");
            layanan[i] = sc.nextLine();
            System.out.print("Harga per kg layanan ke-" + (i + 1) + ": ");
            harga[i] = sc.nextInt();
            sc.nextLine();
        }

        String[] hari = new String[jumlahHari];
        for (int j = 0; j < jumlahHari; j++) {
            hari[j] = "Hari ke-" + (j + 1);
        }

        int[][] data = inputData(layanan, hari);

        System.out.println();
        tampilTabel(layanan, hari, data);

        System.out.println();
        for (int i = 0; i < layanan.length; i++) {
            System.out.println("Total " + layanan[i] + ": " + totalPerLayanan(data, i) + " kg");
        }

        System.out.println();
        tampilLayananTertinggi(layanan, data);

        int idxHari = hariTersibuk(data);
        int totalHari = 0;
        for (int i = 0; i < data.length; i++) {
            totalHari += data[i][idxHari];
        }
        System.out.println("Hari tersibuk: " + hari[idxHari] + " (" + totalHari + " kg)");

        System.out.println();
        tampilPendapatan(layanan, harga, data);
    }
}
