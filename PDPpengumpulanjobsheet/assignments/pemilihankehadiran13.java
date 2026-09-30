import java.util.Scanner;

public class pemilihankehadiran13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("--- PRINT KRS SIAKAD ---");
    System.out.print("Has UKT been paid? (true/false): ");
    boolean uktPaid = sc.nextBoolean();

    String message = (uktPaid) ? "UKT Payment verified\nPlease print your KRS and ask your DPA to sign it" : "Registration rejected. Please pay your UKT first";
    System.out.println(message);
    sc.close();
  }
}