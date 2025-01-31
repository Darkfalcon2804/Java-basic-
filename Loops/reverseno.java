package loops;
import java.util.*;
public class reverseno {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter thhe number: ");
        n=in.nextInt();
        int ld,rev=0;
        while(n>0){
            ld=n%10;
            rev=rev*10+ld;
            n/=10;
        }
        System.out.print("The reverse of the number is "+rev);
    }
}
