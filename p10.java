//smallest number
import java.util.*;
public class smallest 
{
     public static void main(String[] args)
     {
        Scanner sc=new Scanner(System.in);
        int a,N,smallest=0;
        System.out.println("enter the  total number of elements");
        a=sc.nextInt();
        System.out.println("enter the elements");
        for(int i=1;i<=a;i++)
        {
            N=sc.nextInt();
            if(i==1 && N>0)
            {
                smallest=N;
            }
            if(N<smallest)
            {
                smallest=N;
            }
           
        }
        System.out.println("smallest number is:"+smallest);
    }
}
