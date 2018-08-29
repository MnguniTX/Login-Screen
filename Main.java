import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Main {
	
	public static void main(String []args)
	{
		
		String name;
		String sName;
		String age;
		String pass;
		String sNo;
		String course;
		String faculty;
		
		
		JOptionPane.showMessageDialog(null, "Welcome to my Program", "Register Details ", 
				JOptionPane.PLAIN_MESSAGE);
		
		Datasource data = new Datasource();
		
		
		int condition = JOptionPane.showConfirmDialog(null, "Do you want "
				+ "to register a person ?");
		
		
		while(condition < 1)
		{
			
			//int i = 0;
			name = JOptionPane.showInputDialog("Enter your Name");
			sName = JOptionPane.showInputDialog("Enter your Surname");
			age = JOptionPane.showInputDialog("Enter your Age");
			sNo = JOptionPane.showInputDialog("Enter your Student Number");
			course = JOptionPane.showInputDialog("Enter your Course Name");
			faculty = JOptionPane.showInputDialog("Enter your Faculty Name");
			pass = JOptionPane.showInputDialog("Enter your Password");
			
			Student stu = new Student(name, sName, Integer.parseInt(age), 
					Integer.parseInt(sNo), course, faculty, pass);
			
			 
			data.addPerson(stu);
			//i++;
			
			condition = JOptionPane.showConfirmDialog(null, "Do you want "
					+ "to register another person ?");
			
		}
		
		
		/*int log = JOptionPane.showConfirmDialog(null, "Do you want "
				+ "Login?");
		
		String logName = JOptionPane.showInputDialog("Enter your Name");
		String logPass = JOptionPane.showInputDialog("Enter your Password");
		
		if(log == 0)
		{
			
			if(logName == data.checkName(stu) && pass == data.checkPass(stu))
			{
				
			}
			
		}*/
		
		data.ShowPerson();
		
		
		
		
	
	}

}
