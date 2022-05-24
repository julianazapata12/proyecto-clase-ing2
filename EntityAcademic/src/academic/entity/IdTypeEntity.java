package academic.entity;

public class IdTypeEntity {
	private int id;
	private String name;

	public IdTypeEntity() {
		setName("");
	}

	public IdTypeEntity(int id, String name) {
		super();
		setId(id);
		setName(name);
	}

	public static IdTypeEntity create() {
		return new IdTypeEntity();
	}

	public static IdTypeEntity create(int id, String name) {
		return new IdTypeEntity(id, name);
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
