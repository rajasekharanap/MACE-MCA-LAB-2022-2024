import java.util.*;
public class Prgm4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[5][5];
        int b[][]=new int[5][5];
        int c[][]=new int[5][5];
        int i,j;
        Prgm4 ob=new Prgm4();
        System.out.println("Enter the size of rows and columns- ");
        int row=sc.nextInt();
        int col=sc.nextInt();
        System.out.println("Enter the elements into matrix a- ");
        ob.input(row,col,a);
        System.out.println("Enter the elements into matrix b- ");
        ob.input(row,col,b);
        System.out.println("The elements of matrix a are- ");
        ob.display(row,col,a);
        System.out.println("The elements of matrix a are- ");
        ob.display(row,col,b);
        for(i=0;i<row;i++)
            {
                for(j=0;j<col;j++)
                {
                    c[i][j]=a[i][j]+b[i][j];
                }
            }
        System.out.println("The elements of matrix c are- ");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
    int i,j;
    Scanner sc=new Scanner(System.in);
    void input(int r,int c,int ar[][])
        {
            for(i=0;i<r;i++)
            {
                for(j=0;j<c;j++)
                {
                    ar[i][j]=sc.nextInt();
                }
            }
        }
    

    void display(int rr, int cc, int arr[][])
    {
        for(i=0;i<rr;i++)
        {
            for(j=0;j<cc;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
