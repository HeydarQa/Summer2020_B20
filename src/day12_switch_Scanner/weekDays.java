package day12_switch_Scanner;

public class weekDays {
    public static void main(String[] args) {

        int num = 4;
        String result = "";

        switch(num) {
            case 1:
                result = "Monday";
                break;

            case 2:
                result = "Tuesday";
                break;

            case 3:
                result = "Wednesday";
                break;

            case 4:
                result = "Thursday";
                break;

            case 5:
                result = "Friday";
                break;

            case 6:
                result = "Saturday";
                break;

            case 7:
                result = "Sunday";
                break;

            default:
                result = "Invalid";

        }
        System.out.println(result);
    }

}
