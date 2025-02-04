package Functions;
import java.util.*;
public class Combinations {
   public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static int ncr(int n,int r){
        return fact(n)/(fact(r)*fact(n-r));
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=in.nextInt();
        int r;
        System.out.print("Enter the number: ");
        r=in.nextInt();
        int combination=ncr(n,r);
        System.out.print("The combination of is: "+combination);
    }
}
