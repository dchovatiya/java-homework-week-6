public class DivisionMethod
{
    public static void main(String[] args) {
        DivisionMethod d = new DivisionMethod(); //object
        //Calling division method from main method through class object, stored value in Div variable
        int Div=d.division();
        System.out.println(Div); //Print result in main method
    }
    //return type without parameters
    public int division()
    {
        int a=50;
        int b=3;
        int Div=a/b;
        return Div;
    }
}
