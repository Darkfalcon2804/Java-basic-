package loops;
import java.util.*;

public class digitnumb {
public static void main(String[] args){
    Scanner o=new Scanner(System.in);
    int n;
    System.out.print("Enter the number: ");
    n=o.nextInt();
    int count=0;
    while(n>0){
        n/=10;
        count++;
    }
    System.out.print("Numbers of digit: "+count);
}
}
