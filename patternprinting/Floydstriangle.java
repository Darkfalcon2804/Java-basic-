package patternprinting;
import java.util.*;

public class Floydstriangle {
public static void main(String[] args){
    Scanner in= new Scanner(System.in);
    int n;
    System.out.print("Enter the number:  ");
    n=in.nextInt();
    int a=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(" "+a);
            a++;
        }
        System.out.print("\n");
    }
}
}
