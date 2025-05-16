package Recursion;
import java .util.*;
public class XpowerN {
    static Scanner in=new Scanner(System.in);
    static int calcpow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        else{
        int z=calcpow(x,n-1);
        int XpowerN=x*z;
        return XpowerN;
    }
    }
    public static void main(String[] args){
        int x;
        System.out.print("Enter the base: ");
        x=in.nextInt();
        int n;
        System.out.print("Enter the power: ");
        n=in.nextInt();
        int y=calcpow(x,n);
        System.out.print("The "+x+" raised to power "+n+" is "+y);
    }
}
