import java.util.ArrayList;

public class Datasource {
	
	ArrayList<Person> arrLi = new ArrayList<Person> ();
	
	int index = 0;
	
	public Datasource() {
		
		
		
	}
	
	public void addPerson(Person pers)
	{
		arrLi.add(pers);
		//System.out.println("Successfully Added");
		
		index++;
	}
	
	
	public void ShowPerson()
	{
		System.out.println(arrLi);
		System.out.println(index + " People Are Stored");
	}
	
	

	
}
