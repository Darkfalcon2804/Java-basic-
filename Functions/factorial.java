package Functions;
import java.util.*;
public class factorial {
    public static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=in.nextInt();
        int x=fact(n);
        System.out.print("The factorial will be: "+x);
    }
}
