package pkg.File;
import java.io.File;
import java.io.PrintWriter;

public class FileTest {

	public static void main(String[] args) {
		
		try {
			File file = new File(".\\File\\text.txt");
			if(!file.exists()){
				file.createNewFile();
			}
			PrintWriter pw = new PrintWriter(file);
			pw.println("This is Test File");
			pw.println("This is Written By Saurav");
			pw.close();
			System.out.println("Done");
		} catch (Exception e) {
			System.out.println("Exception is: "+e.getMessage());
		}

	}

}
