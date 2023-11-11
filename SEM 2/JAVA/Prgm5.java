import java.util.*;
class Prgm5 
{
    public static void main(String args[])
    {
        Cpu obj1=new Cpu();
        Cpu.Processor obj2=obj1.new Processor();
        Cpu.Ram obj3=new Cpu.Ram();
        obj1.input();
        obj2.input();
        obj3.input();
        obj1.display();
        obj2.display();
        obj3.display();

    }
}


class Cpu
{
    Scanner sc=new Scanner(System.in);
    int price;
    void input()
    {
        System.out.println("enter cpu price- ");
        price=sc.nextInt();
    }
    void display()
    {
        System.out.println("cpu price- "+price);
    }

    class Processor
    {
        int cores;
        String manu;
        void input()
        {
            System.out.println("enter cores- ");
            cores=sc.nextInt();
            System.out.println("enter manu name- ");
            manu=sc.next();
        }
        void display()
        {
            System.out.println("pro cores- "+cores);
            System.out.println("pro manu name- "+manu);
            
        }
    }

    static class Ram
    {
        int mem;
        String manu;
        Scanner sc=new Scanner(System.in);
        void input()
        {
            System.out.println("enter cores- ");
            mem=sc.nextInt();
            System.out.println("enter manu name- ");
            manu=sc.next();
        }
        void display()
        {
           System.out.println("ram mem "+mem);
           System.out.println("ram manu name- "+manu); 
        }
    }
}