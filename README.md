# Football_league
its an implementation of linked list in java there is many teams which will take place in football league using linked list we will store different teams in league and apply different operations
Implemented classes Team, FootballLeague, and Dashboard that provide the following functionality:
	Class Team:
	Stores team’s name, number of wins, draws and losses, as well as the number of points (points are recalculated every time the number of wins, draws and losses is updated). Note: A team is awarded 3 points for every win, 1 point for every draw and 0 points for every loss
	Creates a human friendly representation of the class (i.e. toString())
	Allows a total ordering of teams (i.e. teams are Comparable)
	Class FootballLeague:
	Stores a list of Teams included in the league (while maintaining the list in descending order based on Teams’ points)
	Teams can be inserted (adding a new team) and removed (deleting an existing team) at any point
	Team’s position in the league can be updated by updating team’s wins, draws and losses (changes to points must be reflected in the ordering of the list)
	Teams can be relegated at the end of the season (i.e. the 3 teams with the least amount of points)
	The league table (i.e. list of Teams) should be printed after every change takes place
	Class Dashboard:
	Creates a football league instance and subsequently inserts, updates, removes and relegates teams 
Discuss your progress with your Tutor during practical sessions.


What to include in your Portfolio:
	Report: Describing in my report which parts of Activity 1 have been successfully implemented.
 A linked list is a data structure that consists of a sequence of elements, each of which contains an item of data and a reference (or "link") to the next element in the list. The first element of a linked list is called the head, and the last element is called the tail.
One of the key advantages of linked lists is that they allow for efficient insertions and deletions, as elements can be added or removed from the list without the need to move or copy other elements. This contrasts with arrays, which require all elements to be shifted over to make space for new elements or fill the gap left by deleted elements.
Another advantage of linked lists is that they do not have a fixed size and can expand or shrink as needed. This makes them more suitable for dynamic data structures where the number of elements is not known in advance or may change frequently.
There are two main types of linked lists: singly linked lists and doubly linked lists. A singly linked list contains a link to the next element only, while a doubly linked list also contains a link to the previous element. Doubly linked lists allow for efficient traversal in both directions, while singly linked lists can only be traversed in one direction (from head to tail).
Implementation (class Team):
                                                   This is a class called Team which represents a team in a football_league. It has a name, as well as fields to track the number of wins, losses, and draws the team has. The class also has a total number of points which is calculated based on the number of wins and draws. The class also implements the Comparable interface, which allows objects of the class to be compared based on the compareTo() method, which in this case compares the teams based on the number of points they have.

This class also has a constructor that initializes the name and all the fields of number wins, draws and losses to 0, and increase methods to increment those fields by 1. The toString method gives all the information in a readable format.It has a nice design, though depending on your use case, you might want to consider adding methods to get the values of the fields rather than making them public. This would allow you to make changes to the internal representation of the class without changing any code that uses the class.
public Team(String name): This is the constructor for the Team class. It takes in a single parameter, a String called name, which is used to initialize the name field of the class. It also initializes the number of wins, losses, draws, and points to 0.
public String toString(): This method returns a String representation of the team, including its name, number of wins, losses, draws, and points. It is used to provide a human-readable representation of the object, and is often used for debugging and logging purposes.
public String getName(): This method returns the name of the team.
public void increaseWin(): This method increments the number of wins for the team by 1 and adds 3 points to the team's total points.
public void increaseLosses(): This method increments the number of losses for the team by 1.
public void increaseDraws(): This method increments the number of draws for the team by 1 and adds 1 point to the team's total points.
public int compareTo(Team o): This method compares this team to another team based on their total points. The method takes in a single parameter, Team o, which represents the other team to compare to. It returns a negative integer, zero, or a positive integer as this team's points are greater than, equal to, or less than the other team's points. The compareTo method here is overridden from the comparable interface and has a negative sign before it to sort it in descending order.
Implementation (class FootballLeague):
                                                   This is a class called FootballLeague which represents a football league with a list of teams. It has an attribute Footleague_ID which is an identifier for the league and a list of Team objects called teamlist.
public FootballLeague(String Footleague_ID): This is the constructor for the FootballLeague class. It takes in a single parameter, a String called Footleague_ID, which is used to initialize the Footleague_ID attribute of the class. It also initializes the teamlist as a linked list.
public String toString(): This method returns a String representation of the league, including the league ID and a ranking of the teams in the league. It loops through the teamlist to get a string representation of each team.
public void addteam(Team toAdd): This method takes in a single parameter, a Team called toAdd, and adds it to the teamlist.
public void removeTeamByName(String name): This method takes in a single parameter, a String called name, and removes the team with that name from the teamlist.
public void winMatch(Team winningTeam, Team losingTeam): This method takes in two parameters, Team winningTeam and Team losingTeam, and updates the points of the winning and losing teams in the league by calling increaseWin() on the winning team and increaseLosses() on the losing team. It also calls the Collections.sort(teamlist) method to sort the teamlist based on the teams' total points in descending order.
public void draw(Team one, Team two): This method takes in two parameters, Team one and Team two, and updates the points of the teams involved in a draw by calling increaseDraws() on both teams. It also calls the Collections.sort(teamlist) method to sort the teamlist based on the teams' total points in descending order.
public void relegation(): This method removes the last three teams in the teamlist for the purpose of Relegation process.
Implementation (class Dashboard):
                                                          This is the Dashboard class, which is a simple program that demonstrates the functionality of the Team and FootballLeague classes.

In the main method, it creates several Team objects and assigns them names. Then it creates a new FootballLeague object called fl and assigns it an ID "Series A". It adds teams to the league using the addteam() method.

Then it simulates matches with the winMatch() and draw() methods to update the points of the teams in the league.

After that, it calls the removeTeamByName("Al-Nasar") method, which will remove team Al-Nasar from the league, then it calls the relegation() method to remove the last three teams in the teamlist for the purpose of Relegation process.

It also prints out the league using the toString() method of the FootballLeague class.
