package academic.domain;

import java.util.Calendar;
import java.util.Date;

import javax.security.auth.Subject;

public class CourseDomain {

	private int id;
	private Subject subject;
	private ProfessorDomain professor;
	private Date initialDate;
	private Date finalDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	public ProfessorDomain getProfessor() {
		return professor;
	}

	public void setProfessor(ProfessorDomain professor) {
		this.professor = professor;
	}

	public Date getInitialDate() {
		return initialDate;
	}

	public void setInitialDate(Date initialDate) {
		this.initialDate = initialDate;
	}

	public Date getFinalDate() {
		return finalDate;
	}

	public void setFinalDate(Date finalDate) {
		this.finalDate = finalDate;
	}
	
	public boolean isOpen() {
		return (Calendar.getInstance().getTime().getTime() >= getInitialDate().getTime() 
				&& Calendar.getInstance().getTime().getTime() <= getFinalDate().getTime());
	}
}
