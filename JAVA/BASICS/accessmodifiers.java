// ACCESS MODIFIERS

//Access modifiers specifies the availability or scope of a field,methods,or class
//We can change the access level of fields , methods or class by using access modifiers.there are four types of java access modifiers 

//Private:-
//The access level of a private access modifier is only within the class.
//It cannot be access from outside the class

//Default :-
//   The access level of the default modifiers is only within the package.
//   it cannot  be access from outside the package.if any access level 
//    is not specified then it will be    default .

//Protected:-
//The access level of the protected modifier is within the package and outside the package using child class.if any child class is not defined then it cannot be
//Access from outside the class

//Public:-
//The access level of public modifiers is from everywhere . it can be accessed from within the class or outside the class,within the package or outside the package.

//Encapsulation
//It is the process of wrapping the code and data together.

public class accessmodifiers {
  private String color;

  void setcolor(String col) {
    this.color = col;
  }

  String getcolor() {
    return color;
  }

  public static void main(String[] args) {
    accessmodifiers sc = new accessmodifiers();
    sc.setcolor("Red");
    System.out.println(sc.getcolor());
  }
}
