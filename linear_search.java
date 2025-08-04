package Alogrithms;

import java.util.Scanner;

public class linear_search {

    public static int linear_search_funtion(String a[], String key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(key)) {
                return i;

            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a[] = { "samosa", "chhat", "belpuri", "sandwich", "burger", "pizza", "briyani" };
        System.out.println("Enter your item");
        String b = sc.nextLine();
        int key = linear_search_funtion(a, b);
        if (key == -1) {
            System.out.println("not found");

        } else {
            System.out.println("Item found at index" + key);
        }
        sc.close();

    }

}