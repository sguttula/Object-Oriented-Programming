package lab5;
public class Course {
	private String courseIdentifier;
	private String courseLetters;
	private String courseNumber;
	private String courseTitle;
	
	public Course(String courseIdentifierIn, String courseTitleIn) {
		courseIdentifier = courseIdentifierIn;
		String[] courseFormat = courseIdentifier.split("-");
		courseLetters = courseFormat[0];
		courseNumber = courseFormat[1];
		courseTitle = courseTitleIn;
	}
	public String getCourseIdentifier() {
		return courseIdentifier;
	}
	public void setCourseIdentifier(String courseIdentifier) {
		this.courseIdentifier = courseIdentifier;
	}
	public String getCourseTitle() {
		return courseTitle;
	}
	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}
	public String toString() {
		return "Course: " + courseIdentifier + ", " + courseTitle;
	}
}
