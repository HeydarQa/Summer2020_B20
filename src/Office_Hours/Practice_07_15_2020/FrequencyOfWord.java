package Office_Hours.Practice_07_15_2020;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str="catcatcat catdog dogDogDog";
        int countCat=0;
        int countDog=0;
        str=str.toLowerCase();


        while (str.contains("cat")){
            countCat++;
            str=str.replaceFirst("cat","");

        }
        while (str.contains("dog")){
            countDog++;
            str=str.replaceFirst("dog","");

        }
        System.out.println(countCat==countDog);
        System.out.println(countCat);
        System.out.println(countDog);
    }
}
