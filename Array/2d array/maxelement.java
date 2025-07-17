package Array.twodarray;
import java.util.*;
public class maxelement {
public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n;
    System.out.print("Enter the row of array: ");
    n=in.nextInt();
    int m;
    System.out.print("Enter the column of array: ");
    m=in.nextInt();
    int [][] arr1=new int[n][m];
        System.out.print("Enter the element of array1: ");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr1[i][j]=in.nextInt();
        }
    }
    int max=arr1[0][0];
      int maxrow=0;
    int maxcolumn=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr1[i][j]>max){
        max=arr1[i][j];
        maxrow=i;
        maxcolumn=j;
        }
    }}
        System.out.print("The maximum element is stored at: "+maxrow+" "+maxcolumn+"\n");
        System.out.print("The max element of array: "+max+"\n");

}}
