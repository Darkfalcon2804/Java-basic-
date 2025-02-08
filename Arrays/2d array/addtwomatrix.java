package Array.twodarray;
import java.util.*;

public class addtwomatrix {
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

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the row of array: ");
        n=in.nextInt();
        int m;
        System.out.print("Enter the column of array: ");
        m=in.nextInt();
        int [][] arr1=new int[n][m];
        int [][] arr2=new int[n][m];
        System.out.print("Enter the element of array1: ");
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    arr1[i][j]=in.nextInt();
                }
            }
        System.out.print("Enter the element of array2: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr2[i][j]=in.nextInt();
            }
        }
        int [][]arr3=new int[n][m];
        System.out.print("The sum of two matrix is:  "+"\n");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
               arr3[i][j]=arr1[i][j]+arr2[i][j];
               System.out.print(" "+arr3[i][j]);
            }
            System.out.print("\n");
        }

    }
}
