import java.util.*;
public class Prgm3 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st real part- ");
        int freal=sc.nextInt();
        System.out.println("Enter 1st imaginary part- ");
        int fima=sc.nextInt();
         System.out.println("Enter 2nd real part- ");
        int sreal=sc.nextInt();
        System.out.println("Enter 2nd imaginary part- ");
        int sima=sc.nextInt();

        System.out.println("The values after adding is- "+(freal+sreal)+"+"+(fima+sima)+"i");
    }
}
