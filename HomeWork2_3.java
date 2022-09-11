/**
* Базовая домашняя работа Java2 - задание №3
*
* @author ВладКолесник
* @todo 11.9.2022
* @дата 11.9.2022
*/
class HomeWork2_1 {
    // Task 3
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
//Комментарий для деления, написал такое правило, что на ноль делить нельзя, но выдает ошибку
/*    /*if (b != 0.0) {
        return a / b;
    } else {
        System.out.println("cannot be divided by 0");
        */

    // Task 4
        public static void main(String[] args) {
        int d = 2;
        switch (d) {
            case 1:
                System.out.println("It's Monday");
                break;
            case 2:
                System.out.println("It's Tuesday");
                break;
            case 3:
                System.out.println("It's Wednesday");
                break;
            case 4:
                System.out.println("It's Thursday");
                break;
            case 5:
                System.out.println("It's Friday");
                break;
            case 6:
                System.out.println("It's Saturday");
                break;
            case 7:
                System.out.println("It's Sunday");
                break;
            default:
                System.out.println("Error Day number!");
                break;
        }
    }