//Inheritance is one of the core concepts of Object-Oriented Programming (OOP).
//It allows a child class (subclass) to inherit fields (variables) and methods (functions) from a parent class (base class) (superclass).
package Oops;
//import Bank;
class Shape{
    String color;
    public void area(){
        System.out.println("display area");
    }
}
class Triangle extends Shape{
    public void area(int b,int h){
        System.out.println((0.5)*b*h);
    }
}
class Circle extends Shape{
    public void area(int r) {
                System.out.println((3.14)*r*r);
    }
}
class EquilateralTriangle extends Triangle{
    public void area(int b,int h){
        System.out.println((0.5)*b*h);
    }
}
public class Inheritance {
    public static void main(String[] args){
    Triangle t1=new Triangle();
    t1.color="red";
    t1.area(5,4);
    Bank.Account account1=new Bank.Account();
    account1.name="dark";

    }
}
//In java we used extends keyword for inheritance Syntax: ChildClassName extends ParentclassName
//In c++ multiple inheritance in present (diamond problem) but in java multiple inheritance is not present becuase java avoid amniguity use interfaces
//Q What is interfaces ?
//An interface is like a blueprint.
//It can only declare methods (no implementation).
//A class can implement multiple interfaces.
//Interfaces solve the multiple inheritance problem

//Types of inheritance 1)single level inheritance(Triangle extends from shape) 2)multilevel inheritance(Tiangle extends fron Shape and Equilateral Triangle extends from Triangle) 3)Hierarchial inheritance(triangle,circle both extends from same parent Shape) 5)hybrid inhertiance(comibnation of single,multilevel,hieararchial)