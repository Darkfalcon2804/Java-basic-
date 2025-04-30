package Sorting;
import java.util.*;
public class BubbleSort {
    public static void printarr(int []arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array: ");
        n=in.nextInt();
        int []arr=new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        //Bubble sort
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("The sorted array is : ");
     printarr(arr,n);
    }

}
