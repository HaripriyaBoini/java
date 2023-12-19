package Assignments_of_ContrlStmts;

public class bMI {
	
	
	    public static void main(String[] args) {
	        double weight = 75; // 75kgs
	        float height = 67; // 67 inches
	        double height1 = height/12;

	        double currentWeight = weight;
	        System.out.println("currentWeight in kgs: " + weight);

	        System.out.println("To convert into metre Units:");
	        double heightInMetres = height * 0.0254; // converting inches to metres
	        System.out.println("Height in metres: " + heightInMetres);

	        double BMI = currentWeight / (heightInMetres * heightInMetres); // calculating BMI
	        System.out.println("BMI: " + BMI);
	        
	        

	        if (BMI < 18.5) {
	            System.out.println("Underweight");
	        } else if (BMI >= 18.5 && BMI <= 24.9) {
	            System.out.println("Normal");
	        } else if (BMI >= 25.0 && BMI <= 29.9) {
	            System.out.println("Overweight");
	        } else if (BMI >= 30.0) {
	            System.out.println("Obese");
	        }
           
			double targetWeight;
			if(height1>=5.0) {
				
			
			for( weight=75;weight>=66.1;weight--) {
			for(double targetBMI=18.5;targetBMI<=30.0;targetBMI++) {
	         // Target BMI for a healthy weight
	        targetWeight = (targetBMI *2.3); // Calculating the target weight for a healthy BMI

	        System.out.println("Target Weight  : " + targetWeight + " kgs");

	        double weightDifference = currentWeight - targetWeight;
	       

	        System.out.println("You must loose a weight of " + weightDifference + " kgs  ");
	    }
	}
}
	    }
	    
}

	



