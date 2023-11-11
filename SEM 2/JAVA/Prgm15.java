import java.util.*;
public class Prgm15 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Circle c=new Circle();
        Rectangle r=new Rectangle();
        while(true)
        {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1.carea");
            System.out.println("2.cperi");
            System.out.println("3.rarea");
            System.out.println("4.rperi");
            System.out.println("5.Exit");
            System.out.println("ch");
            System.out.println();
            int ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                float ar=c.area();
                System.out.println(ar);
                break;
                case 2:
                float pr=c.perimeter();
                System.out.println(pr);
                break;
                case 3:
                float ar1=r.area();
                System.out.println(ar1);
                break;
                case 4:
                float pr1=r.perimeter();
                System.out.println(pr1);
                break;
                case 5:
                System.out.println("Exit");
                System.exit(0);
                default:
                System.out.println("invalid");
            }
        }
    }
}

interface Shape
{
    float area();
    float perimeter();
    float pi=3.14F;
}

class Circle implements Shape
{
    Scanner sc=new Scanner(System.in);
    int rad;
    
    public float area()
    {
        System.out.println("Enter rad- ");
        rad=sc.nextInt();
        return(pi*rad*rad);
    }
    public float perimeter()
    {
        System.out.println("Enter rad- ");
        rad=sc.nextInt();
        return(pi*2*rad);
    }
}


class Rectangle implements Shape
{
    Scanner sc=new Scanner(System.in);
    int l,b;
    
    public float area()
    {  
        System.out.println("Enter l- ");
        l=sc.nextInt();
        System.out.println("Enter b- ");
        b=sc.nextInt();
        return(l*b);
    }
    public float perimeter()
    {
        System.out.println("Enter l- ");
        l=sc.nextInt();
        System.out.println("Enter b- ");
        b=sc.nextInt();
        return(2*(l+b));
    }
}