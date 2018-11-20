import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Exercises {

	public static void main(String[] args) {
//		int num;
//		System.out.print("Enter a number: ");
//		Scanner scan = new Scanner(System.in);
//		num = scan.nextInt();
		
		//printEvenNums(num);
		//divisibleNums(num);
		//sumNums(num);
		//pramidPrint(num);
		//revIntArray(3);	
		//greatestInArray(4);
		int[] dupArray = {1, 3, 4, 5, 6, 3, 2, 4, 6, 7, 9, 4, 12, 3, 4, 6, 8, 9, 7, 6, 43, 2, 4, 7, 7, 5, 2, 1, 3, 4, 6, 311, 1};
		findDuplicates(dupArray);
	}
	
	//Functions start here*********************************
	
	//Write a for loop to print even number between 1 to 100
	public static void printEvenNums(int n){
		for(int i=0; i<=n; i++){
			if(i%2 == 0){
				System.out.print(i + ", ");
			}
			}
			
		}
	
	public static void divisibleNums(int n){
		for(int i=0; i<=n; i++){
			if(i%5 == 0){
				System.out.println("Divisble by 5 "+ i);
			}
			}
			
		}
	public static void sumNums(int n){
		int sum = 0;
		for(int i=0; i<=n; i++){
			sum = sum + i;
			}
		System.out.println(sum);
		 
		}
	public static void pramidPrint(int n){
		for(int i=1; i<=n; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j );
			}
			System.out.println();
		}
	}
	
	public static void revIntArray(int n){
		int a[] = new int[n];
		a[0] = 11;
		a[1] = 22;
		a[2] = 33;
		
		for(int i=a.length-1; i>=0; i--){
			
			System.out.println(a[i]);
		}
	}
	
	public static void strAlternateElementPrint(int n){
		int a[] = new int[n];
		a[0] = 11;
		a[1] = 22;
		a[2] = 33;
		
		for(int i=a.length-1; i>=0; i--){
			
			System.out.println(a[i]);
		}
	}
	
	public static void greatestInArray(int rowcnt){
		int i, max;
		Scanner sn = new Scanner(System.in);
		int in[] = new int[4];
		for(i=0; i<in.length; i++){
			System.out.println("Enter Values:" + (i+1) +"\t");
			in[i] = sn.nextInt();
		}
		sn.close();
		max = in[0];
		for(i=0; i<rowcnt; i++){
			
			if(max > in[i]){
				max=in[i];
			}	
		}
		System.out.println("The smallest is: " + max);
	}
	
	public static Set<Integer> findDuplicates(int[] input) { 
		Set<Integer> duplicates = new HashSet<Integer>(); 
		for (int i = 0; i < input.length; i++) { 
			for (int j = i + 1; j < input.length; j++) { 
				if (input[i] == input[j]) {
					// duplicate element found 
					duplicates.add(input[i]);
					//System.out.println(duplicates);
					break; 
				} 
			} 
		}
		System.out.println(duplicates);
		return duplicates; 
	}
			
	
	}
