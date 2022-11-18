import java.util.Scanner;

public class Ex4 
{
    //Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
    //Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static void main(String[] args) 
    {
        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        if (string.isEmpty())
            throw new IllegalArgumentException("Пустые строки вводить нельзя");
        else
            System.out.println(string);
    }
}

