import java.util.*;
public class Prgm12 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("enter number of counts ");
        int count=sc.nextInt();
        Teacher[] obj=new Teacher[count];
        for(i=0;i<count;i++)
        {
            System.out.println("name");
            String name=sc.next();
            System.out.println("gender");
            String gender=sc.next();
            System.out.println("addr");
            String addr=sc.next();
            System.out.println("age");
            int age=sc.nextInt();
            System.out.println("empid");
            int empid=sc.nextInt();
            System.out.println("cname");
            String cname=sc.next();
            System.out.println("salary");
            int salary=sc.nextInt();
            System.out.println("quali");
            String quali=sc.next();
            System.out.println("sub");
            String sub=sc.next();
            System.out.println("dep");
            String dep=sc.next();
            System.out.println("tid");
            int tid=sc.nextInt();
            obj[i]=new Teacher(name ,gender ,addr, age,empid ,cname ,salary,quali, sub, dep, tid);
            System.out.println();
        }
        for(i=0;i<count;i++)
        {
            obj[i].display();
            System.out.println();
        }

    }
}

class Person
{
    String name,gender,addr;
    int age;
    Person(String name ,String gender ,String addr, int age)
    {
        this.name=name;
        this.gender=gender;
        this.addr=addr;
        this.age=age;
    }
}

class Employee extends Person
{
    int empid,salary;
    String cname,quali;
    Employee(String name ,String gender ,String addr, int age,int empid ,String cname ,int salary, String quali)
    {
        super(name ,gender ,addr,age);
        this.empid=empid;
        this.cname=cname;
        this.salary=salary;
        this.quali=quali;
    }
}

class Teacher extends Employee
{
    String sub,dep;
    int tid;
    Teacher(String name ,String gender ,String addr, int age,int empid ,String cname ,int salary, String quali,String sub,String dep,int tid)
    {
        super( name ,gender ,addr, age,empid , cname , salary, quali);
        this.sub=sub;
        this.dep=dep;
        this.tid=tid;
    }

    void display()
    {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(addr);
        System.out.println(age);
        System.out.println(empid);
        System.out.println(cname);
        System.out.println(salary);
        System.out.println(quali);
        System.out.println(sub);
        System.out.println(dep);
        System.out.println(tid);
    }
}


