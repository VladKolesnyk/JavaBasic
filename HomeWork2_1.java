class HomeWork2_1 {
    public static void main(String[] args) {
        int s = add(9, 3);
        System.out.println(s);
        int d = sub(9, 3);
        System.out.println(d);
        int m = mul(9, 3);
        System.out.println(m);
        int g = div(9, 3);
        System.out.println(g);
    }

    static int add(int a, int b){
        int c = a + b;
        return c;
    }
    static int sub(int a, int b){
        int d = a - b;
        return d;
    }
    static int mul(int a, int b){
        int m = a * b;
        return m;
    }
    static int div(int a, int b){
        int g = a / b;
         return g;
    }
}
//Комментарий для деления, написал такое правило, что на ноль делить нельзя, но выдает ошибку
/*    /*if (b != 0.0) {
        return a / b;
    } else {
        System.out.println("cannot be divided by 0");
        */