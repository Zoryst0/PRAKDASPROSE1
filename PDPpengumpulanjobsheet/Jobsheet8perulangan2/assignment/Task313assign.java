// Task313assign.java (Assignment 3: Sales Recap for Several Stores)
import java.util.Scanner;

public class Task313assign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stores;

        do {
            System.out.print("Enter the number of stores: ");
            stores = sc.nextInt();
            if (stores < 1) {
                System.out.println("Number of stores must be at least 1. Retry!");
            }
        } while (stores < 1);

        int grandTotalItems = 0;
        int bestStore = 0;
        int mostItems = -1;          // -1: toko pertama selalu tercatat (walau 0 barang)

        for (int s = 1; s <= stores; s++) {
            int customers;
            do {
                System.out.print("Enter the number of customers at store " + s + ": ");
                customers = sc.nextInt();
                if (customers < 0) {
                    System.out.println("Must not be negative. Retry!");
                }
            } while (customers < 0);

            int storeItems = 0;
            for (int c = 1; c <= customers; c++) {
                int items;
                do {
                    System.out.print("  Items bought by customer " + c + ": ");
                    items = sc.nextInt();
                    if (items < 0) {
                        System.out.println("  Must not be negative. Retry!");
                    }
                } while (items < 0);
                storeItems += items;
            }

            System.out.println("Store " + s + " - customers: " + customers
                    + ", total items: " + storeItems);

            grandTotalItems += storeItems;
            if (storeItems > mostItems) {      // '>' : jika seri, toko bernomor kecil tetap dipilih
                mostItems = storeItems;
                bestStore = s;
            }
        }

        System.out.println("Total items across all stores: " + grandTotalItems);
        System.out.println("Store with the most items: " + bestStore);
        sc.close();
    }
}
