import java.util.Scanner;

public class Array_Exercise {

	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Row numbers: \t");
		int rows = scan.nextInt();
		
		String str[] = new String[rows];
		for(int i=0; i<str.length; i++){
			System.out.println("Enter string: " + (i + 1) +"\t" );
			str[i] = scan.next();
		}
		scan.close();
		
		System.out.println("The original Array is: \t");
		for(int k=0; k < rows; k++){
			System.out.println(str[k]);
		}
		
		System.out.println("The Alternate Array is: \t");
		for(int k=0; k < rows; k=k+2){
			System.out.println(str[k]);
		}
	}
}
