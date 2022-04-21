package demo1;

//If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.
/**
 * Rules for declaring overloading
  1.The method must have the same name as in the parent class
  2.The method must have the same parameter as in the parent class.
 */
//Creating a parent class.  
class Vehicle{  
	
  //defining a method  
  void run()
  {
	  System.out.println("Vehicle is running");
	  }  
}  

//Creating a child class

class Bike1 extends Vehicle{ 
	
  //defining the same method as in the parent class
	
  void run()
  {
	  System.out.println("Bike is running");
	  }  
  
  public static void main(String args[]){  
  Bike1 obj = new Bike1();//creating object  
  obj.run();//calling method  
  }  
}  