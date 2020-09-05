import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num == 0){
            System.out.println("Число нулевое");
        }else if (num%2 == 0){
            if (num > 0){
                System.out.println("Число положительное четное");
            }else  System.out.println("Число отрицательное четное");
        }else if (num < 0){
            System.out.println("Число отрицательное нечетное");
        }else System.out.println("Число положительное нечетное");
    }
}
