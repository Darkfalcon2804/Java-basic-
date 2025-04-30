package Sorting;
import java.util.*;

public class InsertionSort {
static Scanner in=new Scanner(System.in);
static void inputarr(int n,int[]arr){
    for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
    }
}
static void InsertionSort(int n,int []arr){
for(int i=1;i<n;i++){
    int curr=arr[i];
    int j=i-1;
    while(j>=0&&arr[j]>curr){
        arr[j+1]=arr[j];
        j--;
    }
    arr[j+1]=curr;
}
}
static void outputarr(int n,int[]arr){
    System.out.print("The sorted element is: ");
    for(int i=0;i<n;i++){
        System.out.print(" "+arr[i]);
    }
}

    public static void main(String[] args){
    int n;
    System.out.print("Enter the size of array: ");
    n=in.nextInt();
    int [] arr=new int[n];
    System.out.print("Enter the element of array: ");
    inputarr(n,arr);
    InsertionSort(n,arr);
  outputarr(n,arr);
}
}
