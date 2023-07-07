package string;

import java.util.Objects;

public class Employee {
	private int emp_id;
	private String Name;
	private int Age;
	private long Aadhar;

	public static void main(String[] args) {
		Employee ob= new Employee(123,"Ragul",25,1234567890);
		Employee ob1= new Employee(122,"Saravana",27,123456789);
		Employee ob2= new Employee(121,"Kavin",25,76543821);
		Employee ob3= new Employee(124,"Senthil",25,87654932);
		System.out.println();
		System.out.println("Employee Details");
	    System.out.print(ob.emp_id+" ");
	    System.out.print(ob.Name+" ");
	    System.out.print(ob.Age+" ");
	    System.out.print(ob.Aadhar+" ");
	    System.out.println();
	    System.out.print(ob1.emp_id+" ");
	    System.out.print(ob1.Name+" ");
	    System.out.print(ob1.Age+" ");
	    System.out.print(ob1.Aadhar+" ");
	    System.out.println();
	    System.out.print(ob2.emp_id+" ");
	    System.out.print(ob2.Name+" ");
	    System.out.print(ob2.Age+" ");
	    System.out.print(ob2.Aadhar+" ");
	    System.out.println();
	    System.out.print(ob3.emp_id+" ");
	    System.out.print(ob3.Name+" ");
	    System.out.print(ob3.Age+" ");
	    System.out.print(ob3.Aadhar+" ");
	    System.out.println();
	    System.out.println("Employee Override Detail" );
	    System.out.println(ob.toString());
	    System.out.println(ob1.toString());
	    System.out.println(ob2.toString());
	    System.out.println(ob3.toString());
	    System.out.println("Employee Hashcode Detail");
	    System.out.println(ob.hashCode());
	    System.out.println(ob1.hashCode());
	    System.out.println(ob2.hashCode());
	    System.out.println(ob3.hashCode());
	    System.out.println("Employee Equal Detail");
	    System.out.println(ob.equals(ob1));
	    System.out.println(ob.equals(ob2));
	    System.out.println(ob.equals(ob3));
	    System.out.println(ob1.equals(ob2));
	    System.out.println(ob1.equals(ob3));
	    System.out.println(ob2.equals(ob3));
	    


	}

	public Employee(int emp_id, String name, int age, long aadhar) {
		super();
		this.emp_id = emp_id;
		Name = name;
		Age = age;
		Aadhar = aadhar;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public long getAadhar() {
		return Aadhar;
	}

	public void setAadhar(long aadhar) {
		Aadhar = aadhar;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", Name=" + Name + ", Age=" + Age + ", Aadhar=" + Aadhar + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Aadhar, Age, Name, emp_id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Aadhar == other.Aadhar && Age == other.Age && Objects.equals(Name, other.Name) && emp_id == other.emp_id;
	}
	

}
