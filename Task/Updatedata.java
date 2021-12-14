package task;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Updatedata {

	public static void main(String []args) {
		
		try {
			FileWriter fw=new FileWriter("C:\\Users\\Lenovo\\Documents//update.txt",true);
			PrintWriter pw = new PrintWriter(fw);
			pw.print("hello world");
			
			
			pw.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
	

