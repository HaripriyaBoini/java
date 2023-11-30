package demo06.str_util;

import java.util.StringJoiner;

public class StringJoinerDemo {

	public static void main(String[] args) {
		       StringJoiner names1 = new StringJoiner(",");
		       names1.add("vikas");
		       names1.add("ankit");
		       names1.add("rahul");
		       System.out.println("\n"+names1);
		       
		       StringJoiner names2 = new StringJoiner("-","[","]");
		       names2.add("KIRTHI").add("Shubam").add("Ashish");
               System.out.println(names2);
               names1.merge(names2);
               System.out.println(names1);

	}

}
