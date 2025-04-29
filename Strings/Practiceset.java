package Strings;
import java.util.*;
public class Practiceset {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
      //Q1 Write a java program to convert a string to lowercase
        String str;
        System.out.print("Enter the string: ");
        str=in.nextLine();
        String str1=str.toLowerCase();
        System.out.print("The string in lowercase is: "+str1+"\n");
        //Q2 Write a java program to replace spaces with underscores
        String str2=str.replace(" ","_");
        System.out.print("When we convert string space with underscore: "+str2);
        //Q3 Write a java program to fill in a letter template which bots like below:
        //letter="Dear<|name|>,Thanks a lot"
        //Replace <|name|> with a string(Same name)
        System.out.print("\n");
        String letter="Dear <|name|>,Thanks a lot!";
       letter=letter.replace("<|name|>","DarkFalcon");
        System.out.print(letter+"\n");
        //Q4 Write a java program to detect double and triple spaces in a string
        String str5="This string contains    double and triple spaces";
        System.out.println(str5.indexOf(" "));
        System.out.println(str5.indexOf("   "));
    //Q5 Write a program to format the following letter using escape sequence character
        //letter="Dark Falcon,Is the real looser"
        String str3="Dark Falcon\nIs the \nreal looser";
        System.out.println(str3);

    }
}
