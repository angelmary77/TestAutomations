
public class FindDuplicatesArrayElements {

	public static void main(String[] args) {
		int[] dupArray = {1, 3, 4, 5, 6, 3, 2, 4, 6, 7, 9, 4, 12, 3, 4, 6, 8, 9, 7, 6, 43, 2, 4, 7, 7, 5, 2, 1, 3, 4, 6, 311, 1};
		System.out.println(dupArray.length);
		int i, j;
		for(i=0; i<dupArray.length; i++){
			if(dupArray[0] == dupArray[i])
			for(j=i+1; j<dupArray.length; j++){
				if((dupArray[i]==dupArray[j]) && (i != j)){
					System.out.println("Duplicate Element: " + dupArray[j]);
				}
				
			}
		}

	}

}
