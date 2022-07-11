package inheritance;

import java.util.Arrays;

public class Person {
	int id;
	String name,contact,add;
	Person_Idproof i[];
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public Person_Idproof[] getI() {
		return i;
	}
	public void setI(Person_Idproof[] i) {
		this.i = i;
	}
	
	public String toString()
	{
		return id+" "+name+" "+contact+" "+add+" "+Arrays.toString(i);
	}
	
	
}
