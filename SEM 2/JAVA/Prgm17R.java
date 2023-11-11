package graphics;
class Rectangle implements Properties
{
    int l,b;
    Rectangle(int l, int b)
    {
        this.l=l;
        this.b=b;
    }
    public void area()
    {
        System.out.println("Area- "+l*b);
    }
   public void perimeter()
   {
    System.out.println("Perimeter- "+2*(l*b));
   }
}