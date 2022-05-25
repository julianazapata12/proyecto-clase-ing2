package academic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Subject")

public class SubjectEntity {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	@Column(name ="id")

	private int id;
	
	@Column(name ="name")
	private String name;
	

	public SubjectEntity() {
		setName("");
	}

	public SubjectEntity(int id, String name) {
		super();
		setId(id);
		setName(name);
	}

	public static SubjectEntity create() {
		return new SubjectEntity();
	}

	public static SubjectEntity create(int id, String name) {
		return new SubjectEntity(id, name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = (name == null) ? "" : name.trim();
	}

}
