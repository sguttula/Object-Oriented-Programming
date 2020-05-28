package lab5;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class Driver {
	public static void main(String[] args){
		Driver classes = new Driver();
		classes.drive();
	}
	private List<Student> Students = new ArrayList<Student>();
	private List<FacultyMember> Faculty = new ArrayList<FacultyMember>();
	private List<Course> Courses = new ArrayList<Course>();
	public void drive() {
		String[] choices = {"Student", "Faculty Member", "Courses", "Quit"};
		int choice;
		do {
			choice = JOptionPane.showOptionDialog(null, "Select one of the following.", "Select one of the following.", 0, JOptionPane.QUESTION_MESSAGE, null, choices, null);
		switch(choice) {
		case 0:
			student();
			break;
		case 1:
			facultyMember();
			break;
		case 2:
			courses();
			break;
		case 3: 
			break;
		} 
		}while (choice != 3);
	}
	public void student() {
		String[] choicesTwo = {"Add Student", "List Student", "Delete Student", "Add Course", "Delete Course", "Quit"};
		int choice1;
		do {
			choice1 = JOptionPane.showOptionDialog(null, "Select one of the following.", "Select one of the following.", 0, JOptionPane.QUESTION_MESSAGE, null, choicesTwo, null);
			switch(choice1) {
			case 0:
				addStudent();
				break;
			case 1:
				listStudent();
				break;
			case 2:
				deleteStudent();
				break;
			case 3:
				addSpecificCourseToSpecificStudent();
				break;
			case 4:
				removeSpecificCourseFromSpecificStudent();
				break;
			case 5:
				break;
			}
		}while (choice1 != 5);
	}
	public void addStudent() {
		int cin = Integer.parseInt(JOptionPane.showInputDialog("Enter the CIN:")); 
		int number = Integer.parseInt(JOptionPane.showInputDialog("Type the street number:"));
		String name = JOptionPane.showInputDialog("Type the street name:");
		String city = JOptionPane.showInputDialog("Type the city name:");
		String state = JOptionPane.showInputDialog("Type the state:");
		String country = JOptionPane.showInputDialog("Type the country:");
		Students.add(new Student(name, number, name, city, state, country, cin));
	}
	public void listStudent() {
		StringBuilder sb = new StringBuilder("Students: \n");
		if (Students.isEmpty()) {
			sb.append("None.");
		}
		else {
			for(Student q: Students) {
				sb.append(q + "\n");
			}
		}
		JOptionPane.showMessageDialog(null, sb);
	}
	public void deleteStudent() {
		StringBuilder in = new StringBuilder("Students: \n");
		if (Students.isEmpty()) {
			in.append("None.");
			JOptionPane.showMessageDialog(null, in); 
		}
		else {
			for (Student x: Students) {
				in.append(x + "\n");
			}
			int removeId = Integer.parseInt(JOptionPane.showInputDialog(null, in, "Enter the CIN of the student you wish to delete:"));
			boolean delete = false; 
			for(int i = 0 ; i < Students.size() ; i++) {
				if (Students.get(i).getCinNumber() == removeId) {
					Students.remove(i);
					JOptionPane.showMessageDialog(null, "The student is now deleted.");
					delete = true;
				}			
			}
			if(!delete) {
				JOptionPane.showMessageDialog(null, "The student is not found.");
			}
		}
	}
	public void addSpecificCourseToSpecificStudent() {
		int cin = Integer.parseInt(JOptionPane.showInputDialog("Enter the CIN:"));
		int number = 0;
		int number2 = 0;
		for(int i = 0 ; i < Students.size() ; i++) {
			if (Students.get(i).getCinNumber() == cin) {
				number = i;
			}
		}
		String title = (JOptionPane.showInputDialog("Enter the course identifier:"));
		for(int i = 0 ; i < Courses.size() ; i++) {
			if(Courses.get(i).getCourseIdentifier().equals(title)) {
				number2 = i;
			}
		}
		Students.get(number).addCourse(Courses.get(number2));
	}	
	public void removeSpecificCourseFromSpecificStudent() {
		int cin = Integer.parseInt(JOptionPane.showInputDialog("Enter the CIN:"));
		int number = 0;
		int number2 = 0;
		for(int i = 0 ; i < Students.size() ; i++) {
			if (Students.get(i).getCinNumber() == cin) {
				number = i;
			}
		}
		String title = (JOptionPane.showInputDialog("Enter the course identifier:"));
		for(int i = 0 ; i < Courses.size() ; i++) {
			if(Courses.get(i).getCourseIdentifier().equals(title)) {
				number2 = i;
			}
		}
		Students.get(number).removeCourse(Courses.get(number2));
	}
	public void facultyMember() {
		String[] choicesThree = {"Add Faculty Member", "List Faculty Member", "Delete Faculty Member", "Add Course", "Delete Course", "Quit"};
		int choice2;
		do {
			choice2 = JOptionPane.showOptionDialog(null, "Select one of the following.", "Select one of the following.", 0, JOptionPane.QUESTION_MESSAGE, null, choicesThree, null);
			switch(choice2) {
			case 0:
				addFacultyMember();
				break;
			case 1:
				listFacultyMember();
				break;
			case 2:
				deleteFacultyMember();
				break;
			case 3:
				addSpecificCoursetoSpecificMember();
				break;
			case 4:
				removeSpecificCourseFromSpecificMember();
				break;
			case 5:
				break;
			}
			
		}while (choice2 != 5);
	}
	public void addFacultyMember() {
		int cin = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID:")); 
		int number = Integer.parseInt(JOptionPane.showInputDialog("Type the street number:"));
		String name = JOptionPane.showInputDialog("Type the street name:");
		String city = JOptionPane.showInputDialog("Type the city name:");
		String state = JOptionPane.showInputDialog("Type the state:");
		String country = JOptionPane.showInputDialog("Type the country:");
		Faculty.add(new FacultyMember(name, number, name, city, state, country, cin));
	}
	public void listFacultyMember() {
		StringBuilder sb = new StringBuilder("Faculty Member: \n");
		if (Faculty.isEmpty()) {
			sb.append("None.");
		}
		else {
			for(FacultyMember q: Faculty) {
				sb.append(q + "\n");
			}
		}
		JOptionPane.showMessageDialog(null, sb);
	}
	public void deleteFacultyMember() {
		StringBuilder in = new StringBuilder("Faculty Members: \n");
		if (Faculty.isEmpty()) {
			in.append("None.");
			JOptionPane.showMessageDialog(null, in); 
		}
		else {
			for (FacultyMember x: Faculty) {
				in.append(x + "\n");
			}
			int removeId = Integer.parseInt(JOptionPane.showInputDialog(null, in, "Enter the faculty member you wish to delete:"));
			boolean delete = false; 
			for(int i = 0 ; i < Faculty.size() ; i++) {
				if (Faculty.get(i).getidNumber() == removeId) {
					Faculty.remove(i);
					JOptionPane.showMessageDialog(null, "The faculty member is now deleted.");
					delete = true;
				}			
			}
			if(!delete) {
				JOptionPane.showMessageDialog(null, "The faculty member is not found.");
			}
		}
	}
	public void addSpecificCoursetoSpecificMember() {
		int cin = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID:"));
		int number = 0;
		int number2 = 0;
		for(int i = 0 ; i < Faculty.size() ; i++) {
			if (Faculty.get(i).getidNumber() == cin) {
				number = i;
			}
		}
		String title = (JOptionPane.showInputDialog("Enter the course identifier:"));
		for(int i = 0 ; i < Courses.size() ; i++) {
			if(Courses.get(i).getCourseIdentifier().equals(title)) {
				number2 = i;
			}
		}
		Faculty.get(number).addCourse(Courses.get(number2));
	}
	public void removeSpecificCourseFromSpecificMember() {
		int cin = Integer.parseInt(JOptionPane.showInputDialog("Enter the ID:"));
		int number = 0;
		int number2 = 0;
		for(int i = 0 ; i < Faculty.size() ; i++) {
			if (Faculty.get(i).getidNumber() == cin) {
				number = i;
			}
		}
		String title = (JOptionPane.showInputDialog("Enter the course identifier:"));
		for(int i = 0 ; i < Courses.size() ; i++) {
			if(Courses.get(i).getCourseIdentifier().equals(title)) {
				number2 = i;
			}
		}
		Faculty.get(number).removeCourse(Courses.get(number2));
	}
	/*
	public void addCourseMember() {
		int cin = Integer.parseInt(JOptionPane.showInputDialog("Enter the CIN:"));
		for(int i = 0 ; i < Faculty.size(); i++) {
			if (Faculty.get(i).getidNumber() == cin) {
				Faculty.get(i).addCourse(new Course(courseIdentifierIn, courseTitleIn));				
			}
		}
	}
	public void deleteCourseMember() {
		StringBuilder sb = new StringBuilder("Courses: \n");
		for(int i = 0 ; i < Faculty.size(); i++) {
			if (Faculty.addCourse.isEmpty())
		}
	}
	*/
	public void courses() {
		String[] choicesFour = {"Add courses", "List courses", "Quit"};
		int choice3;
		do {
			choice3 = JOptionPane.showOptionDialog(null, "Select one of the following.", "Select one of the following.", 0, JOptionPane.QUESTION_MESSAGE, null, choicesFour, null);
			switch(choice3) {
			case 0: 
				addCourse2();
				break;
			case 1:
				listCourse();
				break;
			case 2:  
				break;
			}
		}while (choice3 != 2);
	}
	public void addCourse2() {
		String courseIdentifierIn = JOptionPane.showInputDialog("Enter the course identifier:");
		String courseTitleIn = JOptionPane.showInputDialog("Enter the course title:");
		Courses.add(new Course(courseIdentifierIn, courseTitleIn));
	}
	public void listCourse() {
		StringBuilder sb = new StringBuilder("Courses: \n");
		if (Courses.isEmpty()) {
			sb.append("None.");
		}
		else {
			for(Course q: Courses) {
				sb.append(q + "\n");
			}
		}
		JOptionPane.showMessageDialog(null, sb);
	}
}
