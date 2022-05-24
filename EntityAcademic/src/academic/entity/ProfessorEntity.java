package academic.entity;

public class ProfessorEntity {

	private int id;
	private String idNumber;
	private IdTypeEntity idType;
	private String name;
	private String email;

	public ProfessorEntity() {
		setIdNumber("");
		setIdType(IdTypeEntity.create());
		setName("");
		setEmail("");
	}

	public ProfessorEntity(int id, String idNumber, IdTypeEntity idType, String name, String email) {
		super();
		setId(id);
		setIdNumber(idNumber);
		setIdType(idType);
		setName(name);
		setEmail(email);
	}

	public static ProfessorEntity create() {
		return new ProfessorEntity();
	}

	public static ProfessorEntity create(int id, String idNumber, IdTypeEntity idType, String name, String email) {
		return new ProfessorEntity(id, idNumber, idType, name, email);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	public IdTypeEntity getIdType() {
		return idType;
	}

	public void setIdType(IdTypeEntity idType) {
		this.idType = (idType == null) ? IdTypeEntity.create() : idType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = (name == null) ? "" : name.trim();
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = (idNumber == null) ? "" : idNumber.trim();

	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = (email == null) ? "" : email.trim();

	}
}
