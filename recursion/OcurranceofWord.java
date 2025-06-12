package Recursion;
import java.util.*;
public class OcurranceofWord {
    static Scanner in =new Scanner(System.in);
    public  static int firstocc=-1;
    public static int lastocc=-1;
    public static void Ocurrance(String n,int index,char element){
        if(index==n.length()){
            System.out.println("The first occurance: "+firstocc);
            System.out.println("The second occurance: "+lastocc);
            return;
        }
  char currChar=n.charAt(index);
  if(currChar==element){
      if(firstocc==-1){
          firstocc=index;
      }
      else{
          lastocc=index;
      }
  }
  Ocurrance(n,index+1,element);
    }
    public static void main(String[] args){
    String n;
    System.out.print("Enter the string: ");
    n=in.nextLine();
    char ele;
    System.out.print("Element which you want to find the prefernce: ");
    ele=in.next().charAt(0);
    Ocurrance(n,0,ele);
}
}
