package Office_Hours.Practice_07_14_2020;

public class UniquesWords {
    public static void main(String[] args) {

        String[] words={"Java","C#","Python","Python","C#"};

        for (int j=0;j<=words.length-1;j++) {

        String s = words[j];
        int count = 0;
        for (String a : words) {
            if (a.equals(s)) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println(s);
    }
}

    }
}
