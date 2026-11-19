import java.util.Arrays;

public class Numbers13exp {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        // Kode 16: Arrays.toString() pada tiap baris
        System.out.println("--- Arrays.toString() per baris ---");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println(Arrays.toString(myNumbers[i]));
        }

        // Pertanyaan 3: Arrays.deepToString()
        System.out.println("--- Arrays.deepToString() ---");
        System.out.println(Arrays.deepToString(myNumbers));

        // Kode 17: panjang setiap baris
        System.out.println("--- Panjang setiap baris ---");
        for (int i = 0; i < myNumbers.length; i++) {
            System.out.println("Panjang baris ke-" + (i + 1) + ": " + myNumbers[i].length);
        }

        // Pertanyaan 7: mengganti baris pertama dengan array baru
        myNumbers[0] = new int[7];
        System.out.println("--- Setelah myNumbers[0] = new int[7] ---");
        System.out.println("myNumbers.length    : " + myNumbers.length);
        System.out.println("myNumbers[0].length : " + myNumbers[0].length);
    }
}
