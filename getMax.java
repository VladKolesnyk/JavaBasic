class HoWo3 {
    public static void main(String[] args) {
        static void getMax(int max);
        int[] arr = {55, 7, 2, -5, 10, 16, 31, 4};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < max){
                max = arr[i];
                return;
            }
        }
        System.out.println(max);
    }
            static void printArray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
                System.out.print("]");
    }
}