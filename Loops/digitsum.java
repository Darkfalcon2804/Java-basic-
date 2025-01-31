package loops;
import java.util.*;
public class digitsum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        System.out.print("Enter the digit: ");
        n=in.nextInt();
        int sum=0,ld;
        while(n>0){
            ld=n%10;
            sum+=ld;
            n/=10;
        }
        System.out.print("Sum of digit is: "+sum);
    }
}
