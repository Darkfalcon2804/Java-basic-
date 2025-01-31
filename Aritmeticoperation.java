
 import java.util.Scanner;
// in java we have to import some classes to perform special cases(common cases are) Scanner, ArrayList, HashMap, Date, Random to import them all together we use java.util.*
 //but remember using java.util.* can create ambiguity in the cases of multiple classes
public class Aritmeticoperation {
  public static void main(String[] args ){
      Scanner x=new Scanner(System.in);
      System.out.print("Enter the value of A=");
      int a=x.nextInt();
      // here datatype is int that's why we use nextint if data type is float we will use nextfloat
      System.out.print("Enter the value of B=");
      int b=x.nextInt();
      System.out.print("Addition="+(a+b)+"\n");
       System.out.print("Multiplication="+(a*b)+"\n");
      System.out.print("Subtraction="+(a-b)+"\n");
      System.out.print("Division="+(a/b)+"\n");
      x.nextLine();
      //use x.nextline() after nextint because nextint will create a buffer which is nextline if string so we use an extra nextline
      // the difference between next and nextline is next only read one word it didn't read after space but neextline reads whole sentence
      System.out.print("Enter your name: ");
        String name=x.nextLine();
        System.out.print("Your name is:"+name+"\n");
        System.out.print("Enter the float digit: ");
        float s=x.nextFloat();
        System.out.print("Your given float digit is: "+s+"\n");
       // x.nextLine();
        double z=x.nextDouble();
        System.out.print(z);

  }
}
