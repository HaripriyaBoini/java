package example;

public class Employee {
		private double basicSalary;
		private double incentives;
		private double sales;
		
		
		 public void setBasicSalary(double basicSalary) {
			 if(basicSalary<10000) {
				 System.out.println("invalid basic salary");}
				 else {
					 this.basicSalary=basicSalary;}	 
			 }
			
		public void setIncentives(double incentives) {
			this.incentives = incentives;
		}
		public void setSales(double sales) {
			this.sales = sales;
		}
		public double getIncentive() {
			 incentives=sales*(20/100.0);
			 return incentives;
		 }
		 public double getTotalSalary() {
			  return basicSalary+incentives;
		 }
		

	}


