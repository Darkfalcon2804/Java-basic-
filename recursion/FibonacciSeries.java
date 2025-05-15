package Recursion;
import java.util.*;
public class FibonacciSeries {
static Scanner in=new Scanner(System.in);
static int fibo(int x){
    if(x==1) {
        return 0;
    }
    if(x==2) return 1;
    else return fibo(x-1)+fibo(x-2);
}
 public static void main(String[] args){
     int n;
     System.out.print("Enter the element till where you want fibonacci series: ");
     n=in.nextInt();
     System.out.println("The fibonacci series is: ");
     for(int i=1;i<=n;i++){
         System.out.print(" "+fibo(i));
     }
 }
}
