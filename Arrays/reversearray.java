package Array;
import java.util.*;
public class reversearray {
    public static void Parray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void Reverse(int []arr,int n){
        int s=0;
        int e=n-1;
        while(s<e){
           int temp=arr[s];
           arr[s]=arr[e];
           arr[e]=temp;
           s++;e--;
        }
        System.out.print("After reversing the array: "+"\n");
        Parray(arr);
    }
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
        Reverse(arr,n);
    }
}