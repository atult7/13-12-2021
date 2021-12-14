package xmltask.assig;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import xmltask.assig.model.Person;

public class App 
{
    public static void main( String[] args )
    {
    	try {
    		ObjectMapper mapper = new XmlMapper();
    		InputStream inputStream = new FileInputStream(new File("C:\\Users\\Lenovo\\Documents//persons.xml"));
    		TypeReference<List<Person>> typeReference = new TypeReference<List<Person>>() {};
    		List<Person> persons = mapper.readValue(inputStream, typeReference);
    		for(Person p :persons) {
     			System.out.println("name: "+ p.getFirstName() +"age: "+p.getAge()+ "city: "+p.getCity()+"cars: "+p.getCars()[0]);
    			
    		}
    		Person person = new Person();
    		person.setFirstName("Aman");
    		person.setLastName("Kumar");
    		person.setAge(22);
    		person.setCity("BSB");
    		
    		mapper.writeValue(new File("C:\\Users\\Lenovo\\Documents//personsout.xml"),person);
    		inputStream.close();
    		
    	}
    	catch(Exception e) {
    		e.printStackTrace();
    	}
     
    }
}
