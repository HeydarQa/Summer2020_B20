package day11_Nestedif_Switch;
/*
90~100=>A
80~90=>B
 */
public class NestedIf {
    public static void main(String[] args) {
        int score =100;
        String result="";

        if (score>=0&&score<=100){  // valid score
            if(score>=90){
                result="A";
            }else if (score>=80){
                result="B";
            }else if (score>=70){
                result="C";
            }else if (score>=60){
                result="D";
            }else {
                result="F";
            }
        }else{   // invalid score
          result="Invalid";
        }
        System.out.println(result);
        System.out.println("--------------------------------------");

        /*

         */
        int x=10;
        //String result1=(x>=5)? x:(x<5)



    }
}
