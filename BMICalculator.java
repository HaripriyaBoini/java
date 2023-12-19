package Assignments_of_ContrlStmts;

 public class BMICalculator {
    public static void main(String[] args) {
        double weight = 75; // 75kgs
        float height = 67; // 67 inches
        char ch='F';
        char ch1='M';
        double inches_to_feet =height/12;   //5.58
        double targetweight;
        double weight1;
        

        double currentWeight = weight;
        System.out.println("currentWeight in kgs: " + weight);

        System.out.println("To convert into metre Units:");
        double heightInMetres = height * 0.0254; // converting inches to metres  //67*0.0254==1.70
        System.out.println("Height in metres: " + heightInMetres);

        double BMI = currentWeight / (heightInMetres * heightInMetres); // calculating BMI  //75/(1.7*1.7)===25.95
        System.out.println("BMI: " + BMI);                                                  //1.7*1.7==2.89

        if (BMI < 18.5) {
            System.out.println("Underweight");
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            System.out.println("Normal");
        } else if (BMI >= 25.0 && BMI <= 29.9) {
            System.out.println("Overweight");
        } else if (BMI >= 30.0) {
            System.out.println("Obese");
        }
        for( weight1=75;BMI<=18.5;weight1--) {
        	//double weight;
                //  71===24.5
        	 BMI = weight1 / (heightInMetres * heightInMetres);
        System.out.println("target weight"+weight1);                                      // target weight=66.1
        System.out.println("you must loose"+(weight-weight1)+"kgs to loose weight");      // o/p:you must loose 8.9kgs to loose weight
        }
                    	
        }
    }
 
        
       
     //   double healthyweight;
       // double height_of_women;
       // double i;
		//for( i=0;i<5;i++)                               //(inches_to_feet>=5.0)
          //     height_of_women = inches_to_feet+2.3;           //86.5
		// height_of_women1=height_of_women+2.3;              
       
        	
        	
        
       // if(healthyweight==66.1)
       // double targetWeight = 66.1;
        //if (currentWeight <= 75.0 || currentWeight == 66.1) {
        //    System.out.println("You must loose " + (currentWeight - targetWeight) + " kgs to get fit");
        //}
    //}





	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

