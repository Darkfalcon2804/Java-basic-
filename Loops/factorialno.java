package loops;
import java.util.*;
public class factorialno {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=in.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.print("The factorial of the number is: "+fact);
    }
}
