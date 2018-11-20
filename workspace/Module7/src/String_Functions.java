
public class String_Functions {

	public static void main(String[] args) {
		String str = "This is my first string";
		String str1 = "This is my first string";
		str.charAt(6);
		str.substring(2,7); //to pull out part of the str
		str.indexOf("hello"); //to check whether the sting is present in above string or not
		str.length(); // to check the str length
		System.out.println(str.equals(str1));
		System.out.println(str.trim());
		
		//split function
		String spt[] = str.split(" ");
		System.out.println(spt[1]);
		
		for(int i=0; i<spt.length; i++)
			System.out.println(spt[i]);
		
		//Data tupe convertion
		String x = "1000";
		int y = Integer.parseInt(x);
		System.out.println(y);
		
		String z = String.valueOf(y);
		System.out.println(z);
		
		boolean b = Boolean.valueOf(z);
		System.out.println(b);
		
	}

}
