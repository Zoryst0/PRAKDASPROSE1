import java.util.Scanner;

public class KalkulatorSwitch13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan angka pertama : ");
        double a = sc.nextDouble();
        System.out.print("Masukkan operator (+ - * / %) : ");
        char op = sc.next().charAt(0);
        System.out.print("Masukkan angka kedua   : ");
        double b = sc.nextDouble();

        double hasil = 0;
        boolean valid = true;

        switch (op) {
            case '+':
                hasil = a + b;
                break;
            case '-':
                hasil = a - b;
                break;
            case '*':
                hasil = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: pembagian dengan nol!");
                    valid = false;
                } else {
                    hasil = a / b;
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Error: modulus dengan nol!");
                    valid = false;
                } else {
                    hasil = a % b;
                }
                break;
            default:
                System.out.println("Operator tidak valid!");
                valid = false;
        }

        if (valid) {
            System.out.println(a + " " + op + " " + b + " = " + hasil);
        }
        sc.close();
    }
}
