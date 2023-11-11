import java.util.*;
public class Prgm14
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int rno,m1,m2;
        String name;
        System.out.println("rno");
        rno=sc.nextInt();
        System.out.println("name");
        name=sc.next();
        System.out.println("m1");
        m1=sc.nextInt();
        System.out.println("m2");
        m2=sc.nextInt();
        Result re=new Result(rno,name,m1,m2);
        
        re.academic();
        re.sinput();
        re.display();
        re.sdisplay();
    }
}


interface Sports
{
    void sinput();
    void sdisplay();
}
class Student
{
    int rno,m1,m2;
    String name;
    Student(int rno,String name,int m1,int m2)
    {
        this.rno=rno;
        this.name=name;
        this.m1=m1;
        this.m2=m2;
    }
    void display()
    {
        System.out.println(rno);
        System.out.println(name);
        System.out.println(m1);
        System.out.println(m2);
    }
}


class Result extends Student implements Sports
{
    String item;
    int rank;
    Result(int rno,String name,int m1,int m2)
    {
        super(rno,name,m1,m2);
    }
    void academic()
    {
        float total=m1+m2;
        float percent=total*100/200;
        System.out.println("Percentage"+percent);
    }

    public void sinput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter item ");
        item=sc.next();
        System.out.println("enter rank ");
        rank=sc.nextInt();
    }

    public void sdisplay()
    {
        System.out.println(item);
        System.out.println(rank);
        System.out.println();
        
    }
}
