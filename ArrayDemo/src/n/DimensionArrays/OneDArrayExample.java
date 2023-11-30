package n.DimensionArrays;

import java.util.Arrays;

public class OneDArrayExample {
	public static void main(String[] args) {
       int [] marks=new int[5];
       marks[0]=65;
       marks[1]=66;
       marks[2]=73;
       marks[3]=78;
       
       System.out.println(Arrays.toString(marks));
       double total=0;
       for(int mark:marks) {
    	   total=total+mark;
    	   
       }
       double percentage=total/marks.length;
       System.out.println(("percentage"+percentage));
       
       
}
}
