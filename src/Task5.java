import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Введите три целых числа");
        Scanner scanner = new Scanner(System.in);

        int [] num = new int[3];
        for (int i = 0; i < num.length ; i++) {
            num[i] = scanner.nextInt();

        }
        int minNum = num[0];
        for (int a:num){
            if (a < minNum){
                minNum = a;
            }
        }
        System.out.println("Минимальное число " + minNum);
    }
}
