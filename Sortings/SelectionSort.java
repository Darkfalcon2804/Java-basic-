package Sorting;
import java.util.*;
public class SelectionSort {
   static Scanner in=new Scanner(System.in);
    static void inputarr(int n,int[]arr){
        System.out.print("Enter the element of array: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
    }
    static void selectionsort(int []arr,int n){
        for(int i=0;i<n-1;i++){
            int minele=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minele]){
                    minele=j;
                }
            }
            int temp=arr[minele];
            arr[minele]=arr[i];
            arr[i]=temp;
        }

    }
    static void outputarr(int n,int[]arr) {
        System.out.println("The sorted array is: ");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
public static void main(String[]args){
    int n;
    System.out.print("Enter the size of array: ");
    n=in.nextInt();
    int []arr=new int[n];
    inputarr(n,arr);
    selectionsort(arr,n);
    outputarr(n,arr);
}
}
