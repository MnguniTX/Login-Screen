
public class Person {
	private String name;
	private String surname;
	private int age;
	
	public Person()
	{
		this.name = "Thabo";
		this.surname = "Mnguni";
		this.age = 22;
	}
	
	
	public Person(String name, String surname, int age)
	{
		this.name = name;
		this.surname = surname;
		this.age = age;
	
	}
	
	
	//Setters
	public void setAge(int age) {
		this.age = age;
	}


	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setSName(String surnname)
	{
		this.surname = surname;
	}
	
	
	//Getters
	public String getName()
	{
		return this.name;
	}
	
	public String getSName()
	{
		return this.surname;
	}
	
	public int getAge() {
		return age;
	}
	
	//String Representation of an Object
	public String toString()
	{
		return String.format("%s %s is %d Years Old", name, surname, age);
	}

}
