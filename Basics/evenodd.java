import java.util.*;
// tell number is even or odd
public class evenodd {
public static void main(String[] args){
    Scanner x=new Scanner(System.in);
    System.out.print("Enter the number: ");
    int a=x.nextInt();
    if(a%2==0){
        System.out.print(a+" is even number");
    }
    else System.out.print(a+" is odd number");
}
}
