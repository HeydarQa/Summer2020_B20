package Office_Hours.Practice_07_28_2020;

public class Replit {
    public static void main(String[] args) {

        String txt = extractNum("ae3f@4");
        System.out.println(extractNum(txt));
    }


    public static String extractNum(String s) {
        String result = "";
        for (int i = 0; i <= s.length() - 1; i++) {
            if (s.charAt(i) > 47 && s.charAt(i) < 58) {
                result += s.charAt(i);
            }


        }
        return result;
    }
}