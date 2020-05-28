package lab5;
import java.util.ArrayList;
import java.util.List;
public class Student extends Person {
	protected int cinNumber;
	private List<Course> courseSchedule = new ArrayList<Course>();
	public Student(String name, int streetNumberIn, String streetNameIn, String city, String stateProvince, String country, int cinNumber){
		super(name, streetNumberIn, streetNameIn,  city,  stateProvince,  country);
		this.cinNumber = cinNumber;
	}
	public int getCinNumber() {
		return cinNumber;
	}
	public List<Course> getCourseSchedule() {
		return courseSchedule;
	}
	public void setCourseSchedule(List<Course> courseSchedule) {
		this.courseSchedule = courseSchedule;
	}
	public void addCourse(Course course) {
		courseSchedule.add(course);
	}
	public void removeCourse(Course courseList) {
		courseSchedule.remove(courseList);
	}
	public void setCinNumber(int cinNumber) {
		this.cinNumber = cinNumber;
	}
	public String toString() {
		String studentInfo = cinNumber + " " + "resides at" + " " + getAddress();
		if(courseSchedule.isEmpty()) {
			studentInfo += "\n	Not enrolled in any classes.";
		}
		else {
			for(int course = 0 ; course < courseSchedule.size() ; course++) {
				studentInfo += "\n	" + course + ": " + courseSchedule.get(course).toString();
			}
		}
		return studentInfo;
	}
}