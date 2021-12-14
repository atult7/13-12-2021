package task;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONread {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		JSONParser parser = new JSONParser();
		
		try
		{
			Object obj = parser.parse(new FileReader("C:\\Users\\Lenovo\\Documents//coursedetails.json"));
			JSONObject jsonObject = (JSONObject) obj;
			
			String name = (String) jsonObject.get("Name");
			System.out.println("Name:" + name);
			String department=(String) jsonObject.get("Department");
			System.out.println("Department:" + department);
			String branch= (String) jsonObject.get("Branch");
			System.out.println("Branch:" + branch);
			
			
			
			JSONArray remarksArray = (JSONArray) jsonObject.get("remarks");
			Iterator<String> iterator = remarksArray.iterator();
			
			while(iterator.hasNext())
			{
				System.out.println("remarks" + iterator.next());
			}
		}
		catch(FileNotFoundException e) { e.printStackTrace(); }
		catch(IOException e) { e.printStackTrace(); }
		catch(ParseException e) { e.printStackTrace(); }
		catch(Exception e) { e.printStackTrace(); }

	}

}
