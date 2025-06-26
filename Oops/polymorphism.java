//Polymorphism poly means many morphism means forms  its just two types 1)compile time(Method overloading) polymorphism and 2)run time(method overriding) polumorphism
package Oops;
import java.util.Scanner;
class Student3{
    String name;int age;
    public void printInfo(String name){
        System.out.println(name);
    }
    public void printInfo(int age){
        System.out.println(age);
    }
    public void printInfo(String name,int age){
        System.out.println(name+" "+age);
    }
}
public class polymorphism {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args){
 Student3 s1 = new Student3();
 s1.age=in.nextInt();
 s1.name="dark";
 s1.printInfo(s1.name,s1.age);
    }
}
