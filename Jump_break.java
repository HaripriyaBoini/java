package jump;

public class Jump_break {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		char operation='+';
		int result=0;
		switch(operation) {
		case '+':
			result=num1+num2;
			break;
		case '-':
		     result=num1-num2;
		default:
			result=0;
		}
		System.out.println("result="+result);
		}

	}


