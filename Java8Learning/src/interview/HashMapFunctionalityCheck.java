package  interview;

import java.util.HashMap;
import java.util.Map;

class Employee{
	private String name;
	private String lName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, String lName) {
		super();
		this.name = name;
		this.lName = lName;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", lName=" + lName + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
}
public class HashMapFunctionalityCheck {

	public static void main(String[] args) {
		Map<Employee, String> map = new HashMap<>();
		map.put(new Employee(), "ankit");
		System.out.println(map.get(new Employee()));

	}

}
