import java.util.*;
class Invalid extends Exception
{
    Invalid(String s)
    {
        super(s);
    }
}

class Prgm20
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,count=0,n,i=0,temp;
        System.out.println("Enter limit- ");
        n=sc.nextInt(); 
        System.out.println("Enter nums - ");
        for(i=0;i<n;)
        {
            try
            {   
                temp=sc.nextInt();
                if(temp>0)
                {
                    sum=sum+temp;
                    count=count+1;
                    i=i+1;
                }    
                else
                {   
                    throw new Invalid("Negative number ");
                }
            }
            catch(Invalid e)
            {
                System.out.println("error due to "+e);
            }
        }
        System.out.println("sum"+(float)sum/count);
    }
}
