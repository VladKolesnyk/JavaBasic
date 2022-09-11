/**
* Базовая домашняя работа Java2 - задание 1 и 2
*
* @author ВладКолесник
* @todo 07.9.2022
* @дата 11.9.2022
*/
class HoWo2 {
    public static void main(String[] args) {
        // Task №1
        int t = 0;
        boolean checkWeather = t <= -1;
            System.out.println(checkWeather);
        if (checkWeather) {
            System.out.println("It’s frost");
        } else if (t <= 18){
            System.out.println("It’s cold");
        } else if (t <= 28){
            System.out.println("It’s warm");
        } else if (t >= 29){
            System.out.println("It’s hot");
        }

        // Task №2
        boolean isWeekend = true;
        boolean isRain = !false;
            System.out.println(isWeekend);
            System.out.println(isRain);
        if (isWeekend&& isRain){
            System.out.println("I can walk");
        } else {
            System.out.println("I cannot walk");
        }
        // Task 3
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