package Functions;
import java.util.*;
public class Multiplytwo {
    public static int multi(int a,int b){
        return a*b;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a;
        System.out.print("Enter the 1st number: ");
        a=in.nextInt();
        int b;
        System.out.print("Enter the 2nd number: ");
        b=in.nextInt();
        int Mul=multi(a,b);
        System.out.print("The multiplication of two number is: "+Mul);
    }
}
