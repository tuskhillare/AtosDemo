package demo1;

//Java Method Overloading : If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

/**There are two ways to overload the method in java
 1. By changing number of arguments
 2. By changing the data type
 */

// By changing number of arguments
class Override{  
	static int add(int a,int b)//1
	{
		return a+b;
		}  
	static int add(int a,int b,int c)//2
	{
		return a+b+c;
		}  
	}  

 class MethOverLoad {
	public static void main(String[] args) {
			System.out.println(Override.add(11,11));  
			System.out.println(Override.add(11,11,11));  
	}

}

//By changing the data type

class Adder{ 
static int add(int a, int b)
{
	return a+b;
	}  
static double add(double a, double b)
{
	return a+b;
	}  
}  
class TestOverloading{ 
public static void main(String[] args){  
System.out.println(Adder.add(11,11));  
System.out.println(Adder.add(12.3,12.6));  
}
}  

