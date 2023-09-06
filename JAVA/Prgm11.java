import java.util.Scanner;

public class Prgm11 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int i;
        System.out.println("Eneter number of- ");
        int num=sc.nextInt();
        Teacher[] obj=new Teacher[num];
        for(i=0;i<num;i++)
        {
            System.out.println("enter the details for employee num- "+i);
            System.out.println("empid ");
            int empid=sc.nextInt();
            System.out.println("ename ");
            String ename=sc.next();
            System.out.println("salary ");
            int salary=sc.nextInt();
            System.out.println("addr ");
            String addr=sc.next();
            System.out.println("dep ");
            String dep=sc.next();
            System.out.println("subs ");
            String subs=sc.next();
            obj[i]=new Teacher(empid,ename,salary,addr,dep,subs);
            System.out.println();
        }
        int skey=sc.nextInt();
        for(i=0;i<num;i++)
        {   
            if(obj[i].empid==skey)
            {
            obj[i].display();
            System.out.println();
            }
        }


    }
}


class Employee
{
    int empid,salary;
    String ename,addr;
    public Employee(int empid, String ename,int salary, String addr)
    {
        this.empid=empid;
        this.ename=ename;
        this.salary=salary;
        this.addr=addr;
    }
}

class Teacher extends Employee
{
    String dep,subs;
    public Teacher(int empid, String ename,int salary, String addr, String dep, String subs)
    {
        super(empid, ename, salary, addr);
        this.dep=dep;
        this.subs=subs;
    }
    public void display()
    {
        System.out.println(empid);
        System.out.println(ename);
        System.out.println(salary);
        System.out.println(addr);
        System.out.println(dep);
        System.out.println(subs);
    }
}
