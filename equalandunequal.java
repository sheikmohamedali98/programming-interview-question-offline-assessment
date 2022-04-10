

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FrequecyOfString {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		String str= in.next();
		char [] chArr = str.toCharArray();
		TreeSet <Integer> s = new TreeSet<>();
		
		
		
		for (int i = 0 ;i<chArr.length-1;i++) {
			System.out.println(chArr[i]+"  "+chArr[i+1]);
			System.out.println(chArr[i]-chArr[i+1]);
			int number = Math.abs(chArr[i]-chArr[i+1]);
			s.add(number);
		}
		
		if (s.size() == 1) {
			System.out.println("The Given String is Equal");
		}
		else {
			System.out.println("The Given String in unequal");
		}
	}

}
