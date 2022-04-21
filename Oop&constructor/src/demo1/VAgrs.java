package demo1;

//If we don't know how many argument we will have to pass in the method, varargs(Variable Arguments) is the better approach.
// Advantage : We don't have to provide overloaded methods so less code.
public class VAgrs {
 void add(int ...a)
 {
	 int res=0;
	 for(int x:a)
	 {
		 res=x+res;
	 }
	 System.out.println(res);
 }


 public static void main(String[] args) {
	      VAgrs a = new VAgrs();
	      a.add(22,2,3);
	      a.add(101,10);
	      a.add(200);
 }
 }
 
 
 
 


