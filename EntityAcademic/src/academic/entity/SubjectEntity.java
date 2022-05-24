package academic.entity;

public class SubjectEntity {

	private int id;
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
