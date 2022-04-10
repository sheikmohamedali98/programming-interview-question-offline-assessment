import java.util.Scanner;


public class spirlpattern {
	public static void pattern(int n){
	int size=2*n-1;
	for(int i=1;i<=size;i++){
		for(int j=1;j<=size;j++)
			{
				System.out.print(Math.max(Math.abs(i-n), Math.abs(j-n))+1+" ");
			}
		System.out.println();
	}}

	public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.println("enter the number:");
int n=in.nextInt();
pattern(n);
}}
