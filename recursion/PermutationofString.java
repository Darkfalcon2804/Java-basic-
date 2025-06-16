package Recursion;
import java.util.*;
public class PermutationofString {
    static  Scanner in=new Scanner(System.in);
    public static void permutations(String n,String newString){
  if(n.length()==0){
      System.out.println( newString);
  }
  for(int i=0;i<n.length();i++){
      char Currchar=n.charAt(i);
       String nStr=n.substring(0,i)+n.substring(i+1);
       permutations(nStr,newString+Currchar);
  }
}
    public static void main(String[] args){
    String n;
    System.out.print("Enter the string: ");
    n=in.nextLine();
    permutations(n,"");
}
}
