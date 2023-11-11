import java.util.*;
class verify extends Exception
{
    verify(String s)
    {
        super(s);
    }
}

class Prgm19
{
    public static void main(String args[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            String uname,pass;
            System.out.println("uname and pass ");
            uname=sc.next();
            pass=sc.next();
            data(uname,pass);
        }
        catch(verify e)
        {
            System.out.println("due to "+e);
        }
    }
    static void data(String u, String p) throws verify
    {
        if(u.equals("Sekhar") && p.equals("Sekhar@9645"))
        {
            System.out.println("login success");
        }
        else
        {
            throw new verify("uname or pass doesn't match");
        }
    }

}