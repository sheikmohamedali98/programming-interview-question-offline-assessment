import java.util.*;

public class LargestPossibleString
{
    public void largest_string(String string1,String string2)
    {
        char[] letter1=string1.toCharArray();
        char[] letter2=string2.toCharArray();
        for(int i=0;i<letter1.length;i++)
        {
            for(int j=i+1;j<letter1.length;j++)
            {
                if(letter1[i]<letter1[j])
                {
                    char temp=letter1[j];
                    letter1[j]=letter1[i];
                    letter1[i]=temp;
                }
            }
        }
        for(int i=0;i< letter2.length;i++)
        {
            for(int j=i+1;j< letter2.length;j++)
            {
                if(letter2[i]<letter2[j])
                {
                    char temp=letter2[j];
                    letter2[j]=letter2[i];
                    letter2[i]=temp;
                }
            }
        }
        System.out.println("String 1: "+String.valueOf(letter1));
        System.out.println("String 2: "+String.valueOf(letter2));
    }
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of String to be Entered: ");
        int number=in.nextInt();
        System.out.println("String 1: ");
        String string1=in.next();
        System.out.println("String 2: ");
        String string2=in.next();
        LargestPossibleString largest=new LargestPossibleString();
        largest.largest_string(string1,string2);
    }
}
