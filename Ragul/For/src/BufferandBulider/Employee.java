package BufferandBulider;

public class Employee {
	private int Id_Num;
	private String Name;
	private int Age;
	private String Designation;
	private int Salary;

	public Employee(int Id_Num, String Name, int Age, String Designation, int Salary) {
		super();
		this.Id_Num = Id_Num;
		this.Name = Name;
		this.Age = Age;
		this.Designation = Designation;
		this.Salary = Salary;
	}

	public int getIdnum() {
		return Id_Num;
	}

	public void setIdnum(int idnum) {
		this.Id_Num = idnum;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		this.Age = age;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		this.Designation = designation;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		this.Salary = salary;
	}

	public String toString() {
		return "Id_Num=" + Id_Num + ", Name=" + Name + ", Age=" + Age + ", Designation=" + Designation + ", Salary="
				+ Salary;
	}



}
