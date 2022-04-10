import java.util.Scanner;


public class lagerpalindrome {
	public static String palindrome(final String input ){
		int leftindex=0,rightindex=0;
		String currentstring="",longeststring="";
		for(int current=1;current<=input.length();current++){
			leftindex=current-1;
			rightindex=current+1;
			while(leftindex>=0&&rightindex<input.length()-1){
				if(input.charAt(leftindex)!=input.charAt(rightindex)){
					break;
				}
				currentstring=input.substring(leftindex, rightindex+1);
				longeststring= currentstring.length()> longeststring.length() ?currentstring:longeststring;
				leftindex--;
				rightindex++;
			}
			
		}
		return longeststring;
	}

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("enter the string:");
String input=in.next();
String pali=palindrome(input);
System.out.println("longest palindrome  "+pali);
	}

}