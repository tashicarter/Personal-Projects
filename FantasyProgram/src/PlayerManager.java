import java.io.IOException;
import java.util.*;

public class PlayerManager
{
    public static ArrayList<Player> programPlayerList = new ArrayList<Player>();
    public static Player placeHolder = new Player();
    
    public static ArrayList<Player> programSortedAscendingPlayerNameList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerAgeList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerGamesPlayedList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerGamesStartedList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerMinutesPlayedList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerFieldGoalsMadeList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerFieldGoalsAttemptedList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerFieldGoalPercentageList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerThreePointersMadeList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerThreePointersAttemptedList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerThreePointPercentageList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerTwoPointersMadeList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerTwoPointersAttemptedList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerTwoPointPercentageList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerEffectiveFieldGoalPercentageList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerFreethrowsMadeList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerFreethrowsAttemptedList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerFreethrowPercentageList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerOffensiveReboundsList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerDefensiveReboundsList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerTotalReboundsList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerAssistsList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerStealsList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerBlocksList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerTurnoversList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerFoulsList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedAscendingPlayerPointsList = new ArrayList<Player>();
    
    public static ArrayList<Player> programSortedDescendingPlayerNameList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerAgeList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerGamesPlayedList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerGamesStartedList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerMinutesPlayedList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerFieldGoalsMadeList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerFieldGoalsAttemptedList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerFieldGoalPercentageList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerThreePointersMadeList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerThreePointersAttemptedList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerThreePointPercentageList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerTwoPointersMadeList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerTwoPointersAttemptedList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerTwoPointPercentageList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerEffectiveFieldGoalPercentageList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerFreethrowsMadeList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerFreethrowsAttemptedList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerFreethrowPercentageList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerOffensiveReboundsList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerDefensiveReboundsList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerTotalReboundsList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerAssistsList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerStealsList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerBlocksList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerTurnoversList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerFoulsList = new ArrayList<Player>();
    public static ArrayList<Player> programSortedDescendingPlayerPointsList = new ArrayList<Player>();
    
    public static void addPlayer(Player insert)
    {
        programPlayerList.add(insert);
    }
    
    public static void printPlayerStatistics(Player stats)
    {
                IBIO.output("Name: " + stats.getName());
                IBIO.output("Age: " + stats.getAge());       
                IBIO.output("Team: " + stats.getTeam());
                IBIO.output("Games Played: " + stats.getGamesPlayed());
                IBIO.output("Games Started: " + stats.getGamesStarted());
                IBIO.output("Minutes Played Per Game: " + stats.getMinutesPlayed());
                IBIO.output("Field Goals Made Per Game: " + stats.getFieldgoalsMadePerGame());
                IBIO.output("Field Goals Attempted Per Game: " + stats.getFieldgoalsAttemptedPerGame());
                IBIO.output("Field Goal Percentage: " + stats.getFieldgoalPercentage());
                IBIO.output("3 Pointers Made Per Game: " + stats.getThreepointersMadePerGame()); 
                IBIO.output("3 Pointers Attempted Per Game: " + stats.getThreepointersAttemptedPerGame()); 
                IBIO.output("3 Point Percentage: " + stats.getThreepointPercentage()); 
                IBIO.output("2 Pointers Made Per Game: " + stats.getTwopointersMadePerGame()); 
                IBIO.output("2 Pointers Attempted Per Game: " + stats.getTwopointersAttemptedPerGame()); 
                IBIO.output("2 Point Percentage: " + stats.getTwopointPercentage()); 
                IBIO.output("Effective Field Goal Percentage: " + stats.getEffectiveFieldgoalPercentage()); 
                IBIO.output("Freethrows Made Per Game: " + stats.getFreethrowsMadePerGame()); 
                IBIO.output("Freethrows Attempted Per Game: " + stats.getFreethrowsAttemptedPerGame()); 
                IBIO.output("Freethrow Percentage: " + stats.getFreethrowPercentage()); 
                IBIO.output("Offensive Rebounds Per Game: " + stats.getOffensiveReboundsPerGame()); 
                IBIO.output("Defensive Rebounds Per Game: " + stats.getDefensiveReboundsPerGame()); 
                IBIO.output("Total Rebounds Per Game: " + stats.getTotalReboundsPerGame()); 
                IBIO.output("Assists Per Game: " + stats.getAssistsPerGame());
                IBIO.output("Steals Per Game: " + stats.getStealsPerGame()); 
                IBIO.output("Blocks Per Game: " + stats.getBlocksPerGame()); 
                IBIO.output("Turnovers Per Game: " + stats.getTurnoversPerGame()); 
                IBIO.output("Personal Fouls Per Game: " + stats.getPersonalFoulsPerGame()); 
                IBIO.output("Points Per Game: " + stats.getPointsPerGame());
    }
    
