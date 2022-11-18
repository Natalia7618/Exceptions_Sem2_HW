public class Ex2 
{
    //Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
    public static void main(String[] args) 
    {
        try 
        {
            int[] intArray = {11, 12, 53, 74, 55, 96, 77, 88, 99};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Catching exception: " + e);
        }
         
    }
}
