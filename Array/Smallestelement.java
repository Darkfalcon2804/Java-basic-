package Array;

import java.util.*;

public class Smallestelement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array: ");
        n = in.nextInt();
        int[] arr = new int[n];
        // Input
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] <smallest) {
                smallest= arr[i];
            }
        }
        System.out.print("The  smallest element= "+smallest);
    }

}
