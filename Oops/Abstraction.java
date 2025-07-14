package Oops;
 abstract class Animal{
    abstract void   walk();
    Animal(){
        System.out.println("You are creating a new animal");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}
class Horse extends Animal{
     Horse(){
         System.out.println("Created a Horse");
     }
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{

    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args){
  Horse horse=new Horse();
  horse.walk();
  Chicken chicken=new Chicken();
  chicken.eat();
  chicken.walk();
  //  Animal animal=new Animal();
//  animal.walk();  //This will give runtime error because Animal is abstract class
    }
}


//Some basic properties of abstract class is
//=>An abstract class must be declared with an abstract keyword
//=>It can have abstract and nonabstract methods.
//=>It cannot be instantiated.
//=>It can have constructors and static methods also
//=>It can have final methods which will force the subclass not to change the body the method.


//In oops whenever we create an object of derived class so the firstly th constructor of base class will be called then the constructor of derived class is called this process in java is called Constructor Chaining.

//interfaces is a reference type similar to a class it is defined by the keyword Interface