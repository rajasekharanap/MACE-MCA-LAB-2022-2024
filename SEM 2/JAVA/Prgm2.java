public class Prgm2 {
    public static void main(String args[])
    {
        Product item1=new Product(111,140,"Data");
        Product item2=new Product(222,340,"Se");
        Product item3=new Product(333,100,"ML");

        if(item1.price<item2.price && item1.price<item3.price)
        item1.display();
        if(item2.price<item1.price && item2.price<item3.price)
        item2.display();
        if(item3.price<item1.price && item3.price<item2.price)
        item3.display();
    }
}

class Product
{
  int pcode,price;
  String pname;
  Product(int x,int y,String z)
  {
    pcode=x;
    price=y;
    pname=z;
    System.out.println("The details of the product are "+pname+"\t"+pcode+"\t"+price);
  }   
  void display()
  {
    System.out.println();
    System.out.println("The product with lowest price is "+pname+"\t"+price+"\t"+pcode);
  }
}
