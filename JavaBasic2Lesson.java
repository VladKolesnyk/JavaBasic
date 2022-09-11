class JavaBasic2Lesson {
    public static void main(String[] args) {
        int t = 1;
        if (t < 0) {
            System.out.println("It’s frost");
        } else if (t >= 0){
            System.out.println("It's spring");
        } else if (m == 6 || m == 7 || m == 8) {
            System.out.println("It's summer");
        } else if (m == 9 || m == 10 || m == 11) {
            System.out.println("It's fall");
        } else {
            System.out.println("Error Month number!");
        }
        //boolean isWeekend = true;
        //boolean isCanWalk = true;
        //if (isWeekend&& isCanWalk){
            //System.out.println("I can walk");
        //} else {
            //System.out.println("I cannot walk");
        }
        int d = 1;
        switch (m) {
            case 12:
            case 1:
            case 2:
                System.out.println("It's winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It's spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It's summer");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It's autumn");
                break;
            default:
                System.out.println("Error Month number!");
                break;
        }
    }
}