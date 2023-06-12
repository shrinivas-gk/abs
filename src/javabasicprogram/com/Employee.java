package javabasicprogram.com;

public class Employee {
	int id;
	int rollno;
	String name;
	public void insertRecord(int i,int r,
	String n)
	{
	id=i;
	rollno=r;
	name=n;
	}
	public void display() {
		System.out.println(id+" "+rollno+" "+name);
	}

	public static void main(String[] args) {
		Employee e= new Employee();
		Employee e2=new Employee();
		
		e.insertRecord(11, 118, "shrinivas");
		e2.insertRecord(20, 122, "manoj");
		e.display();
		e2.display();
	}

}
