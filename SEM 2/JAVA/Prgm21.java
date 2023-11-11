import java.util.*;
public class Prgm21 
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int limit,start,end;
    System.out.println("Enter limit, start and end");
    limit=sc.nextInt();
    start=sc.nextInt();
    end=sc.nextInt();
    Fibonacci f=new Fibonacci(limit);
    Evenum e=new Evenum(start,end);
    Thread fib=new Thread(f);
    Thread even=new Thread(e);
    fib.start();
    even.start();
        try
        {
            fib.join();
            even.join();
        }
        catch(InterruptedException s)
        {
            System.out.println(s);
        }
        System.out.println("Thread finished execution");
        sc.close();
    }
}

class Fibonacci implements Runnable
{
    int limit;
    Fibonacci(int limit)
    {
        this.limit=limit;
    }
    public void run()
    {
        int prev=0,next=1,i,current;
        System.out.println(prev);
        System.out.println(next);
        for(i=0;i<limit;i++)
        {
            current=prev+next;
            System.out.println(current);
            prev=next;
            next=current;
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}

class Evenum implements Runnable
{
    int start,end;
    Evenum(int start,int end)
    {
        this.start=start;
        this.end=end;
    }
    public void run()
    {
        
        int i;
        for(i=start;i<end;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even number- "+i);
            }
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}