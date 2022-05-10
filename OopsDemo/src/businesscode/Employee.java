package businesscode;

import java.util.Objects;

public class Employee {

	private int empId;
	private String name;
	private int salary;

	public Employee(int empId, String name, int salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(empId, name, salary);
	}

	@SuppressWarnings("unused")
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (this == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		Employee other = (Employee) obj;
		return empId == other.empId && Objects.equals(name, other.name) && salary == other.salary;

	}

	public static String getEmpNameWithHighestSalary() {
		return "Raj";
	}

	public static Employee getHighestPaidEmployee() {
		return new Employee(101, "Raj", 15000);
	}
}
