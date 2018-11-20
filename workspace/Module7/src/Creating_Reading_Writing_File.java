import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Creating_Reading_Writing_File {

	public static void main(String[] args) throws IOException {
		//Creating new files
		File file = new File("C:\\Users\\Administrator\\workspace\\Module7\\src\\config\\createFile.txt");
		file.createNewFile();
		
		//Writing the file
		FileWriter fileWrite = new  FileWriter("C:\\Users\\Administrator\\workspace\\Module7\\src\\config\\createFile.txt");
		BufferedWriter bw = new BufferedWriter(fileWrite);
 		bw.write("This is my first line into the file \n This is the second line writing into the file");
 		bw.newLine();
 		bw.write("this is my third line hhhhhhhhhhhh");
 		bw.flush();
		
		//Reading the file
		FileReader fr = new FileReader("C:\\Users\\Administrator\\workspace\\Module7\\src\\config\\createFile.txt");
		BufferedReader bfr = new BufferedReader(fr);
		//System.out.println(bfr.readLine());
//		System.out.println(bfr.readLine());
		String x = "";
		
		while((x = bfr.readLine()) != null){
			System.out.println(x);
		}
		
		

	}

}
