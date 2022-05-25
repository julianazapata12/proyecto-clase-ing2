package academic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Course")


public class AttendanceEntity {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	@Column(name ="id")
	
	private int id;
	@Column(name ="id")
	
	private SessionEntity session;
	@Column(name ="session")
	private StudentCourseEntity studentCourse;
	@Column(name ="studentCourse")
	private boolean attended;
	@Column(name ="attended")
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public SessionEntity getSession() {
		return session;
	}
	public void setSession(SessionEntity session) {
		this.session = session;
	}
	public StudentCourseEntity getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(StudentCourseEntity studentCourse) {
		this.studentCourse = studentCourse;
	}
	public boolean isAttended() {
		return attended;
	}
	public void setAttended(boolean attended) {
		this.attended = attended;
	}
	
}
               