    public static boolean searchByName(String name) throws IOException
    {
     
        boolean found = false;
        sortByAscendingName();
        
        int left = 0;
        int right = programSortedAscendingPlayerNameList.size() - 1;
        while(left <= right)
        {
            int middle = (int)((left + right) / 2);
            
            if(programSortedAscendingPlayerNameList.get(middle).getName().equalsIgnoreCase(name))
            {
                placeHolder = programSortedAscendingPlayerNameList.get(middle);
                found = true;
            }
            
            if(programSortedAscendingPlayerNameList.get(middle).getName().toUpperCase().compareTo(name.toUpperCase()) < 0)
            {
                left = middle + 1;
            }
            
            else
            {
                right = middle - 1;
            }
        }
        return found;
    }
    
    public static void printNamesSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName());
        }
    }
    
    public static void printAgeSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " Age: " + input.get(i).getAge());
        }
    }
    
    public static void printGamesPlayedSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " G: " + input.get(i).getGamesPlayed());
        }
    }
    
    public static void printGamesStartedSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " GS: " + input.get(i).getGamesStarted());
        }
    }
    
    public static void printMinutesPlayedSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " MP: " + input.get(i).getMinutesPlayed());
        }
    }
    
    public static void printFieldgoalsMadePerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " FG: " + input.get(i).getFieldgoalsMadePerGame());
        }
    }
    
    public static void printFieldgoalsAttemptedPerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " FGA: " + input.get(i).getFieldgoalsAttemptedPerGame());
        }
    }
    
    public static void printFieldgoalPercentageSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " FG%: " + input.get(i).getFieldgoalPercentage());
        }
    }
    
    public static void printThreepointersMadePerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " 3P: " + input.get(i).getThreepointersMadePerGame());
        }
    }
    
    public static void printThreepointersAttemptedPerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " 3PA: " + input.get(i).getThreepointersAttemptedPerGame());
        }
    }
    
    public static void printThreepointPercentageSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " 3P%: " + input.get(i).getThreepointPercentage());
        }
    }
    
    public static void printTwopointersMadePerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " 2P: " + input.get(i).getTwopointersMadePerGame());
        }
    }
    
    public static void printTwopointersAttemptedPerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " 2PA: " + input.get(i).getTwopointersAttemptedPerGame());
        }
    }
    
    public static void printTwopointPercentageSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " 2P%" + input.get(i).getTwopointPercentage());
        }
    }
    
    public static void printEffectiveFieldgoalPercentageSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " eFG%" + input.get(i).getEffectiveFieldgoalPercentage());
        }
    }
    
    public static void printFreethrowsMadePerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " FT: " + input.get(i).getFreethrowsMadePerGame());
        }
    }
    
    public static void printFreethrowsAttemptedPerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " FTA: " + input.get(i).getFreethrowsAttemptedPerGame());
        }
    }
    
    public static void printFreethrowPercentageSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " FT%: " + input.get(i).getFreethrowPercentage());
        }
    }
    
    public static void printOffensiveReboundsPerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " ORB: " + input.get(i).getOffensiveReboundsPerGame());
        }
    }
    
    public static void printDefensiveReboundsPerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " DRB: " + input.get(i).getDefensiveReboundsPerGame());
        }
    }
    
    public static void printTotalReboundsPerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " TRB: " + input.get(i).getTotalReboundsPerGame());
        }
    }
    
    public static void printAssistsPerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " AST: " + input.get(i).getAssistsPerGame());
        }
    }
    
    public static void printStealsPerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " STL: " + input.get(i).getStealsPerGame());
        }
    }
    
    public static void printBlocksPerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " BLK: " + input.get(i).getBlocksPerGame());
        }
    }
    
    public static void printTurnoversPerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " TOV: " + input.get(i).getTurnoversPerGame());
        }
    }
    
    public static void printPersonalFoulsPerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " PF: " + input.get(i).getPersonalFoulsPerGame());
        }
    }
    
    public static void printPointsPerGameSortedList(ArrayList<Player> input)
    {
        for(int i = 0; i < input.size(); i++)
        {
            IBIO.output("Name: " + input.get(i).getName() + " PTS: " + input.get(i).getPointsPerGame());
        }
    }
    
    public static ArrayList<Player> sortByAscendingName()
    {
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerNameList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerNameList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerNameList.size(); j++)
            {
                if(programSortedAscendingPlayerNameList.get(j).getName().compareToIgnoreCase(programSortedAscendingPlayerNameList.get(indexofmin).getName())<0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerNameList, i, indexofmin);
        }
        return programSortedAscendingPlayerNameList;
     }
    
    public static ArrayList<Player> sortByAscendingAge()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerAgeList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerAgeList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerAgeList.size(); j++)
            {
                if(programSortedAscendingPlayerAgeList.get(j).getAge() < programSortedAscendingPlayerAgeList.get(indexofmin).getAge())
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerAgeList, i, indexofmin);
        }
        return programSortedAscendingPlayerAgeList;
     }
    
    public static ArrayList<Player> sortByAscendingGamesPlayed()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerGamesPlayedList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerGamesPlayedList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerGamesPlayedList.size(); j++)
            {
                if(programSortedAscendingPlayerGamesPlayedList.get(j).getGamesPlayed() < programSortedAscendingPlayerGamesPlayedList.get(indexofmin).getGamesPlayed())
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerGamesPlayedList, i, indexofmin);
        }
        return programSortedAscendingPlayerGamesPlayedList;
     }
    
    public static ArrayList<Player> sortByAscendingGamesStarted()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerGamesStartedList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerGamesStartedList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerGamesStartedList.size(); j++)
            {
                if(programSortedAscendingPlayerGamesStartedList.get(j).getGamesStarted() < programSortedAscendingPlayerGamesStartedList.get(indexofmin).getGamesStarted())
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerGamesStartedList, i, indexofmin);
        }
        return programSortedAscendingPlayerGamesStartedList;
     }
    
    public static ArrayList<Player> sortByAscendingMinutesPlayed()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerMinutesPlayedList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerMinutesPlayedList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerMinutesPlayedList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerMinutesPlayedList.get(j).getMinutesPlayed(), programSortedAscendingPlayerMinutesPlayedList.get(indexofmin).getMinutesPlayed()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerMinutesPlayedList, i, indexofmin);
        }
        return programSortedAscendingPlayerMinutesPlayedList;
     }
    
    public static ArrayList<Player> sortByAscendingFieldGoalsMade()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerFieldGoalsMadeList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerFieldGoalsMadeList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerFieldGoalsMadeList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerFieldGoalsMadeList.get(j).getFieldgoalsMadePerGame(), programSortedAscendingPlayerFieldGoalsMadeList.get(indexofmin).getFieldgoalsMadePerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerFieldGoalsMadeList, i, indexofmin);
        }
        return programSortedAscendingPlayerFieldGoalsMadeList;
     }
    
    public static ArrayList<Player> sortByAscendingFieldGoalsAttempted()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerFieldGoalsAttemptedList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerFieldGoalsAttemptedList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerFieldGoalsAttemptedList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerFieldGoalsAttemptedList.get(j).getFieldgoalsAttemptedPerGame(), programSortedAscendingPlayerFieldGoalsAttemptedList.get(indexofmin).getFieldgoalsAttemptedPerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerFieldGoalsAttemptedList, i, indexofmin);
        }
        return programSortedAscendingPlayerFieldGoalsAttemptedList;
     }
    
    public static ArrayList<Player> sortByAscendingFieldGoalPercentage()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerFieldGoalPercentageList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerFieldGoalPercentageList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerFieldGoalPercentageList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerFieldGoalPercentageList.get(j).getFieldgoalPercentage(), programSortedAscendingPlayerFieldGoalPercentageList.get(indexofmin).getFieldgoalPercentage()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerFieldGoalPercentageList, i, indexofmin);
        }
        return programSortedAscendingPlayerFieldGoalPercentageList;
     }
    
    public static ArrayList<Player> sortByAscendingThreePointersMade()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerThreePointersMadeList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerThreePointersMadeList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerThreePointersMadeList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerThreePointersMadeList.get(j).getThreepointersMadePerGame(), programSortedAscendingPlayerThreePointersMadeList.get(indexofmin).getThreepointersMadePerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerThreePointersMadeList, i, indexofmin);
        }
        return programSortedAscendingPlayerThreePointersMadeList;
     }
    
    public static ArrayList<Player> sortByAscendingThreePointersAttempted()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerThreePointersAttemptedList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerThreePointersAttemptedList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerThreePointersAttemptedList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerThreePointersAttemptedList.get(j).getThreepointersAttemptedPerGame(), programSortedAscendingPlayerThreePointersAttemptedList.get(indexofmin).getThreepointersAttemptedPerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerThreePointersAttemptedList, i, indexofmin);
        }
        return programSortedAscendingPlayerThreePointersAttemptedList;
     }
    
    public static ArrayList<Player> sortByAscendingThreePointPercentage()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerThreePointPercentageList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerThreePointPercentageList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerThreePointPercentageList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerThreePointPercentageList.get(j).getThreepointPercentage(), programSortedAscendingPlayerThreePointPercentageList.get(indexofmin).getThreepointPercentage()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerThreePointPercentageList, i, indexofmin);
        }
        return programSortedAscendingPlayerThreePointPercentageList;
     }
    
    public static ArrayList<Player> sortByAscendingTwoPointersMade()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerTwoPointersMadeList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerTwoPointersMadeList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerTwoPointersMadeList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerTwoPointersMadeList.get(j).getTwopointersMadePerGame(), programSortedAscendingPlayerTwoPointersMadeList.get(indexofmin).getTwopointersMadePerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerTwoPointersMadeList, i, indexofmin);
        }
        return programSortedAscendingPlayerTwoPointersMadeList;
     }
    
    public static ArrayList<Player> sortByAscendingTwoPointersAttempted()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerTwoPointersAttemptedList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerTwoPointersAttemptedList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerTwoPointersAttemptedList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerTwoPointersAttemptedList.get(j).getTwopointersAttemptedPerGame(), programSortedAscendingPlayerTwoPointersAttemptedList.get(indexofmin).getTwopointersAttemptedPerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerTwoPointersAttemptedList, i, indexofmin);
        }
        return programSortedAscendingPlayerTwoPointersAttemptedList;
     }
    
    public static ArrayList<Player> sortByAscendingTwoPointPercentage()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerTwoPointPercentageList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerTwoPointPercentageList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerTwoPointPercentageList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerTwoPointPercentageList.get(j).getTwopointPercentage(), programSortedAscendingPlayerTwoPointPercentageList.get(indexofmin).getTwopointPercentage()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerTwoPointPercentageList, i, indexofmin);
        }
        return programSortedAscendingPlayerTwoPointPercentageList;
     }
    
    public static ArrayList<Player> sortByAscendingEffectiveFieldGoalPercentage()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerEffectiveFieldGoalPercentageList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerEffectiveFieldGoalPercentageList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerEffectiveFieldGoalPercentageList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerEffectiveFieldGoalPercentageList.get(j).getEffectiveFieldgoalPercentage(), programSortedAscendingPlayerEffectiveFieldGoalPercentageList.get(indexofmin).getEffectiveFieldgoalPercentage()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerEffectiveFieldGoalPercentageList, i, indexofmin);
        }
        return programSortedAscendingPlayerEffectiveFieldGoalPercentageList;
     }
    
    public static ArrayList<Player> sortByAscendingFreethrowsMade()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerFreethrowsMadeList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerFreethrowsMadeList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerFreethrowsMadeList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerFreethrowsMadeList.get(j).getFreethrowsMadePerGame(), programSortedAscendingPlayerFreethrowsMadeList.get(indexofmin).getFreethrowsMadePerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerFreethrowsMadeList, i, indexofmin);
        }
        return programSortedAscendingPlayerFreethrowsMadeList;
     }
    
    public static ArrayList<Player> sortByAscendingFreethrowsAttempted()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerFreethrowsAttemptedList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerFreethrowsAttemptedList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerFreethrowsAttemptedList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerFreethrowsAttemptedList.get(j).getFreethrowsAttemptedPerGame(), programSortedAscendingPlayerFreethrowsAttemptedList.get(indexofmin).getFreethrowsAttemptedPerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerFreethrowsAttemptedList, i, indexofmin);
        }
        return programSortedAscendingPlayerFreethrowsAttemptedList;
     }
    
    public static ArrayList<Player> sortByAscendingFreethrowPercentage()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerFreethrowPercentageList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerFreethrowPercentageList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerFreethrowPercentageList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerFreethrowPercentageList.get(j).getFreethrowPercentage(), programSortedAscendingPlayerFreethrowPercentageList.get(indexofmin).getFreethrowPercentage()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerFreethrowPercentageList, i, indexofmin);
        }
        return programSortedAscendingPlayerFreethrowPercentageList;
     }
    
    public static ArrayList<Player> sortByAscendingOffensiveRebounds()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerOffensiveReboundsList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerOffensiveReboundsList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerOffensiveReboundsList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerOffensiveReboundsList.get(j).getOffensiveReboundsPerGame(), programSortedAscendingPlayerOffensiveReboundsList.get(indexofmin).getOffensiveReboundsPerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerOffensiveReboundsList, i, indexofmin);
        }
        return programSortedAscendingPlayerOffensiveReboundsList;
     }
    
    public static ArrayList<Player> sortByAscendingDefensiveRebounds()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerDefensiveReboundsList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerDefensiveReboundsList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerDefensiveReboundsList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerDefensiveReboundsList.get(j).getDefensiveReboundsPerGame(), programSortedAscendingPlayerDefensiveReboundsList.get(indexofmin).getDefensiveReboundsPerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerDefensiveReboundsList, i, indexofmin);
        }
        return programSortedAscendingPlayerDefensiveReboundsList;
     }
    
    public static ArrayList<Player> sortByAscendingTotalRebounds()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerTotalReboundsList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerTotalReboundsList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerTotalReboundsList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerTotalReboundsList.get(j).getTotalReboundsPerGame(), programSortedAscendingPlayerTotalReboundsList.get(indexofmin).getTotalReboundsPerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerTotalReboundsList, i, indexofmin);
        }
        return programSortedAscendingPlayerTotalReboundsList;
     }
    
    public static ArrayList<Player> sortByAscendingAssists()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerAssistsList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerAssistsList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerAssistsList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerAssistsList.get(j).getAssistsPerGame(), programSortedAscendingPlayerAssistsList.get(indexofmin).getAssistsPerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerAssistsList, i, indexofmin);
        }
        return programSortedAscendingPlayerAssistsList;
     }
    
    public static ArrayList<Player> sortByAscendingSteals()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerStealsList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerStealsList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerStealsList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerStealsList.get(j).getStealsPerGame(), programSortedAscendingPlayerStealsList.get(indexofmin).getStealsPerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerStealsList, i, indexofmin);
        }
        return programSortedAscendingPlayerStealsList;
     }
    
    public static ArrayList<Player> sortByAscendingBlocks()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerBlocksList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerBlocksList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerBlocksList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerBlocksList.get(j).getBlocksPerGame(), programSortedAscendingPlayerBlocksList.get(indexofmin).getBlocksPerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerBlocksList, i, indexofmin);
        }
        return programSortedAscendingPlayerBlocksList;
     }
    
    public static ArrayList<Player> sortByAscendingTurnovers()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerTurnoversList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerTurnoversList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerTurnoversList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerTurnoversList.get(j).getTurnoversPerGame(), programSortedAscendingPlayerTurnoversList.get(indexofmin).getTurnoversPerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerTurnoversList, i, indexofmin);
        }
        return programSortedAscendingPlayerTurnoversList;
     }
    
    public static ArrayList<Player> sortByAscendingFouls()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerFoulsList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerFoulsList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerFoulsList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerFoulsList.get(j).getPersonalFoulsPerGame(), programSortedAscendingPlayerFoulsList.get(indexofmin).getPersonalFoulsPerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerFoulsList, i, indexofmin);
        }
        return programSortedAscendingPlayerFoulsList;
     }
    
    public static ArrayList<Player> sortByAscendingPoints()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedAscendingPlayerPointsList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedAscendingPlayerPointsList.size()-1; i++)
        {
            int indexofmin = i;
            for(int j = i+1; j < programSortedAscendingPlayerPointsList.size(); j++)
            {
                if(Float.compare(programSortedAscendingPlayerPointsList.get(j).getPointsPerGame(), programSortedAscendingPlayerPointsList.get(indexofmin).getPointsPerGame()) < 0)
                {
                    indexofmin = j;
                }
            }
            Collections.swap(programSortedAscendingPlayerPointsList, i, indexofmin);
        }
        return programSortedAscendingPlayerPointsList;
    }
    
    public static ArrayList<Player> sortByDescendingName()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerNameList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerNameList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerNameList.size(); j++)
            {
                if(programSortedDescendingPlayerNameList.get(j).getName().compareToIgnoreCase(programSortedDescendingPlayerNameList.get(indexofmax).getName())>0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerNameList, i, indexofmax);
        }
        return programSortedDescendingPlayerNameList;
     }
    
    public static ArrayList<Player> sortByDescendingAge()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerAgeList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerAgeList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerAgeList.size(); j++)
            {
                if(programSortedDescendingPlayerAgeList.get(j).getAge() > programSortedDescendingPlayerAgeList.get(indexofmax).getAge())
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerAgeList, i, indexofmax);
        }
        return programSortedDescendingPlayerAgeList;
     }
    
    public static ArrayList<Player> sortByDescendingGamesPlayed()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerGamesPlayedList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerGamesPlayedList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerGamesPlayedList.size(); j++)
            {
                if(programSortedDescendingPlayerGamesPlayedList.get(j).getGamesPlayed() > programSortedDescendingPlayerGamesPlayedList.get(indexofmax).getGamesPlayed())
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerGamesPlayedList, i, indexofmax);
        }
        return programSortedDescendingPlayerGamesPlayedList;
     }
    
    public static ArrayList<Player> sortByDescendingGamesStarted()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerGamesStartedList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerGamesStartedList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerGamesStartedList.size(); j++)
            {
                if(programSortedDescendingPlayerGamesStartedList.get(j).getGamesStarted() > programSortedDescendingPlayerGamesStartedList.get(indexofmax).getGamesStarted())
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerGamesStartedList, i, indexofmax);
        }
        return programSortedDescendingPlayerGamesStartedList;
     }
    
    public static ArrayList<Player> sortByDescendingMinutesPlayed()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerMinutesPlayedList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerMinutesPlayedList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerMinutesPlayedList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerMinutesPlayedList.get(j).getMinutesPlayed(), programSortedDescendingPlayerMinutesPlayedList.get(indexofmax).getMinutesPlayed()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerMinutesPlayedList, i, indexofmax);
        }
        return programSortedDescendingPlayerMinutesPlayedList;
     }
    
    public static ArrayList<Player> sortByDescendingFieldGoalsMade()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerFieldGoalsMadeList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerFieldGoalsMadeList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerFieldGoalsMadeList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerFieldGoalsMadeList.get(j).getFieldgoalsMadePerGame(), programSortedDescendingPlayerFieldGoalsMadeList.get(indexofmax).getFieldgoalsMadePerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerFieldGoalsMadeList, i, indexofmax);
        }
        return programSortedDescendingPlayerFieldGoalsMadeList;
     }
    
    public static ArrayList<Player> sortByDescendingFieldGoalsAttempted()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerFieldGoalsAttemptedList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerFieldGoalsAttemptedList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerFieldGoalsAttemptedList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerFieldGoalsAttemptedList.get(j).getFieldgoalsAttemptedPerGame(), programSortedDescendingPlayerFieldGoalsAttemptedList.get(indexofmax).getFieldgoalsAttemptedPerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerFieldGoalsAttemptedList, i, indexofmax);
        }
        return programSortedDescendingPlayerFieldGoalsAttemptedList;
     }
    
    public static ArrayList<Player> sortByDescendingFieldGoalPercentage()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerFieldGoalPercentageList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerFieldGoalPercentageList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerFieldGoalPercentageList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerFieldGoalPercentageList.get(j).getFieldgoalPercentage(), programSortedDescendingPlayerFieldGoalPercentageList.get(indexofmax).getFieldgoalPercentage()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerFieldGoalPercentageList, i, indexofmax);
        }
        return programSortedDescendingPlayerFieldGoalPercentageList;
     }
    
    public static ArrayList<Player> sortByDescendingThreePointersMade()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerThreePointersMadeList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerThreePointersMadeList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerThreePointersMadeList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerThreePointersMadeList.get(j).getThreepointersMadePerGame(), programSortedDescendingPlayerThreePointersMadeList.get(indexofmax).getThreepointersMadePerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerThreePointersMadeList, i, indexofmax);
        }
        return programSortedDescendingPlayerThreePointersMadeList;
     }
    
    public static ArrayList<Player> sortByDescendingThreePointersAttempted()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerThreePointersAttemptedList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerThreePointersAttemptedList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerThreePointersAttemptedList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerThreePointersAttemptedList.get(j).getThreepointersAttemptedPerGame(), programSortedDescendingPlayerThreePointersAttemptedList.get(indexofmax).getThreepointersAttemptedPerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerThreePointersAttemptedList, i, indexofmax);
        }
        return programSortedDescendingPlayerThreePointersAttemptedList;
     }
    
    public static ArrayList<Player> sortByDescendingThreePointPercentage()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerThreePointPercentageList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerThreePointPercentageList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerThreePointPercentageList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerThreePointPercentageList.get(j).getThreepointPercentage(), programSortedDescendingPlayerThreePointPercentageList.get(indexofmax).getThreepointPercentage()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerThreePointPercentageList, i, indexofmax);
        }
        return programSortedDescendingPlayerThreePointPercentageList;
     }
    
    public static ArrayList<Player> sortByDescendingTwoPointersMade()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerTwoPointersMadeList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerTwoPointersMadeList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerTwoPointersMadeList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerTwoPointersMadeList.get(j).getTwopointersMadePerGame(), programSortedDescendingPlayerTwoPointersMadeList.get(indexofmax).getTwopointersMadePerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerTwoPointersMadeList, i, indexofmax);
        }
        return programSortedDescendingPlayerTwoPointersMadeList;
     }
    
    public static ArrayList<Player> sortByDescendingTwoPointersAttempted()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerTwoPointersAttemptedList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerTwoPointersAttemptedList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerTwoPointersAttemptedList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerTwoPointersAttemptedList.get(j).getTwopointersAttemptedPerGame(), programSortedDescendingPlayerTwoPointersAttemptedList.get(indexofmax).getTwopointersAttemptedPerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerTwoPointersAttemptedList, i, indexofmax);
        }
        return programSortedDescendingPlayerTwoPointersAttemptedList;
     }
    
    public static ArrayList<Player> sortByDescendingTwoPointPercentage()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerTwoPointPercentageList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerTwoPointPercentageList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerTwoPointPercentageList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerTwoPointPercentageList.get(j).getTwopointPercentage(), programSortedDescendingPlayerTwoPointPercentageList.get(indexofmax).getTwopointPercentage()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerTwoPointPercentageList, i, indexofmax);
        }
        return programSortedDescendingPlayerTwoPointPercentageList;
     }
    
    public static ArrayList<Player> sortByDescendingEffectiveFieldGoalPercentage()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerEffectiveFieldGoalPercentageList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerEffectiveFieldGoalPercentageList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerEffectiveFieldGoalPercentageList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerEffectiveFieldGoalPercentageList.get(j).getEffectiveFieldgoalPercentage(), programSortedDescendingPlayerEffectiveFieldGoalPercentageList.get(indexofmax).getEffectiveFieldgoalPercentage()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerEffectiveFieldGoalPercentageList, i, indexofmax);
        }
        return programSortedDescendingPlayerEffectiveFieldGoalPercentageList;
     }
    
    public static ArrayList<Player> sortByDescendingFreethrowsMade()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerFreethrowsMadeList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerFreethrowsMadeList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerFreethrowsMadeList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerFreethrowsMadeList.get(j).getFreethrowsMadePerGame(), programSortedDescendingPlayerFreethrowsMadeList.get(indexofmax).getFreethrowsMadePerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerFreethrowsMadeList, i, indexofmax);
        }
        return programSortedDescendingPlayerFreethrowsMadeList;
     }
    
    public static ArrayList<Player> sortByDescendingFreethrowsAttempted()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerFreethrowsAttemptedList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerFreethrowsAttemptedList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerFreethrowsAttemptedList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerFreethrowsAttemptedList.get(j).getFreethrowsAttemptedPerGame(), programSortedDescendingPlayerFreethrowsAttemptedList.get(indexofmax).getFreethrowsAttemptedPerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerFreethrowsAttemptedList, i, indexofmax);
        }
        return programSortedDescendingPlayerFreethrowsAttemptedList;
     }
    
    public static ArrayList<Player> sortByDescendingFreethrowPercentage()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerFreethrowPercentageList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerFreethrowPercentageList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerFreethrowPercentageList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerFreethrowPercentageList.get(j).getFreethrowPercentage(), programSortedDescendingPlayerFreethrowPercentageList.get(indexofmax).getFreethrowPercentage()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerFreethrowPercentageList, i, indexofmax);
        }
        return programSortedDescendingPlayerFreethrowPercentageList;
     }
    
    public static ArrayList<Player> sortByDescendingOffensiveRebounds()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerOffensiveReboundsList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerOffensiveReboundsList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerOffensiveReboundsList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerOffensiveReboundsList.get(j).getOffensiveReboundsPerGame(), programSortedDescendingPlayerOffensiveReboundsList.get(indexofmax).getOffensiveReboundsPerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerOffensiveReboundsList, i, indexofmax);
        }
        return programSortedDescendingPlayerOffensiveReboundsList;
     }
    
    public static ArrayList<Player> sortByDescendingDefensiveRebounds()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerDefensiveReboundsList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerDefensiveReboundsList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerDefensiveReboundsList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerDefensiveReboundsList.get(j).getDefensiveReboundsPerGame(), programSortedDescendingPlayerDefensiveReboundsList.get(indexofmax).getDefensiveReboundsPerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerDefensiveReboundsList, i, indexofmax);
        }
        return programSortedDescendingPlayerDefensiveReboundsList;
     }
    
    public static ArrayList<Player> sortByDescendingTotalRebounds()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerTotalReboundsList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerTotalReboundsList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerTotalReboundsList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerTotalReboundsList.get(j).getTotalReboundsPerGame(), programSortedDescendingPlayerTotalReboundsList.get(indexofmax).getTotalReboundsPerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerTotalReboundsList, i, indexofmax);
        }
        return programSortedDescendingPlayerTotalReboundsList;
     }
    
    public static ArrayList<Player> sortByDescendingAssists()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerAssistsList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerAssistsList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerAssistsList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerAssistsList.get(j).getAssistsPerGame(), programSortedDescendingPlayerAssistsList.get(indexofmax).getAssistsPerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerAssistsList, i, indexofmax);
        }
        return programSortedDescendingPlayerAssistsList;
     }
    
    public static ArrayList<Player> sortByDescendingSteals()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerStealsList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerStealsList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerStealsList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerStealsList.get(j).getStealsPerGame(), programSortedDescendingPlayerStealsList.get(indexofmax).getStealsPerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerStealsList, i, indexofmax);
        }
        return programSortedDescendingPlayerStealsList;
     }
    
    public static ArrayList<Player> sortByDescendingBlocks()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerBlocksList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerBlocksList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerBlocksList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerBlocksList.get(j).getBlocksPerGame(), programSortedDescendingPlayerBlocksList.get(indexofmax).getBlocksPerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerBlocksList, i, indexofmax);
        }
        return programSortedDescendingPlayerBlocksList;
     }
    
    public static ArrayList<Player> sortByDescendingTurnovers()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerTurnoversList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerTurnoversList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerTurnoversList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerTurnoversList.get(j).getTurnoversPerGame(), programSortedDescendingPlayerTurnoversList.get(indexofmax).getTurnoversPerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerTurnoversList, i, indexofmax);
        }
        return programSortedDescendingPlayerTurnoversList;
     }
    
    public static ArrayList<Player> sortByDescendingFouls()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerFoulsList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerFoulsList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerFoulsList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerFoulsList.get(j).getPersonalFoulsPerGame(), programSortedDescendingPlayerFoulsList.get(indexofmax).getPersonalFoulsPerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerFoulsList, i, indexofmax);
        }
        return programSortedDescendingPlayerFoulsList;
     }
    
    public static ArrayList<Player> sortByDescendingPoints()
    {   
        programSortedAscendingPlayerNameList.clear();
        for(int i = 0; i < programPlayerList.size(); i++)
        {
            programSortedDescendingPlayerPointsList.add(programPlayerList.get(i));
        }
        
        for(int i = 0; i < programSortedDescendingPlayerPointsList.size()-1; i++)
        {
            int indexofmax = i;
            for(int j = i+1; j < programSortedDescendingPlayerPointsList.size(); j++)
            {
                if(Float.compare(programSortedDescendingPlayerPointsList.get(j).getPointsPerGame(), programSortedDescendingPlayerPointsList.get(indexofmax).getPointsPerGame()) > 0)
                {
                    indexofmax = j;
                }
            }
            Collections.swap(programSortedDescendingPlayerPointsList, i, indexofmax);
        }
        return programSortedDescendingPlayerPointsList;
    }
}