package academic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="StudentCourse")


public class StudentCourseEntity {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	@Column(name ="id")

	private int id;
	
	@Column(name = "student")
	private StudentEntity student;
	
	
	@Column (name = "course")
	@ManyToOne
	private CourseEntity course;
	

}
