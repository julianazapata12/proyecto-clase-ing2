package academic.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Course")



public class CourseEntity {
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	@Column(name ="id")
	
	private int id;
	@Column(name ="id")
	private SubjectEntity subject;
	@Column(name ="id")
	private ProfessorEntity professor;
	@Column(name ="professor")
	private Date initialDate;
	private Date finalDate;
	public int getId() {
		return id;
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public SubjectEntity getSubject() {
		return subject;
	}
	public void setSubject(SubjectEntity subject) {
		this.subject = subject;
	}
	public ProfessorEntity getProfessor() {
		return professor;
	}
	public void setProfessor(ProfessorEntity professor) {
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
	
	

}
