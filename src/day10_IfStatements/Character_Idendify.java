package day10_IfStatements;

public class Character_Idendify {
    public static void main(String[] args) {
        char character ='@';
         boolean isAlphabetic= (character>=65&& character<=90)||(character>=98&& character<=122);
         boolean isDigit=(character>=48&& character<=57);
         boolean special=!isAlphabetic&&!isDigit;

         String specialCharacter="";
         String digit="";
        String alphabet="";

         if (isAlphabetic){
             //System.out.println(character+" is Alphabetic character");
             alphabet=character+" is Alphabetic character";
         }else{
             //System.out.println(character+ " is not Alphabetic character");
             alphabet=character+ " is not Alphabetic character";
         }
        System.out.println(alphabet);
        if (isDigit) {
            digit=character+" is a digit";
        }else {
            digit=character+" is not digit";
        }
        System.out.println(digit);
        if (special){
            specialCharacter=character+ " is special charecter";
        }else{ specialCharacter=character+" is not charecter";
        }

        System.out.println(specialCharacter);
    }
}
