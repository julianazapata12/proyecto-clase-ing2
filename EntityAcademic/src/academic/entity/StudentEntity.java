package academic.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name ="Student")

public class StudentEntity {
	
	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	@Column(name ="id")

	private int id;
	
	@Column(name ="idNumber")
	private String idNumber;
	
	@Column(name ="idType")
	@ManyToOne
	private IdTypeEntity idType;
	
	@Column (name ="name")
	private String name;
	
	@Column (name ="email")
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public IdTypeEntity getIdType() {
		return idType;
	}

	public void setIdType(IdTypeEntity idType) {
		this.idType = idType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
