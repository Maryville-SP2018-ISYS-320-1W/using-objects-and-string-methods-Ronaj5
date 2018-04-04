/*
	ISYS 320
	Name(s): Rona Davis
	Date: March 31, 2018
	quote.substring(0,)
	Call String methods on the String object referred to by the `quote` variable to create and output the new String object "BANANA". 
	
	lasthalf( "There's always money in the banana stand." ) 
*/


public class P2_BananaStand {
	public static void main(String[] args) {
		String quote = "There's always money in the banana stand.";
		String quote2 = "BANANA";
		String quote3 = "in the banana stand.";
		System.out.println(quote);
		System.out.println(quote.length());
		System.out.println(quote.indexOf("in"));
		System.out.println(quote.indexOf(20));	
		System.out.println(quote.toLowerCase());
		System.out.println(quote.replaceAll(quote, quote2));
		quote3 = lasthalf(quote);
		System.out.println(quote3);
	}
	public static String lasthalf (String arg1){
		int l = arg1.length();
		l = l/2;
		return arg1.substring(l-1,arg1.length()-1);
	}

	
	
}
