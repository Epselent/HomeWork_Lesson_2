public class task10 {
    public static void main(String[] args) {
        int[] arr = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
//        Переместить нули в конец массива
        int a = 0;
        for (int i = arr.length-1; i > 0; i--) {
            if(arr[i] == 0){
                a++;
                int tmp = arr[i];
                for (int j = i; j <arr.length-a ; j++) {
                    arr[j] = arr[j+1];
                }
                arr[arr.length-a] = tmp;
            }
        }
        for (int b: arr) {
            System.out.print(b + " ");

        }
    }
}
