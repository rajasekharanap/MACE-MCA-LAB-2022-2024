import java.util.*;
import graphics.*;
public class Prgm17 
{
    public static void main(String args[])
    {
        int l,b,a,rad,s1,s2,s3;
        Scanner sc=new Scanner(System.in);
        System.out.println("l and b- ");
        l=sc.nextInt();
        b=sc.nextInt();
        System.out.println("s1 s2 s3- ");
        s1=sc.nextInt();
        s2=sc.nextInt();
        s3=sc.nextInt();
        System.out.println("a- ");
        a=sc.nextInt();
        System.out.println("r- ");
        rad=sc.nextInt();
        Rectangle r=new Rectangle(l,b);
        Triangle t=new Triangle(s1,s2,s3);
        Square s=new Square(a);
        Circle c=new Circle(rad);
        r.area();
        r.perimeter();
        t.area();
        t.perimeter();
        s.area();
        s.perimeter();
        c.area();
        c.perimeter();  
    }
}