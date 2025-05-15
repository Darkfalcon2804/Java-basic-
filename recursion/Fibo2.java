package Recursion;
import java.util.*;
public class Fibo2 {
static Scanner in=new Scanner(System.in);
static void fibo(int a ,int b,int x){
if(x==0){
    return;
}
else{
    int c=a+b;
System.out.print(" "+c);
fibo(b,c,x-1);
}
}
public static void main(String[]args){
 int n;
 System.out.print("Enter the number till where you want fibonacci series: ");
 n=in.nextInt();
 int a=0,b=1;
 System.out.print(a+" "+b);
 fibo(a,b,n-2);
}
}
