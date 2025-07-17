package Array;
import java.util.*;
public class insertarr {
    public static int []insert(int []arr,int pos,int data,int n){
        if(pos<0||pos>n){
            System.out.print("Invalid position");
            return arr;
        }
     int []newArr=new int[n+1];
        for(int i=0;i<pos;i++){
            newArr[i]=arr[i];
        }
        newArr[pos]=data;
        for(int i=pos;i<n;i++){
            newArr[i+1]=arr[i];
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
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array: ");
        n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the element of array: ");
        Iarray(arr, n, in);
        System.out.print("The array before inserting: " + "\n");
        Oarray(arr);
        int pos;
        System.out.print("Enter the position where you want to insert element: ");
        pos=in.nextInt();
        int data;
        System.out.print("Enter the data you want to insert: ");
        data=in.nextInt();
       arr= insert(arr,pos,data,n);
        System.out.print("After inserting the data array is: "+"\n");
        Oarray(arr);

    }
    }
