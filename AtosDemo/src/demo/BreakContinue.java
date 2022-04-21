package demo;

public class BreakContinue {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue;
			}
			System.out.println("i="+i);
		}  
	}
}

/* Break Statement
 int i = 0;
 while (i < 10) {
 System.out.println(i);
 i++;
 if (i == 4) {
 break;
	      }
	    }  
*/

