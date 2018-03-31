/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 Your expression predictions:
 
 1. 12
 2. a
 3. G
 4. 2, 4
 
 5. "GANDALF THE GRAY"
 6. "frodo baggins"
 7. d
 8. d, A
 
 9. 4
 10. WHITE
 11. "Frangeodo Baggins"
 
  
 */

/*
 Were you correct? Explain if you were not (what did you learn?)
 
 1. I miscounted
 2. I got it right
 3. I got it right
 4. I got it right
 
 5. I got it right
 6. I got it right
 7. Wrong  I will have to review 
 8. Wrong  I will have to review 
 
 9. Wrong  I will have to review 
 10. Wrong  I will have to review 
 11. Wrong  I will have to review 
 
 System.out.println(str1.length());
System.out.println(str1.charAt(7));
 */


public class P1_TestStringMethods {
	public static void main(String[] args) {
		String str1 = "Frodo Baggins";
		String str2 = "Gandalf the GRAY";
		System.out.println(str1.length());
		System.out.println(str1.charAt(7)); 
		System.out.println(str2.charAt(0)) ;
		System.out.println(str1.indexOf("o")) ;
		System.out.println(str2.toUpperCase()) ;
		System.out.println(str1.toLowerCase());
		System.out.println(str2.substring(4));
		System.out.println(str2.substring(3, 14));
		System.out.println(str2.replace("a", "oo"));
		System.out.println(str2.replace("gray", "white"));
		System.out.println("str1".replace("r",  "range"));
		
		System.out.println(str1);
		System.out.println(str2);
	}

	public static void show(String str1) {
	}

	public static void show(char c) {
	}

	public static void show(int i) {
	}
}
