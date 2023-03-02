package CIS2206.Unit_12;

//importing
import java.util.*;

/**

 Class representing a football league with a list of teams.
 */
public class FootballLeague {
    // setting attributes
    private final String Footleague_ID;
    private final List<Team> teamlist;

    /**

     Constructor used to initialize a new football league and set its id.
     The team list is initialized as a linked list.
     @param Footleague_ID the id of the football league
     */
    public FootballLeague(String Footleague_ID) {
        this.Footleague_ID = Footleague_ID;
        this.teamlist = new LinkedList<>();
    }
    /**

     Method to print the analysis of a team.
     @return a string representation of the football league and its teams
     */
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append("FootballLeague: ").append(this.Footleague_ID).append("\n");
        int position = 1;
        for (Team team : this.teamlist) {
            output.append("\nRanking ").append(position).append("\n");
            output.append(team);
            position += 1;
        }
        return output.toString();
    }
    /**

     Method to add a team to the league.
     @param toAdd the team to be added
     */
    public void addteam(Team toAdd) {
        this.teamlist.add(toAdd);
    }
    /**

     Method to remove a team from the league by its name.
     @param name the name of the team to be removed
     */
    public void removeTeamByName(String name) {
        for (Team team : this.teamlist) {
            if (team.getName().compareTo(name) == 0) {
                this.teamlist.remove(team);
                return;
            }
        }
    }
    /**

     Method to update the points of the winning and losing teams

     in the league.

     @param winningTeam the team that won the match

     @param losingTeam the team that lost the match
     */
    public void winMatch(Team winningTeam, Team losingTeam) {
        for (Team team : this.teamlist) {
            if (team.getName().compareTo(winningTeam.getName()) == 0) {
                winningTeam.increaseWin();
            }
            if (team.getName().compareTo(losingTeam.getName()) == 0) {
                losingTeam.increaseLosses();
            }
            // CALL SORTING ALGORITHM ON TEAM_LIST

            Collections.sort(teamlist);
        }

    }

    /**

     Method to update the points of the two teams involved in a draw.
     @param one the first team
     @param two the second team
     */
    public void draw(Team one, Team two) {
        for (Team team : this.teamlist) {
            if (team.getName().compareTo(one.getName()) == 0) {
                one.increaseDraws();
            }

            if (team.getName().compareTo(two.getName()) == 0) {
                two.increaseDraws();
            }
            Collections.sort(teamlist);
            //no need for losses because it remains same if the team loss
        }
        // CALL SORTING ALGORITHM ON TEAM_LIST
        Collections.sort(teamlist);

    }

    public void relegation(){



        // TEAM_LIST = [T1, T2, T3, T4, T5]
        for (int i = 3; i > 0; i--){

            
            this.teamlist.remove(this.teamlist.size() - 1);
        }

    }
}
