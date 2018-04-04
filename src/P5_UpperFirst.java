/*
	ISYS 320
	Name(s): Rona Davis	
	Date: 4/3/18
*/

public class P5_UpperFirst {

	public static void main(String[] args) {
		String NBA = "Lebron James";
		String ANS = upperFirst(NBA, " ");
		System.out.println(ANS);
	}
		
		public static String upperFirst (String str, String del){
			int l = str.indexOf(del);
			String str2 = str.substring(0, l);
			String str3 = str.substring(l,str.length());
			str2 = str2.toUpperCase();
			return str2 + str3;
	}

}
