package loops;
import java.util.*;
public class armstrong {
public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n;
    System.out.print("Enter the number: ");
    n=in.nextInt();
    int t=n;
    int ld,count=0,AS=0;
    while(n>0){
        ld=n%10;
        n/=10;
        count++;
    }
    n=t;
    while(n>0){
        ld=n%10;
        n/=10;
        AS+=Math.pow(ld,count);
    }
    if(AS==t) System.out.print("Arm Strong");
    else System.out.print("Not armstrong");
}
}
