public class Bioskop13exp {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";

        // Langkah 4: menampilkan seluruh elemen
        System.out.println("=== Daftar penonton ===");
        System.out.printf("%s \t %s\n", penonton[0][0], penonton[0][1]);
        System.out.printf("%s \t %s\n", penonton[1][0], penonton[1][1]);
        System.out.printf("%s \t %s\n", penonton[2][0], penonton[2][1]);
        System.out.printf("%s \t %s\n", penonton[3][0], penonton[3][1]);

        // Kode 6: panjang array dan panjang tiap baris
        System.out.println("\n=== Kode 6: length ===");
        System.out.println(penonton.length);
        System.out.println(penonton[0].length);
        System.out.println(penonton[1].length);
        System.out.println(penonton[2].length);
        System.out.println(penonton[3].length);

        // Kode 7: panjang tiap baris dengan for
        System.out.println("\n=== Kode 7: for ===");
        System.out.println(penonton.length);
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + penonton[i].length);
        }

        // Kode 8: panjang tiap baris dengan foreach
        System.out.println("\n=== Kode 8: foreach ===");
        System.out.println(penonton.length);
        for (String[] barisPenonton : penonton) {
            System.out.println("Panjang baris: " + barisPenonton.length);
        }

        // Kode 9: penonton baris ke-3 dengan for
        System.out.println("\n=== Kode 9: baris ke-3 (for) ===");
        System.out.println("Penonton pada baris ke-3: ");
        for (int i = 0; i < penonton[2].length; i++) {
            System.out.println(penonton[2][i]);
        }

        // Kode 10: penonton baris ke-3 dengan foreach
        System.out.println("\n=== Kode 10: baris ke-3 (foreach) ===");
        System.out.println("Penonton pada baris ke-3: ");
        for (String i : penonton[2]) {
            System.out.println(i);
        }

        // Kode 11: setiap baris dengan String.join()
        System.out.println("\n=== Kode 11: String.join() ===");
        for (int i = 0; i < penonton.length; i++) {
            System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + String.join(", ", penonton[i]));
        }
    }
}
