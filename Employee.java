package Employee.com;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee 
{
	@Id
	private int id;
	private String name;
	private int age;
	private long phno;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name =name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
}
