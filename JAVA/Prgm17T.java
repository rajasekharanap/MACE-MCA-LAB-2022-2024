package graphics;
class Triangle implements Properties
{
    int s1,s2,s3;
    Triangle(int s1,int s2,int s3)
    {
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
       
    }
    public void area()
    {
        double s;
        s=(s1+s2+s3)/3;
        System.out.println("Area- "+Math.sqrt(s*(s-s1)*(s-s2)*(s-s2)));
    }
   public void perimeter()
   {
    System.out.println("Perimter- "+(s1+s2+s3));
   }
}