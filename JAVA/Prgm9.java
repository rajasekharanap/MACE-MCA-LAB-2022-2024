public class Prgm9 
{
    public static void main(String args[])
    {
        Prgm9 obj=new Prgm9();
        obj.area(4);
        obj.area(4,6);
        obj.area(5);

    }   
    void area(int a)
    {
        System.out.println("square area: "+a*a);
    } 
    void area(int l,int b)
    {
        System.out.println("rectangle area: "+l*b);
    } 
    void area(double r)
    {
        System.out.println("square area: "+3.14*r*r);
    } 
}
