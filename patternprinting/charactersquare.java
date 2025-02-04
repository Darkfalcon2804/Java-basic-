package patternprinting;
import java.util.*;
public class charactersquare {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print((char)(j+64));//for small alphabet add 96
            }
            System.out.print("\n");
    }
}
}

