package Oops;
class Pen{             //class in java
    String color;
    String type;
    public void write(){
        System.out.println("Writing something");
    }
    public void printcolor(){
        System.out.println(this.color);  //this is actually is a keyword of java this will the function which object has called the function
    }
}
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(){
        System.out.println("Constructor is Called"); //If we dont write any non parametersied constructor in class then java makes its own constructor  to exxecute the program
    }
    Student(Student s4){
        this.name=s4.name;
                this.age=s4.age;
    }
}
class Student2{
    String name;
    int age ;
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student2(String name,int age){
  this.name=name; // this.name=object name && name=parameter that is passed
  this.age=age;
    }
}
public class BasicOops {
    public static void main(String[] args){
        Pen p1=new Pen();  //object in java
        p1.color="blue";
        p1.type="gel";    //properties used by dot  properties are called data
        p1.write();  //to use method of class functions of class in called members

        Pen p2=new Pen();
        p2.color="green";
        p2.type="ball";
        p1.printcolor();
        p2.printcolor();

        Student s1=new Student(); //constructor
        //In java constructor is used to form object here three types of constructor  1)non parameterised constructor 2)parametersied connstructor 3)Copy constructor
        //properties of constructor 1)class name and constructor nsme is same always 2)constructor dont return anything 3)For one object constructor is called only one time when object is created
        s1.name="Bhavesh";
        s1.age=20;
        s1.printInfo();
        Student2 s2=new Student2("dark",19);
        s2.info();
        //Copy Constructor
        Student s3=new Student();
        s3.name="falcon";
        s3.age=21;
        s3.printInfo();
    Student s4=new Student(s3);
    s4.printInfo();
    }
}
//in any situation when object is created then constructor is called first
//IN c++ copy consturctor can be constructed by deafult someties but in java here copy constructed by user only
//In c++ we can create destructor but in java desturctor is not created it is automatic and in java there is garbage collector
//The garbage collector is part of jvm(java virtual machine) and there destructor in java
//In java  one class is named inside the package only one time like student class can only be present only one time in  package