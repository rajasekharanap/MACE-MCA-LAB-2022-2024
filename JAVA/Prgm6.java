import java.util.*;
public class Prgm6 
{
 public static void main(String args[])
 {
    Scanner sc=new Scanner(System.in);
    String s[]=new String[10];
    System.out.println("enter the string");
    for(int i=0;i<s.length;i++)
    s[i]=sc.nextLine();
    Prgm6 obj=new Prgm6();
    obj.sorting(s);
 }   

 void sorting(String str[])
 {  
    int i,j;
    for(i=0;i<str.length;i++)
    {
        for(j=0;j<str.length;j++)
        {
            if(str[i].compareTo(str[j])<0)
            {
                String temp=str[i];
                str[i]=str[j];
                str[j]=temp;
            }
        }
    }
    System.out.println();
    for(i=0;i<str.length;i++)
    {
        System.out.println(str[i]);
    }
 }
 
}
