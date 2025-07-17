package Array;
import java.util.*;
public class sortarrayinDO {
    public static void Iarray(int[] arr,int n,Scanner in){
        for(int i=0;i<n;i++) {
            arr[i]=in.nextInt();
        }
    }
    public static void Oarray(int[] arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.print("\n");
    }
    public static void Dosort(int[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array: ");
        n=in.nextInt();
        int [] arr=new int[n];
        System.out.print("Enter the element of array: ");
        Iarray(arr,n,in);
        System.out.print("The array before sorting: "+"\n");
        Oarray(arr,n);
        System.out.print("The sorted array(Decesending order): "+"\n");
        Dosort(arr,n);
        Oarray(arr,n);
    }
}
