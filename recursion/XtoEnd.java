//Move all 'x' to the end of string??
package Recursion;
import java.util.*;
public class XtoEnd {
    static Scanner in=new Scanner(System.in);
    public static void moveAllX(String n,int index,int count,String newString){
        if(index==n.length()){
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.print("The string  after moving X into end: "+newString);
            return;
        }
    char currChar=n.charAt(index);
    if(currChar=='x'){
        count++;
        moveAllX(n,index+1,count,newString);
    }
    else {
        newString+=currChar;
        moveAllX(n,index+1,count,newString);
    }
    }
    public static void main(String[] args){
        String n;
        System.out.print("Enter the string(containing x): ");
        n=in.nextLine();
        moveAllX(n,0,0,"");

    }
}
