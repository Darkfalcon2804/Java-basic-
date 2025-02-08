package Array.twodarray;
import java.util.*;
public class minelement {
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
    int min=arr1[0][0];
    int minrow=0;
    int mincolumn=0;
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            if(arr1[i][j]<min){
                min=arr1[i][j];
                minrow=i;
                mincolumn=j;
            }
        }}
    System.out.print("The maximum element is stored at: "+minrow+" "+mincolumn+"\n");
    System.out.print("The max element of array: "+min+"\n");

}
}
