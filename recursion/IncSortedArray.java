package Recursion;
import java.util.*;
public class IncSortedArray {
    static Scanner in=new Scanner(System.in);
    public static boolean IncSort(int [] arr,int index){
    if(index==arr.length-1){
        return true;
    }
        if(arr[index]<arr[index+1]){
            return IncSort(arr,index+1);
        }
        else {return false;}
    }
    public static void main(String[] args){
     int n;
  System.out.print("Enter the size of array: ");
  n=in.nextInt();
  System.out.print("Enter elements of array: ");
  int []arr=new int[n];
  for(int i=0;i<n;i++){
      arr[i]=in.nextInt();
  }
   boolean y=IncSort(arr,0);
   if(y==true){
       System.out.println("The array is sorted in increasing order");
   }
   else System.out.println("The array is not sorted");
    }
}
