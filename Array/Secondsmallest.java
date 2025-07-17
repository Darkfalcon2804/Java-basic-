package Array;

import java.util.*;

public class Secondsmallest {
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
        int Ssmallest = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < smallest) {
                Ssmallest=smallest;
                smallest= arr[i];
            }
            else if(arr[i]<Ssmallest && arr[i]!=smallest){
                Ssmallest=arr[i];
            }
        }
        System.out.print("The smallest element= "+smallest+"\n");
        System.out.print("The second smallest element= "+Ssmallest);
    }

}
