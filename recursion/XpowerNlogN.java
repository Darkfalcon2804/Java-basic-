package Recursion;
import java.util.*;
public class XpowerNlogN {
public static Scanner in=new Scanner (System.in);
static int calpowlogn(int x,int n){
    if(n==0){
        return 1;
    }
    if(x==0){
        return 0;
    }
    else{
        if(n%2==0){  //n is even
            return calpowlogn(x,n/2)*calpowlogn(x,n/2);
        }
        else {  //n is odd
            return calpowlogn(x,n/2)*calpowlogn(x,n/2) *x;
        }
    }
}
public static  void main(String[] args){
   int x;
   System.out.print("Enter the base: ");
   x=in.nextInt();
   int n;
   System.out.print("Enter the power: ");
   n=in.nextInt();
    int y=calpowlogn(x,n);
    System.out.print("The "+x+" power "+n+" is:"+y);
}
}
