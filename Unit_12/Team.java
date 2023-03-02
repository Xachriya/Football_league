package CIS2206.Unit_12;

/**
 * Class representing a team in a sports league. The team has a name, and track record of wins, losses, and draws.
 * The team also has a total number of points, which is calculated based on the number of wins and draws.
 */
public class Team implements Comparable<Team> {

    // Fields for storing team data
    private final String name;
    private int wins;
    private int draws;
    private Integer losses;
    private  Integer points;

    /**
     * Constructs a new Team with the given name. Initializes the number of wins, losses, draws, and points to 0.
     * @param name The name of the team.
     */
    public Team(String name) {
        this.name = name;
        this.wins = 0;
        this.losses = 0;
        this.draws = 0;
        this.points = 0;
    }

    /**
     * Returns a string representation of the team, including its name, number of wins, losses, draws, and points.
     */
    public String toString(){
        String output = "";
        output += "Team{\n";
        output += "\tName: " + this.name + "\n";
        output += "\tWins: " + this.wins + "\n";
        output += "\tDraw: " + this.draws + "\n";
        output += "\tLoss: " + this.losses + "\n";
        output += "\tPoints: " + this.points + "\n";
        output += "}\n";
        return output;
    }

    /**
     * Returns the name of the team.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Increments the number of wins for the team by 1 and adds 3 points to the team's total points.
     */
    public void increaseWin(){
        wins+=1;
        points+=3;
    }

    /**
     * Increments the number of losses for the team by 1.
     */
    public void increaseLosses(){
        this.losses+=1;
    }

    /**
     * Increments the number of draws for the team by 1 and adds 1 point to the team's total points.
     */
    public void increaseDraws(){
        draws+=1;
        points+=1;
    }

    /**
     * Compares this team to another team based on their total points.
     * @param o The other team to compare to.
     * @return a negative integer, zero, or a positive integer as this team's points are greater than, equal to, or less than the other team's points.
     */
    @Override
    public int compareTo(Team o) {
        return -this.points.compareTo(o.points);
    }

}