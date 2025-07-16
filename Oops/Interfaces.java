package Oops;
interface Animals{
   public void walk();
    // Animal(){}  //error because interface dont have constructor
}
class Horses implements Animals{
 public   void walk(){
    System.out.println("walk on 4 legs");
    }
}
public class Interfaces {
    public static void main(String[] args){
        Horses horse=new Horses();
        horse.walk();
    }
}

////Interfaces important point 
//// =>All the fields in interfaces are public,static and final by default
////=>All methods are public and abstract by default
////=>A class that implements an interface must implement all the methods declared in the intefaces
////=>Interfaces support the functionality of multiple inheritance
