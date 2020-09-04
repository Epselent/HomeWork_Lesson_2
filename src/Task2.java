import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите трех значное число");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sumOfNum = 0;
        while (number > 0){
            sumOfNum += number%10;
            number /= 10;
        }
        System.out.println("Сумма чисел равна " + sumOfNum);
    }
}
