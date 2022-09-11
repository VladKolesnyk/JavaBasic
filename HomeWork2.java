/**
* Базовая домашняя работа Java2 - задание 1 и 2
*
* @author ВладКолесник
* @todo 11.9.2022
* @дата 11.9.2022
*/
class HomeWork2 {
    public static void main(String[] args) {
        // Task №1
        int t = 0;
        if (t <= -1) {
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
        if (isWeekend&& isRain){
            System.out.println("I can walk");
        } else {
            System.out.println("I cannot walk");
        }
    }
    
}