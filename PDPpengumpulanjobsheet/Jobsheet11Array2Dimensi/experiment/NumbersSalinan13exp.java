import java.util.Arrays;

public class NumbersSalinan13exp {
    public static void main(String[] args) {
        int[][] myNumbers = new int[3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

        // 1. Menyalin referensi (bukan menyalin isi)
        int[][] salinan = myNumbers;
        salinan[0][0] = 99;
        System.out.println("1. Salinan referensi  -> myNumbers[0][0] = " + myNumbers[0][0]);
        myNumbers[0][0] = 0;

        // 2. clone() pada array 2 dimensi hanya menyalin lapisan luar (shallow copy)
        int[][] klon = myNumbers.clone();
        klon[0][0] = 55;
        System.out.println("2. clone(), ubah isi baris -> myNumbers[0][0] = " + myNumbers[0][0]);
        klon[1] = new int[]{7, 7, 7};
        System.out.println("   clone(), ganti baris    -> myNumbers[1] = " + Arrays.toString(myNumbers[1]));
        myNumbers[0][0] = 0;

        // 3. Salinan dalam (deep copy): setiap baris disalin sendiri
        int[][] salinanDalam = new int[myNumbers.length][];
        for (int i = 0; i < myNumbers.length; i++) {
            salinanDalam[i] = Arrays.copyOf(myNumbers[i], myNumbers[i].length);
        }
        salinanDalam[0][0] = 77;
        System.out.println("3. Deep copy           -> myNumbers[0][0] = " + myNumbers[0][0]);
        System.out.println("   salinanDalam        -> " + Arrays.deepToString(salinanDalam));
    }
}
