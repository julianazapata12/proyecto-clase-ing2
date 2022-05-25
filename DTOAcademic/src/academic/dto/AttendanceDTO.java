package academic.dto;

public class AttendanceDTO {
	private int id;
	private SessionDTO session;
	private StudentCourseDTO studentCourse;
	private boolean attended;

	public AttendanceDTO() {
		setId(0);
		setSession(SessionDTO.create());
		setStudentCourse(StudentCourseDTO.create());
		setAttended(false);
	}

	public static AttendanceDTO create() {
		return new AttendanceDTO();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	public SessionDTO getSession() {
		return session;
	}

	public void setSession(SessionDTO session) {
		this.session = (session == null) ? SessionDTO.create() : session;
	}

	public StudentCourseDTO getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(StudentCourseDTO studentCourse) {
		this.studentCourse = (studentCourse == null) ? StudentCourseDTO.create() : studentCourse;
	}

	public boolean isAttended() {
		return attended;
	}

	public void setAttended(boolean attended) {
		this.attended = attended;
	}

}
