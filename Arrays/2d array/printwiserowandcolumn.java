package Array.twodarray;
import java.util.*;
public class printwiserowandcolumn {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the row:  ");
        n=in.nextInt();
        int m;
        System.out.print("Enter the column:  ");
        m=in.nextInt();
    int [][]arr=new int[n][m];
    System.out.print("The sum of rows are: "+"\n");
    //row wise sum
        for(int i=0;i<n;i++){
            int rowsum=0;
            for(int j=0;j<m;j++){
                rowsum+=arr[i][j];
            }
            System.out.println("Sum of rows: "+(i+1)+" = "+rowsum);
        }
        //columnwise
        System.out.print("The sum of columns are: "+"\n");
        for(int j=0;j<m;j++){
            int colsum=0;
            for(int i=0;i<n;i++){
                colsum+=arr[i][j];
            }
            System.out.println("Sum of columns: "+(j+1)+" = "+colsum);
        }
    }
}
