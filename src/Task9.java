public class Task9 {
    public static void main(String[] args) {
        int[] arr = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
//        Переставить элементы массива в обратном порядке.

        for (int i = 0, j = arr.length-1; i < arr.length/2; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        for (int a: arr) {
            System.out.print(a + " ");

        }

   }
}
