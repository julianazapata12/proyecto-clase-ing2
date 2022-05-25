package academic.domain;

public class ProfessorDomain {

	private int id;
	private String idNumber;
	private IdTypeDomain idType;
	private String name;
	private String email;

	private ProfessorDomain() {
		super();
		setIdNumber("");
		setIdType(IdTypeDomain.create());
		setName("");
		setEmail("");
	}

	private ProfessorDomain(int id, IdTypeDomain idType, String name, String idNumber, String email) {
		super();
		setId(id);
		setIdType(idType);
		setName(name);
		setIdNumber(idNumber);
		setEmail(email);
	}

	public static ProfessorDomain create(int id, IdTypeDomain idType, String name, String idNumber, String email) {
		return new ProfessorDomain(id, idType, name, idNumber, email);
	}

	public static ProfessorDomain create() {
		return new ProfessorDomain();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = (id < 0) ? 0 : id;
	}

	public IdTypeDomain getIdType() {
		return idType;
	}

	public void setIdType(IdTypeDomain idType) {
		this.idType = (idType == null) ? IdTypeDomain.create() : idType;
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
