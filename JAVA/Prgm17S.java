package graphics;
class Square implements Properties
{
    int a;
    Square(int a)
    {
        this.a=a;
       
    }
    public void area()
    {
        System.out.println("Area- "+a*a);
    }
   public void perimeter()
   {
    System.out.println("Perimeter- "+4*a);
   }
}