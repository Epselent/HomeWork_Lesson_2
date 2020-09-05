public class Task8 {
    public static void main(String[] args) {
        int[] arr = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
//        - максимальное значение
//        - сумму положительных элементов
//        - сумму четных отрицательных элементов
//        - количество положительных элементов
//        - среднее арифметическое отрицательных элементов
        int maxOfArr = arr[0];
        int sumPlus = 0;
        int sumEvenNeg = 0;
        int qtPlusEl = 0;
        double avrNegEl = 0;
        int qtNegEl = 0;
        for (int a:arr) {
            if(a > maxOfArr){
                maxOfArr = a;
            }
            if (a > 0){
                sumPlus +=a;
            }
            if(a%2 == 0 && a < 0 ){
                sumEvenNeg +=a;
            }
            if (a>0){
                qtPlusEl++;
            }
            if (a < 0){
                qtNegEl++;
                avrNegEl+=a;
            }
        }
        avrNegEl = avrNegEl/qtNegEl;
        System.out.println("Максимальное значение " + maxOfArr + ". Сумма положительных элементов " + sumPlus + ". Сумма четных отрицательных элементов " + sumEvenNeg +
                ". Количество положительных элементов " + qtPlusEl + ". Среднее арифметическое отрицательных элементов " + avrNegEl);

    }
}
