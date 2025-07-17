package Array;
import java.util.*;
public class Sumproduct {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the size of array: ");
        n=in.nextInt();
        int [] arr=new int[n];
        // Input
        System.out.print("Enter the elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
             int sum=0,product=1;
        System.out.print("The sum and product of array is: "+"\n");
        for(int i=0;i<n;i++){
            sum+=arr[i];
            product*=arr[i];
        }
        System.out.print("Sum= "+sum+"\n");
        System.out.print("Product= "+product);
    }
}
