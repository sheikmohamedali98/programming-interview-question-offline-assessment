import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class dublicateremove {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter The String:");
		String str=in.nextLine();
		Set<String> temp= new LinkedHashSet<String>(); //this is not allow dublicate String
		String[] arr=str.split(" ");
		for(String store:arr){
			temp.add(store);
			
		}
		String answer=temp.toString().replace("[", " ").replace("]", " ").replace(",", " ") ;//set we will print some character],[ like this
		
		
System.out.println("The Distinct Word are: "+answer);
	}

}
