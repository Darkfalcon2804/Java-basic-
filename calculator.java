import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        char ch;
        System.out.print("Enter the operator: ");
        ch=sc.next().charAt(0);//this is special case remember we take char as input like this
        int a,b;
        System.out.print("Enter the value of A: ");
        a=sc.nextInt();
        System.out.print("Enter the value of B: ");
        b=sc.nextInt();
        switch(ch){
            case'+':System.out.print("Addition: "+(a+b));
            break;
            case'-':System.out.print("Subtraction: "+(a-b));
                break;
            case'*':System.out.print("Multiply: "+(a*b));
                break;
            case'/':System.out.print("Division: "+(a/b));
                break;
            default:System.out.print("Invalid operator");
        }
    }
}
