/**
* Базовая домашняя работа Java2 - задание 1 и 2
*
* @author ВладКолесник
* @todo 12.9.2022
* @date 15.9.2022
*/
class HoWo3 {
    public static void main(String[] args) {
        // Task №1
        int[] array = {55, 7, 2, -5, 10, 16, 31, 4};
        printArray(array);

        // Task №2
        int max = getMax(array);
        System.out.println("Max =" + max);

        // Task №3
        int[] invArray = {1, 1, 0, 0, 1, 0, 0, 1, 1, 0};
        printArray(invArray);
        printArray(invertArray(invArray));
    }

    static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    static int getMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    static int[] invertArray(int[] array){
        int[] result = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            result[i] = 1 - array[i];
        }
        return result;
    }
}