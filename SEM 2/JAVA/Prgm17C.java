package graphics;
class Circle implements Properties
{
    int r;
    Circle(int r)
    {
        this.r=r;
    }
    public void area()
    {
        System.out.println("Area- "+3.14*r*r);
    }
   public void perimeter()
   {
    System.out.println("Perimeter- "+3.14*2*r);
   }
}