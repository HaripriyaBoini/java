package javaprgm;

public class demo1 {

	public static void main(String[] args) {
		//check whether a character is uppercase or lowercase alphabet

				char ch;
				ch = 'H';
				//a--97+25--122
				// lower --- 97 -- 122
				// upper ----65 -90---- A--Z
				
				System.out.println(ch+ " ...ascii value-->"+(int)ch);
				if ( (ch >= 97) && (ch <= 122)) {
					System.out.println("Character is Lower Case");
				}
				else if ( (ch >= 65) && (ch <= 90)) {
					System.out.println("Character is Upper Case");
				}
				
			}

		}
	


