package lab5;
import java.util.ArrayList;
import java.util.List;
public class FacultyMember extends Person {
	protected int idNumber;
	private List<Course> courseSchedule = new ArrayList<Course>();
	public FacultyMember(String name, int streetNumberIn, String streetNameIn, String city, String stateProvince, String country, int cinNumber){
		super(name, streetNumberIn, streetNameIn,  city,  stateProvince,  country);
		this.idNumber = cinNumber;
	}
	public int getidNumber() {
		return idNumber;
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
	public void setidNumber(int cinNumber) {
		this.idNumber = cinNumber;
	}
	public String toString() {
		String studentInfo = (idNumber) + " resides at" + " " + getAddress();
		if(courseSchedule.isEmpty()) {
			studentInfo += "\n	Not teaching in any classes.";
		}
		else {
			for(int course = 0 ; course < courseSchedule.size() ; course++) {
				studentInfo += "\n	" + course + ": " + courseSchedule.get(course).toString();
			}
		}
		return studentInfo;
	}
}