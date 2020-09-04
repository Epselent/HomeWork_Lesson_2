import java.nio.charset.MalformedInputException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println("Последняя цифра числа = " + num%10);

    }
}
