package Array;
import java.util.*;
public class Linearsearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the number:  ");
        n = in.nextInt();
        int x;
        System.out.print("Enter the number you want to search: ");
        x = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
                  if(arr[i]==x) {
                      System.out.print("The number is found at: " + i + " position");
                      return;
                  }
        }
          System.out.print("The number "+x+" doesn't exist in the array");
    }
}