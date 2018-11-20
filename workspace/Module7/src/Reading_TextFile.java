import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Reading_TextFile {

	public static void main(String[] args) throws IOException {
		// Reading from text file
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\config\\test.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("DOB"));

	}

}
