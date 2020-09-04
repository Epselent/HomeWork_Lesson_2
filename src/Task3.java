import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0){
            System.out.println("Число положительное, увеличили на 1. Получилось "+ (num + 1));
        }else
            System.out.println("Число отрицательное, осталось без иззменений " + num);
    }
}
