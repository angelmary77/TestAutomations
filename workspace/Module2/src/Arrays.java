public class Arrays {

	public static void main(String[] args) {
		String username = "yyyyy";
		String password = "mmmmmm";
		String email ="mary@jsdgj.com";
		String zip = "878";
		String city = "Chennai";
		
		//Arrays
		//read the data from 
		String str[] = new String[5];
		str[0] = "yyyyy";
		str[1] = "mmmmmm";
		str[2] = "mary@jsdgj.com";
		str[3] = "878";
		str[4] = "Chennai";
		
		int in[] = new int[7];
		in[0] = 9;
		in[1] = 7;
		in[2] = 67;
		in[3] = 55;
		in[4] = 99;
		in[5] = 4;
		in[6] = 22;
		
		char c[] = new char[4];
		
		System.out.println("The length is " + str.length);
		System.out.println("The length is " + in.length);
		
		for(int i = 0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
		
		for(int j=0; j<in.length; j++)
		{
			System.out.println(in[j]);
		}
		
		//reverse printing	
		for(int k=in.length-1; k>=0; k--){
			System.out.println(in[k]);
		}
		
	}

}
