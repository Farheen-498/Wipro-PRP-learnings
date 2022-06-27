package wrapperpkg;

public class Employee implements Cloneable{
	private String name;
	public Employee(String name) {
	this.name= name;
	}
	public String getName() {
		return name;
	}
	public void  setName(String name) {
		this.name  = name;
	}

	public Employee clone() {
		try {
			return (Employee)super.clone();
		} catch(CloneNotSupportedException e) {
			System.out.println("cloning not allowed");
		}
		return this;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp= new Employee("Farheen Ali");
		Employee empclone = emp.clone();
		empclone.setName("Riacky");
		System.out.println(emp.getName());
		System.out.println(empclone.getName());
	
	}

}
