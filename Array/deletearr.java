package Array;
import java.util.*;
public class deletearr {
    public static int []delete(int []arr,int pos,int n){
        if(pos<0||pos>n){
            System.out.print("Invalid position");
            return arr;
        }
        int []newArr=new int[n-1];
        for(int i=0;i<pos;i++){
            newArr[i]=arr[i];
        }
        for(int i=pos;i<n-1;i++){
            newArr[i]=arr[i+1];
        }
        return newArr;
    }
    public static void Iarray(int[] arr,int n,Scanner in){
        for(int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }
    }
    public static void Oarray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.print("\n");
    }
public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int n;
    System.out.print("Enter the size of array: ");
    n = in.nextInt();
    int[] arr = new int[n];
    System.out.print("Enter the element of array: ");
    Iarray(arr, n, in);
    System.out.print("The array before deleting: " + "\n");
    Oarray(arr);
    int pos;
    System.out.print("Enter the position where you want to delete element: ");
    pos=in.nextInt();
    arr= delete(arr,pos,n);
    System.out.print("After deleting the data array is: "+"\n");
    Oarray(arr);

}
}
