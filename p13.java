//patern left
import java.util.*;
public class patternleft 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the word");
        String str= sc.next();
        char word[]=str.toCharArray();
        int length=str.length();
        System.out.println("patter is:");
        for(int i=0;i<length;i++)
        {
            for(int j=0;j<length-i;j++)
            {
                System.out.print(word[j]);
            }
            System.out.println();
        }
    }
    
}

