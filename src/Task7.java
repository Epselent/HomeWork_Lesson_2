import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Введите код города");
        Scanner scanner = new Scanner(System.in);
        int cityCode = scanner.nextInt();
        int numOfMin = 10;
        Map<Integer, Double> price = new HashMap<>();
        price.put(905, 4.15);
        price.put(194, 1.98);
        price.put(491, 2.69);
        price.put(800, 5.00);
        Map<Integer,String> cityCodeMap = new HashMap<>();
        cityCodeMap.put(905, "Москва");
        cityCodeMap.put(194, "Ростов");
        cityCodeMap.put(491, "Краснодар");
        cityCodeMap.put(800, "Киров");
        System.out.println(cityCodeMap.get(cityCode) + ". Стоимость разговора: " + (numOfMin * price.get(cityCode)));
    }
}

