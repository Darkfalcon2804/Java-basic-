package Recursion;
import java.util.*;
public class printNtoOne {
 static Scanner in=new Scanner(System.in);
 static void Numb(int n){
     if(n==0){
         return;
     }
     else {
         System.out.print("  "+n);
         Numb(n-1);
     }
 }
    public static void main(String[]args){
        int n;
        System.out.print("Enter the the value: ");
        n=in.nextInt();
        Numb(n);
    }
}
