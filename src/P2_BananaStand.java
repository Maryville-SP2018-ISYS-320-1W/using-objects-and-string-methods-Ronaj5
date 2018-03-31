/*
	ISYS 320
	Name(s):
	Date: 
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
	//	String lasthalf = quote.substring (21,41);
	}
	public static void show(String quote) {
	}
	
	
}
