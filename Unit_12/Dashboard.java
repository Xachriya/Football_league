package CIS2206.Unit_12;

public class Dashboard {
//adding teams
        public static void main(String[] args) {
            Team t1=new Team("Liverpool");
            Team t2= new Team("Manchester United");
            Team t3= new Team("Manchester city");

            Team t4 = new Team("leeds united");
            Team t5 = new Team("Arsenal");
            Team t6 = new Team("chelsea");
            Team t7 = new Team("Al-Nasar");

            // Creating a football league
            FootballLeague fl = new FootballLeague("Series A");
            // Adding teams to the league
            fl.addteam(t1);
            fl.addteam(t2);
            fl.addteam(t3);
            fl.addteam(t4);
            fl.addteam(t5);
            fl.addteam(t6);
            fl.addteam(t7);

            // Matches and their outcomes
            fl.winMatch(t2, t1);
            fl.winMatch(t2, t1);
            fl.winMatch(t2, t1);
            fl.draw(t3, t6);
            fl.winMatch(t4, t5);
            fl.winMatch(t3, t1);
            fl.winMatch(t4, t6);
            fl.winMatch(t5, t2);
            fl.winMatch(t6, t5);
            fl.winMatch(t1, t4);
            fl.winMatch(t2, t6);
            fl.draw(t1, t2);
            fl.winMatch(t6, t5);

            // Displaying league before removing team
            System.out.println(fl);
            System.out.println("After removing one team");
            fl.removeTeamByName("Al-Nasar");
            System.out.println(fl);


            fl.relegation();
            System.out.println("\nLeague After Relegation");
            System.out.println(fl);



        }
    }

