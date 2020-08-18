package day40_CustomClassPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {
        Offer offer1=new Offer();
        Offer offer2=new Offer();
        Offer offer3=new Offer();
        Offer offer4=new Offer();
        Offer offer5=new Offer();
        Offer offer6=new Offer();
        Offer offer7=new Offer();

offer1.setOfferInfo(130000,"VA",true,true,true,"SDET",true);
offer2.setOfferInfo(120000,"NJ",false,true,true,"Senior QA",true);
offer3.setOfferInfo(110000,"NY",true,true,false,"SDET",true);
offer4.setOfferInfo(115000,"VA",true,true,true,"Junior QA",true);
offer5.setOfferInfo(100000,"VA",true,true,true,"SDET",true);
offer6.setOfferInfo(170000,"VA",true,true,true,"SDET",true);
offer7.setOfferInfo(85000,"VA",true,true,true,"QA",true);

        ArrayList<Offer> jobOffers=new ArrayList<>();
        jobOffers.addAll(Arrays.asList(offer1,offer2,offer3,offer4,offer5,offer6,offer7));
        for (Offer eachOffer:jobOffers){
            eachOffer.getOfferInfo();
        }
        System.out.println("=========================================================");
     /*   // less than 120k
        jobOffers.removeIf(p->p.salary<120000);
        System.out.println("Number of offers less than 120k: "+jobOffers.size());

        String myLocation="VA";
        // less than 120K or not from VA area
        jobOffers.removeIf(p->p.salary<120000||!p.state.equalsIgnoreCase("VA"));
        System.out.println("Number of offers: "+jobOffers.size());
*/
        //does not have PTO or does not have benefit or is not full time
        jobOffers.removeIf(p->p.hasPTO==false ||p.hasBenefit==false||p.isFullTime==false);
        System.out.println("Number of offers: "+jobOffers.size());





    }
}
