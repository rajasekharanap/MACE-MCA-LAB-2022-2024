import java.util.*;
public class Prgm8 
{
    int eno,salary;
    String ename;
    public Prgm8()
    {
        Scanner  sc=new Scanner(System.in);
        System.out.println("Eno- ");
        eno=sc.nextInt();
        System.out.println("ename- ");
        ename=sc.next();
        System.out.println("Salary- ");
        salary=sc.nextInt();
    }
    void display()
    {
        System.out.println("eno= "+eno);
        System.out.println("ename= "+ename);
        System.out.println("salary= "+salary);
    }

    public static void main(String args[])
    {
        int i,limit,seno,f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of employees- ");
        limit=sc.nextInt();
        Prgm8 emp[]=new Prgm8[limit];
        for(i=0;i<limit;i++)
        {
            emp[i]=new Prgm8();
        }
        System.out.println("Enter the search empno- ");
        seno=sc.nextInt();
        for(i=0;i<limit;i++)
        {
            if(emp[i].eno==seno)
            seno=i;
        }
        if(f==1)
        System.out.println("Not found");
        else
        emp[f].display();
    }
}
