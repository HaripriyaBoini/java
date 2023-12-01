package demo04.object_io;

import java.io.Serializable;

public class Employee implements Serializable{
	private static final long serialVersionUID = 1L;
          private int id;
          private String name;
          private double salary;
          private boolean isOnLeave;
          private char gender;
		public Employee() {
			super();
			
		}
		public Employee(int id, String name, double salary, boolean isOnLeave, char gender) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.isOnLeave = isOnLeave;
			this.gender = gender;
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
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public boolean isOnLeave() {
			return isOnLeave;
		}
		public void setOnLeave(boolean isOnLeave) {
			this.isOnLeave = isOnLeave;
		}
		public char getGender() {
			return gender;
		}
		public void setGender(char gender) {
			this.gender = gender;
		}
		
		
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", isOnLeave=" + isOnLeave
					+ ", gender=" + gender + "]";
		}
		
          
}
