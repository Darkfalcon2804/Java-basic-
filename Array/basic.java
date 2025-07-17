package Array;
//include intialization and printing
import java.util.*;
public class basic {
    public static void main (String[] args){
     Scanner in= new Scanner(System.in);
     int n;
     System.out.print("Enter the size of array: ");
     n=in.nextInt();
     int[] arr=new int[n];
     //input
     for(int i=0;i<n;i++){
         arr[i]=in.nextInt();
     }
     System.out.print("The output will be: ");
     //output
     for(int i=0;i<n;i++){
         System.out.print("\n"+arr[i]);
     }
    }
}
