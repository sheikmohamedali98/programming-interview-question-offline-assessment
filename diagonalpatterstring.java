import java.util.*;

public class DiagonalPatternstring
{
    public void pattern_printing(String string)
    {
        int N=string.length();
        // Dividing the string length to store from center
        int n=N/2;
        System.out.println("Output: ");
        for(int row=0;row<N;row++)
        {
            for(int column=0;column<N;column++)
            {
                if( row+column==(N-1)+n ||row+column==n || row==column+n  || column==row+n)
               // if(row+column==n || column-row==n || row-column==n || row+column==(N-1)+n )
                {
                    System.out.print(string.charAt(column) + " ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        // Creating object to call method
        DiagonalPattern diagonal=new DiagonalPattern();
        System.out.println("Enter the String: ");
        String string=scan.next();
        if(string.length()%2!=0)
        {
            diagonal.pattern_printing(string);
        }
        else
        {
            System.out.println("Not Possible");
        }
    }
}
