package loops;
import java.util.*;

public class evenoddno
{
    public static void main(String[] args){
        Scanner t=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=t.nextInt();
        System.out.print("The even number: "+"\n");
        for(int i=1;i<=n;i++){
            if(i%2==0) System.out.println(i);
        }
        System.out.print("The odd number: "+"\n");
        for(int i=1;i<=n;i++){
            if(i%2!=0) System.out.println(i);
        }

    }
}
