package Datastructures;

import java.util.Arrays;

//Bean

class Employee
{
	private int id;
	private String name;
	private String job;
	private double sal;
	public Employee(int id, String name, String job, double sal)
	{
		
		this.id = id;
		this.name = name;
		this.job = job;
		this.sal = sal;
	}
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
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		
		this.sal = sal;
	}	
	@Override
	public String toString() {
		
		String EmpDetails=id+" "+name+" "+job+" "+sal;
		return EmpDetails;
	}
	
}

public class Mainclass2 {

	public static void main(String[] args) {
		
    Employee[] elist= new Employee[10];
    elist[0] = new Employee(1,"Smith","Dev",2341.2);
    elist[1] = new Employee(2,"Blake","Sales",1212.1);
    elist[2] = new Employee(3,"Martin","QA",1000);
    elist[3] = new Employee(4,"Miller","DEV",2114.1);
    elist[4] = new Employee(5,"Blake","HR",1311.1);
    elist[5] = new Employee(1,"Smith","Dev",2341.2);
    elist[6] = new Employee(2,"Blake","Sales",1212.1);
    elist[7] = new Employee(3,"Martin","QA",1000);
    elist[8] = new Employee(4,"Miller","DEV",2114.1);
    elist[9] = new Employee(5,"Blake","HR",1311.1);

	}

}
