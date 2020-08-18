package day42_Static;

public class CapitalOne {
    public static void main(String[] args) {

        Tester[] testers={new Tester(), new Tester(), new Tester()};
        testers[0].setInfo("Kalbinur",  'F', 15333L, "Tester", 210000);
        testers[1].setInfo("Alia",  'F', 153633L, "Tester", 150000);
        testers[2].setInfo("Naz",  'F', 153433L, "Tester", 110000);

        Developer[] developers={new Developer(),new Developer(), new Developer(),new Developer(),new Developer()};
        developers[0].setInfo("waqar",'M',2111L,"Dev Lead",115000);
        developers[1].setInfo("Ramazan",'M',3111L,"Dev Lead",115000);
        developers[2].setInfo("Ernis",'M',21151L,"Dev Lead",115000);
        developers[3].setInfo("Ali",'M',21L,"Dev Lead",115000);
        developers[4].setInfo("Arpat",'M',211L,"Dev Lead",115000);

        System.out.println(testers[0]);
        ScrumTeam team1=new ScrumTeam();
        team1.setInfo("Ceren","Anna","Lisa");
        team1.addTester(testers);
        team1.addDeveloper(developers);

        System.out.println(team1);
        System.out.println("**************************************************");

        for (Tester each:team1.testers){
            System.out.println(each.name+" : $"+each.salary);
        }
        System.out.println("----------------------------------------------------");
        for (Developer each:team1.developers){
            System.out.println(each.name+" :$"+each.salary);
        }
        System.out.println("===========================================");
        team1.removeTester(15333L);
        team1.removeDeveloper(2111L);
        team1.removeDeveloper(3111L);
        System.out.println(team1);
        System.out.println("------------------------------------");
        Developer dev1=new Developer();
        dev1.setInfo("Luisa",'f',1254L,"Dev Lead",500000);

        team1.addDeveloper(dev1);
        System.out.println(team1);



        ScrumTeam[] scrumTeams={team1,new ScrumTeam(), new ScrumTeam()};


    }
}
