package Array.twodarray;
import java.util.*;
public class transpose {
public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n;
    System.out.print("Enter the number of rows: ");
    n=in.nextInt();
    int m;
    System.out.print("Enter the number of columns: ");
    m=in.nextInt();
    int [][]arr=new int [n][m];
    int [][]arr1=new int [m][n];
    System.out.print("Enter the element of array: ");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr[i][j]=in.nextInt();
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            arr1[j][i]=arr[i][j];
        }
    }
    System.out.print("The original matrix is: "+"\n");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.print("\n");
    }
    System.out.print("The transpose of the matrix is:  "+"\n");
    for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            System.out.print(arr1[i][j]+" ");
        }
        System.out.print("\n");
    }
}
}
