package demo1;

/*Rules for constructors
 * 1. Same name as class name
 * 2. Does not have any return type 
 * 3. Constructor will be created automatically as we create obj. 
 */
 class Constructors {
	int num1;
	int num2;
	int result;
	//Default Constructor
	public Constructors() {
    num1 = 5;
    num2 = 5;
    System.out.println("this is a constructor");
	}
	 
	//Parameterized Constructor 
    public Constructors(int n) {
     num1 = n;
     num2 = n;
    }
 
   public Constructors(double d,int n) {
    num1 = (int)d;  // implicitly
    num2 = n;
   System.out.println("this is a constructor");
   }
 
    public static class ConstructorsDemo{
	public static void main(String[] args) {
		Constructors obj = new Constructors(9.5,5); //calling constructor
		System.out.println(obj.num1);
		System.out.println(obj.num2);
	}
}
 }
