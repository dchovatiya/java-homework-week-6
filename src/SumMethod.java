public class SumMethod
{
    public  static void main(String[] args)
    {
        //return type with parameters
        SumMethod s=new SumMethod(); //object
        int Total=s.addition( 74, 36);
        System.out.println(Total);
    }
    public int addition(int a,int b)
    {
        int Total= a+b;
        return Total;
    }
}
