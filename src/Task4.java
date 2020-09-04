import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0){
            num += 1;
            System.out.println("Число положительное, увеличили на 1. Получилось "+ num);
        }else if (num != 0) {
            num -= 2;
            System.out.println("Число отрицательное, вычли 2 " + num);
        }
        else {
            num = 10;
            System.out.println("Число равно нулю. Заменили на "+ num);
        }
    }
}
