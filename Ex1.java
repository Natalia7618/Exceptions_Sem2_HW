import java.util.Scanner;

/**
 * Main
 */

public class Ex1 
{
//Задание 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static void main(String[] args) 
    {        
        System.out.println("Ответ: " + InputFloat());
    }
    public static float InputFloat() 
    {
        try 
        {
            System.out.println("Введите дробное число: ");
            Scanner in = new Scanner(System.in);
            return Float.parseFloat(in.next());
        } 
        catch (Exception e) 
        {
            return InputFloat();
        }
    }
}