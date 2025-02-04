package Functions;
import java.util.*;
public class Fibonacciseries {
    public static void series(int n){
        int first=0,second=1,next;
        System.out.print("The series is: "+first+" "+second);
        for(int i=3;i<=n;i++){
            next=first+second;
            System.out.print(" "+next);
            first=second;
            second=next;
        }
    }
public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n;
    System.out.print("Enter the number: ");
    n=in.nextInt();
    series(n);

}
}
