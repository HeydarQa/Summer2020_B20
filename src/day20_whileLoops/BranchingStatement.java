package day20_whileLoops;

public class BranchingStatement {
    public static void main(String[] args) {

        char ch='A';


        while(ch<='E'){
            if(ch=='C'){
                ch++;
                continue; // skip everything even iterator
            }

            System.out.println(ch);

        ch++;
        
        }
    }
}
