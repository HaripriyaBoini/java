package demo06.str_util;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	
		public static void main(String[] args) {
			String data = "shubham,kirthi,nilesh,ashish";
			StringTokenizer strToken = new StringTokenizer(data,",");  //default-false
			
			while(strToken.hasMoreTokens()) {
				System.out.println(strToken.nextToken());
			}
			StringTokenizer strToken2=new StringTokenizer(data,",",true);
			while(strToken2.hasMoreTokens()) {
				System.out.println(strToken2.nextToken());
				
			}
			System.out.println(strToken.countTokens());
			}
			

		}


