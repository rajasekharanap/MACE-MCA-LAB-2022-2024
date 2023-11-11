import java.util.*;
public class Prgm10 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // System.out.println("array size- ");
        // int size=sc.nextInt();
        int a[]={12,23,4,5,66,77,22};
        // System.out.println("array values- ");
        // for(i=0;i<size;i++)
        // {
        //     a[i]=sc.nextInt();
        // }
        System.out.println("enter search element");
        int skey=sc.nextInt();
        int index=search(a,skey);
        if (index==0)
        System.out.println("not found");
        else
        System.out.println("found at index "+index+" "+a[index]);
    }

    static int search(int ar[],int key)
    {
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]==key)
            return i;           
        }
        return 0;
    }
}

