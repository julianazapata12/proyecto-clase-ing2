package academic.domain;

public class AttendanceDomain {

	private int id;
	private SessionDomain session;
	private StudentCourseDomain studentCourse;
	private boolean attended;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	public SessionDomain getSession() {
		return session;
	}

	public void setSession(SessionDomain session) {
		this.session = (session == null) ? new SessionDomain() : session;
	}

	public StudentCourseDomain getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(StudentCourseDomain studentCourse) {
		this.studentCourse = (studentCourse == null) ? new StudentCourseDomain() : studentCourse;
	}

	public boolean isAttended() {
		return attended;
	}

	public void setAttended(boolean attended) {
		this.attended = attended;
	}

}
