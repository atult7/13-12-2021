package task;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONwrite {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		JSONObject obj = new JSONObject();
		
		
		obj.put("Name", "Atul Tiwari");
		obj.put("Department","B.E");
		obj.put("Branch", "C.S.E");
		obj.put("Year", 2016);
			
		
		JSONArray list = new JSONArray();
		
		 
		list.add("remark 1");
		list.add("remark 2");

		obj.put("remarks", list);

		try (FileWriter file = new FileWriter("C:\\Users\\Lenovo\\Documents//coursedetails.json")) {
			
			file.write(obj.toJSONString());

			
			file.flush();

		}
		catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println(obj);
		
	}

}


	
