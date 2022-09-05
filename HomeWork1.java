class HomeWork1 {
    public static void main(String[] args) {
        // Exercise 1
        int a = 15;
        int b = 30;
        System.out.println("P = " + ((a * 2) + (b * 2)));
        System.out.println("S = " + (a * b));
        // Exercise 2
        float c = 5;
        float e = 3;
        System.out.println("Sum = " + (c + e));
        System.out.println("Dif = " + (c - e));
        System.out.println("Multi = " + (c * e));
        System.out.println("Div = " + (c / e));
        // Exercise 3
        int[] array = new int[5];
        array[0] = 5;
        array[1] = 10;
        array[2] = 15;
        array[3] = 20;
        array[4] = 25;
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        // Exercise 4 (r: radius of pizza, cm, constanta = 40 kal/1 kv.cm) (k * (Math.PI * ((d / 2) ** 2))))
        int r = 10;
        int kal = 40;
        int k = 2;
        System.out.println("Sum of kall = " + (kal * (Math.PI * (r * r))));
    }
}