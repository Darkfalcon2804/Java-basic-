package Array;
import java.util.*;
public class Largestelement {
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
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
   System.out.print("The largest element= "+largest);
    }
    }
