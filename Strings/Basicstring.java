package Strings;
import java.util.*;
public class Basicstring {
public static void  main(String[] args){
    Scanner in =new Scanner(System.in);
    String str="Bhavesh";
    System.out.print(str +"\n");
    //To get the length of array there is built in function which is .length()
   // int len=str.length();
   // System.out.println("The length of str is: "+len) ;
   //To access any array loaction of string we cant do char ch=str[3] it works in c++ but not in java so there is special built in fnction called .charAt();
    //System.out.println("Whats the char at position 3 in string str "+str.charAt(3));
// The one more inbuilt function of string in indexOf in this we give the character and the indexOf function find the character in the string and gives it index
    //System.out.println("Give the index of v in string str"+str.indexOf("v"));
    //.compareto() it is also a very different function it is basically used to compare two strings differently it compare two strings lexicographically..
    String str4="Darkfalcon";
    System.out.println("Compare string 1 and string 4 with each other and give ans "+str.compareTo(str4));
   System.out.print(str4.replace('D','P'));
   //.replace() function injava string used replace any char from string
    // String str2;
//    System.out.print("Entr the string: ");
//    str2=in.next();// if we use in.next for input then only onw word is taken as input but if we want to take whole senetence as input we need to write in.nextLine
//    System.out.print(str2+"\n");
  //  String str3;
  //  System.out.print("Enter the string whole sentence:  ");
//   str3=in.nextLine();
  // System.out.print(str3+"\n");
}
}
