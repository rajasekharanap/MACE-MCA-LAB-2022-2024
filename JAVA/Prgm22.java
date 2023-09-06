
import java.util.*;
class Prgm22 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int limit;
        System.out.println("Enter limit: ");
        limit=sc.nextInt();
        Multiply m=new Multiply();
        Prime p=new Prime(limit);
        m.start();
        p.start();
        try
        {
            m.join();
            p.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        sc.close();
    }

}


class Multiply extends Thread
{
    public void run()
    {
        int i;
        for(i=1;i<=10;i++)
        {
            try
            {
                System.out.println("5 * "+i+" = "+5*i);
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

class Prime extends Thread
{
    int limit;
    Prime(int limit)
    {
        this.limit=limit;
    }
    void prime(int limit)
    {
        int c=0;
        int flag=0,num=2;
        while(c<=limit)
        {
                for(int i=1;i<=num;i++)
                {
                    try
                    {
                        if(num%i==0)
                        {
                            flag++;
                        }
                        if(flag<3)
                        {
                            c++;
                            System.out.println("Prime- "+num);
                        }
                        num++;
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e)
                    {
                        System.out.println(e);
                    }
                }
        }
    }
}

// public void run(int limit)
    // {
    //     int count=0,num=3;
    //     while(count<limit)
    //     {
    //         int recev=prime(num);
    //         if(recev==1)
    //         {
    //             System.out.println(num);
    //             count++;
    //         }
    //         num++;
    //         try
    //         {
    //             Thread.sleep(1000);
    //         }
    //         catch(InterruptedException e)
    //         {
    //             System.out.println(e);
    //         }
    //     }