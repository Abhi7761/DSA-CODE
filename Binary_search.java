package Alogrithms;

import java.util.Scanner;

public class Binary_search {
    public static int Bin_search(int num[], int target) {
        int start = 0;
        int end = num.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (num[mid] == target) {// found
                return mid;
            } else if (num[mid] < target) {
                start = mid + 1;
            } else if (num[mid] > target) {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 6, 8, 10, 12, 14, };
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int result = Bin_search(num, key);
        System.out.println("index is " + result);

        sc.close();
    }

}