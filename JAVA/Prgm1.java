class Prgm1
{
    public static void main(String args[])
    {
        display();
        Prgm1 obj=new Prgm1();
        obj.show();
        Outer.disp();
    }
    static void display()
    {
        System.out.println("This is a static method");
    }
    void show()
    {
        System.out.println("Non static method");
    }
}

class Outer
{
    static void disp()
    {
        System.out.println("Static in outer class");
    }
}