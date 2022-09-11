/**
* Базовая домашняя работа Java2 - задание №4
*
* @author ВладКолесник
* @todo 11.9.2022
* @дата 11.9.2022
*/
class HomeWork2_4 {
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
}