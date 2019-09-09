package pkg.readFiles;
import java.io.*;

public class ReadFiles {

	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(".\\File\\text.txt"));
			String line;
			
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally{
			try {
				br.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Exception is: "+e.getMessage());
			}
		}

	}

}
