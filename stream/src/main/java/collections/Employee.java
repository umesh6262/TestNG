package collections;

public class Employee implements Comparable<Employee>{
	int id;
	String name;
	double salary;
	public Employee(){
		
	}
	public Employee(int id, String name, double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee that) {
		return this.id - that.id;
	}
}
