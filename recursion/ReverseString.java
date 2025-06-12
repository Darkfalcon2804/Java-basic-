package Recursion;
import java.util.*;
public class ReverseString {
static Scanner in=new Scanner(System.in);
static void rev(String n,int index){
if(index==0){
    System.out.println(n.charAt(index));
    return;
}
System.out.println(n.charAt(index));
rev(n,index-1);
}

public static void main(String[] args){
    String n;
    System.out.print("Enter the String: ");
    n=in.nextLine();
    rev(n,n.length()-1);
}

}
