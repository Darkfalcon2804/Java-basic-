package Recursion;
import java.util.*;
import java.lang.Math;
public class towerofhanoi {
 static Scanner in=new Scanner(System.in);
 static int p(int a,int n){
     return (int)Math.pow(a,n); // int here in this line doing explicit casting work because pow function gives double but we are receving it in int variable thst why explicit cast is used
 }
 static void hanoi(int n,String s,String h,String d){
if(n==0){
    return ;
}
hanoi(n-1,s,d,h);
System.out.print(s+"-->"+d+"\n");
hanoi(n-1,h,s,d);
return;
 }

 public static void main(String[] args){
     int n;
     System.out.print("Enter the number of disk: ");
     n=in.nextInt();
     int  x=p(2,n)-1;// formula to calculate minimum moves of disk are 2^n-1;
System.out.print("The minimum moves will be: "+x+"\n");
hanoi(n,"s","h","d");
 }

}
