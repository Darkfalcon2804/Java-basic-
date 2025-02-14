//Swap two variables without using extra varaiable and arithmetic operators

package Functions;
import java.util.*;
public class swapxor {
    public static void swap(int a,int b){
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.print("After Swapping \n"+"A: "+a+" and b:"+b+"\n");
    }
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a;
        System.out.print("Enter the value of A: ");
        a=in.nextInt();
        int b;
        System.out.print("Enter the value of B: ");
        b=in.nextInt();
        System.out.print("Before Swapping \n"+"A: "+a+" and b:"+b+"\n");
        swap(a,b);
    }
}
