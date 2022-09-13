/**
* Базовая домашняя работа Java2 - задание 1 и 2
*
* @author ВладКолесник
* @todo 07.9.2022
* @дата 13.9.2022
*/
class HoWo2 {
    public static void main(String[] args) {
        // Task №1
            System.out.println(checkWeather(-1));
            System.out.println(checkWeather(1));
            System.out.println(checkWeather(23));
            System.out.println(checkWeather(35));

        // Task №2
            System.out.println(canWalk(true, true)? "I can walk" : "I can't walk");
            System.out.println(canWalk(false, true)? "I can walk" : "I can't walk");
            System.out.println(canWalk(true, false)? "I can walk" : "I can't walk");
            System.out.println(canWalk(false, false)? "I can walk" : "I can't walk");

        // Task 3
        int s = add(5, 3);
        System.out.println(s);
        int d = sub(5, 3);
        System.out.println(d);
        int m = mul(5, 3);
        System.out.println(m);
        float g = div(5, 3);
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
    static float div(float a, float b){
        float g = a / b;
         return g;
    }

    static String checkWeather (int t) {
        if (t < 0) {
            return "It’s frost";
        } else if (t <= 18){
            return "It’s cold";
        } else if (t <= 28){
            return "It’s warm";
        } else {
            return "It’s hot";
        }
    }
    static boolean canWalk(boolean isWeekend, boolean isRain){
        return isWeekend && !isRain;
    }
}