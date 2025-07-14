package Oops;
  class Account{
  public  String name;
  protected String email;
  private  String password;

  //to access private thingss in java there is logic of getters and setters
    public String getPassword(){
      return this.password;
    }
    public void setPassword(String pass){
      this.password=pass;
    }
}
public class bank {
public static void main(String[] args){
  Account account2=new Account();
  account2.name="Dark Falcon";
  account2.email="darkfalcon@gmail.com";
  account2.setPassword("abcd");
  System.out.println(account2.getPassword());
}
}
//Encapsulation binding of similar type of properties in a capsule for example Class in java bindind the method properties and method function in java
//Abstraction in basic terms showing the important things to the user and hiding unnecessary things from the user
// data hiding it is the process of protecting members of class from unintended changes whereas abstraction is hiding the implementation details and showing only impoertant/useful parts to the user