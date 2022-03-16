import java.util.ArrayList;

public class Team 
{
    private String name;
    private String conference;
    
    public static ArrayList<Player> team = new ArrayList<>();
    
    public Team(){}
    
    public void setName(String setname)
    {
        this.name = setname;
    }
    
    public void setConference(String conference)
    {
        this.conference = conference;
    }
    
    public String getName() 
    {
        return this.name;
    }
    
    public String getConference()
    {
        return this.conference;
    }
    
    public boolean isEmpty()
    {
        return team.isEmpty();
    }
    
    public void addPlayer(Player newPlayer)
    {
        team.add(newPlayer);
    }
    
    public void displayTeamPlayerStatistics()
    {
        IBIO.output(getName() + " is a team from the " + getConference());
        IBIO.output("");
        for(int i = 0; i < team.size(); i++)
        {
            PlayerManager.printPlayerStatistics(team.get(i));
            IBIO.output("");
        }
    }
}