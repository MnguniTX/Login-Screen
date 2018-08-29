
public class Student extends Person {
	private int sNo;
	private String faculty;
	private String course;
	private String pass;
	
	public Student()
	{
		super();
		this.sNo = 214638045;
		this.faculty = "ICT";
		this.course = "IT:Software Development";
	}
	
	
	public Student(String name, String surname, int age, int sNo, String faculty, String course, String pass) {
		
		
		super(name, surname, age);
		this.sNo = sNo;
		this.faculty = faculty;
		this.course = course;
		this.pass = pass;
	}


	

	// Setters
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public void setCourse(String course) {
		this.course = course;
	}
	
	//Getters
	public String getFaculty() {
		return faculty;
	}
	
	public String getCourse() {
		return course;
	}
	
	public int getsNo() {
		return sNo;
	}
	
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getsPass() {
		return this.pass;
	}
	
	
	
	//String Representation of an Object
		public String toString()
		{
			return String.format("%s %s age %d Student No :%d"
					+ " is registered for %s in the faculty of%s", 
					getName(), getSName(), getAge(), getsNo(),
					getCourse(), getFaculty());
		}
	
	
	
	
	

}
