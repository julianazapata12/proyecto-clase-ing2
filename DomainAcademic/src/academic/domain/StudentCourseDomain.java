package academic.domain;

public class StudentCourseDomain {

	private int id;
	private StudentDomain student;
	private CourseDomain course;
	private StudentCourseStateDomain state;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StudentDomain getStudent() {
		return student;
	}

	public void setStudent(StudentDomain student) {
		this.student = student;
	}

	public CourseDomain getCourse() {
		return course;
	}

	public void setCourse(CourseDomain course) {
		this.course = course;
	}

	public StudentCourseStateDomain getState() {
		return state;
	}

	public void setState(StudentCourseStateDomain state) {
		this.state = state;
	}

}
