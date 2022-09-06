package introduction.collections.linkedlist_demo;

public class Employee {
	private int id;
	private String name;
	private String address;

	public Employee() {
	}

	public Employee(String id, String name, String address) {
		this.id = Integer.parseInt(id);
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "id : " + id + " Address : " + address + " name : " + name;
	}

}
