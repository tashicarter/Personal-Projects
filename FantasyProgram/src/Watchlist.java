import java.io.IOException;
import java.util.ArrayList;

public class Watchlist 
{
    
    public static ArrayList<Player> watchlist = new ArrayList<>();
    
    public static void displayWatchlist() throws IOException
    {
        int pgcounter = 1;
        boolean pgpresent = false;
        
        int sgcounter = 1;
        boolean sgpresent = false;
        
        int sfcounter = 1;
        boolean sfpresent = false;
        
        int pfcounter = 1;
        boolean pfpresent = false;
        
        int ccounter = 1;
        boolean cpresent = false;
        
        IBIO.output("Point Guards");

        IBIO.output("");

        for(int i = 0; i < watchlist.size(); i++)
        {
            if(watchlist.get(i).getPosition().contains("PG"))
            {
                IBIO.output("Player " + pgcounter + ":");
                PlayerManager.printPlayerStatistics(watchlist.get(i));
                pgpresent = true;
                pgcounter++;
                IBIO.output("");
            }
        }
        if(pgpresent == false)
        {
            IBIO.output("No Point Guards have been added to the watchlist");
            IBIO.output("");
        }

        IBIO.output("Shooting Guards");

        IBIO.output("");

        for(int b = 0; b < watchlist.size(); b++)
        {
            if(watchlist.get(b).getPosition().contains("SG"))
            {
                IBIO.output("Player " + sgcounter + ":");
                PlayerManager.printPlayerStatistics(watchlist.get(b));
                sgpresent = true;
                sgcounter++;
                IBIO.output("");
            }
        }
        if(sgpresent == false)
        {
            IBIO.output("No Shooting Guards have been added to the watchlist");
            IBIO.output("");
        }

        IBIO.output("Small Forwards");

        IBIO.output("");

        for(int i = 0; i < watchlist.size(); i++)
        {
            if(watchlist.get(i).getPosition().contains("SF"))
            {
                IBIO.output("Player " + sfcounter + ":");
                PlayerManager.printPlayerStatistics(watchlist.get(i));
                sfpresent = true;
                sfcounter++;
                IBIO.output("");
            }
        }
        if(sfpresent == false)
        {
            IBIO.output("No Small Forwards have been added to the watchlist");
            IBIO.output("");
        }

        IBIO.output("Power Forwards");

        IBIO.output("");

        for(int i = 0; i < watchlist.size(); i++)
        {
            if(watchlist.get(i).getPosition().contains("PF"))
            {
                IBIO.output("Player " + pfcounter + ":");
                PlayerManager.printPlayerStatistics(watchlist.get(i));
                pfpresent = true;
                pfcounter++;
                IBIO.output("");
            }
        }
        if(pfpresent == false)
        {
            IBIO.output("No Power Forwards have been added to the watchlist");
            IBIO.output("");
        }
        
        IBIO.output("Centres");

        IBIO.output("");

        for(int i = 0; i < watchlist.size(); i++)
        {
            if(watchlist.get(i).getPosition().contains("C"))
            {
                IBIO.output("Player " + ccounter + ":");
                PlayerManager.printPlayerStatistics(watchlist.get(i));
                cpresent = true;
                ccounter++;
                IBIO.output("");
            }
        }
        if(cpresent == false)
            {
                IBIO.output("No Centres have been added to the watchlist");
                IBIO.output("");
            }
    }
    
    public static boolean isEmpty()
    {
        return watchlist.isEmpty();
    }
    
    public static void add(Player playerappend)
    {
        watchlist.add(playerappend);
    }
    
    public static void add(String name) throws IOException
    {
        
        boolean found = false;
        for(int i = 0; i < PlayerManager.programPlayerList.size(); i++)
        {
            if(PlayerManager.programPlayerList.get(i).getName().equalsIgnoreCase(name))
            {
                boolean present = false;
                for(int f = 0; f < watchlist.size(); f++)
                {
                    if(PlayerManager.programPlayerList.get(i).getName().equalsIgnoreCase(watchlist.get(f).getName()))
                    {
                        present = true;
                        IBIO.output("The player '" + name.toUpperCase() + "' is already in the watchlist.");
                        IBIO.output("");
                    }
                }
                if(present == false)
                {
                    watchlist.add(PlayerManager.programPlayerList.get(i));
                    IBIO.output(name.toUpperCase() + " has been added to the watchlist");
                    IBIO.output("");
                    found = true;
                }
                return;
            }
        }
        if(found == false)
        {
            IBIO.output("The player '" + name.toUpperCase() + "' was not found.");
            IBIO.output("");
        }
    }
    
    public void remove(String name) throws IOException
    {
        
        for(int i = 0; i < PlayerManager.programPlayerList.size(); i++)
        {
            if(PlayerManager.programPlayerList.get(i).getName().equalsIgnoreCase(name))
            {
                watchlist.remove(PlayerManager.programPlayerList.get(i));
            }
        }
    }
}