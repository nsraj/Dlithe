//second largest
import java.util.*;
public class second
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a,N=0,max=N,max2=N,min=N;
        System.out.println("enter the  total number of elements");
        a=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=1;i<=a;i++)
        {
            N=sc.nextInt();
            
           if(N>max)
           {
            max2=max;
            max=N;
           }
           else if(N>max2)
           {
            max2=N;
           }
        }
        System.out.println(" the second largest number is:"+max2);
    }
}
