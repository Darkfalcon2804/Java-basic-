package Recursion;
import java.util.*;
public class Factorial
{
    static Scanner in=new Scanner(System.in);
    static int fact(int n){
        if(n==1||n==0){
            return 1;
        }
        else {
            return n*fact(n-1);
        }
    }
    public static void main(String[] args){
        int n;
        System.out.print("Enter the value of n: ");
        n= in.nextInt();
        int x=fact(n);
     System.out.print("The factorial of "+n+" is: "+x);
    }

}
