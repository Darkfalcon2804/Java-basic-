package patternprinting;
import java.util.*;
public class Numberzone {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=in.nextInt();
        int min=0;
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
            int a=i;
            if(i>n)a=2*n-i;
                    int b=j;
            if(j>n)b=2*n-j;
            if(a<b)min=a;
            else min=b;
            System.out.print(min);
            }
            System.out.print("\n");
        }
    }
}
//When you want 1 is in centre print(n+1-min) but if you want input is in centre print(min)