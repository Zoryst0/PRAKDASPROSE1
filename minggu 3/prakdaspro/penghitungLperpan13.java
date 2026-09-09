import java.util.Scanner;

public class penghitungLperpan13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int panjang;
        int lebar;
        int luas;

        System.out.print("Masukkan panjang : ");
        panjang = input.nextInt();

        System.out.print("Masukkan lebar : ");
        lebar = input.nextInt();

        luas = panjang * lebar;

        System.out.println("Luas persegi panjang = " + luas);
        input.close();
    }
}