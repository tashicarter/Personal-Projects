import java.io.IOException;

public class FantasyProgram
{
    public static void main(String[] args) throws IOException
    {
        IBIO.output("NBA Fantasy Program Companion App");
        IBIO.output("");
        boolean firstmenu = true;
        while(firstmenu)
        {
            IBIO.output("Would you like to download the latest database of player statistics?");
            IBIO.output("Note that you MUST have run the program before if you would not like to download the latest database.");
            IBIO.output("Y: Yes");
            IBIO.output("N: No");
            IBIO.output("Q: Quit");
            char webscrapeoption;
            webscrapeoption = IBIO.inputChar("Enter your choice: ");
            webscrapeoption = Character.toUpperCase(webscrapeoption);
            IBIO.output("");
            switch(webscrapeoption)
            {
                case('Y'):
                    IBIO.output("* Downloading and saving CSV now *");
                    IBIO.output("");
                    try
                    {
                        WebScraper.webScrape();
                    }
                    catch(Exception e)
                    {
                        System.out.println("Error: Internet connection REQUIRED. Exiting program.");
                        IBIO.output("");
                        System.exit(1);
                    }
                    WebScraper.save();
                    Loader.load();
                    firstmenu = false;
                break;

                case('N'):
                    try
                    {
                        Loader.load();
                        firstmenu = false;
                    }
                    catch(Exception e)
                    {
                        IBIO.output("Error: 'PlayerList.csv' could not be found.");
                        IBIO.output("Please download the latest database of player statistics and try again.");
                        IBIO.output("");
                        System.exit(1);
                    }
                break;

                case('Q'):
                    firstmenu = false;
                    System.exit(0);
                break;

                default:
                    IBIO.output("Invalid input.");
                    IBIO.output("");
                break;
            }
        }
        
        char option;
        boolean run = true;
        while (run)
        {
            IBIO.output("A: Search Player Statistics By Team");
            IBIO.output("B: Search Player Statistics By Name");
            IBIO.output("C: Sort Players By Statistic");
            IBIO.output("D: View Glossary Of Statistics");
            IBIO.output("E: View Watchlist");
            IBIO.output("F: Add Player By Name To Watchlist");
            IBIO.output("G: Remove Player From Watchlist By Name");
            IBIO.output("Q: Quit");
            option = IBIO.inputChar("Enter your choice: ");
            option = Character.toUpperCase(option);
            IBIO.output("");
            switch(option)
            {
                case('A'):
                    boolean found6 = false;
                    boolean run64 = true;
                    while(run64)
                    {
                        IBIO.output("ATL: Atlanta Hawks,         BOS: Boston Celtics");
                        IBIO.output("BRK: Brooklyn Nets,         CHI: Chicago Bulls");
                        IBIO.output("CHO: Charlotte Hornets,     CLE: Cleveland Cavaliers");
                        IBIO.output("DAL: Dallas Mavericks,      DEN: Denver Nuggets");
                        IBIO.output("DET: Detroit Pistons,       GSW: Golden State Warriors");
                        IBIO.output("HOU: Houston Rockets,       IND: Indiana Pacers");
                        IBIO.output("LAC: Los Angeles Clippers,  LAL: Los Angeles Lakers");
                        IBIO.output("MEM: Memphis Grizzlies,     MIA: Miami Heat");
                        IBIO.output("MIL: Milwaukee Bucks,       MIN: Minnesota Timberwolves");
                        IBIO.output("NOP: New Orleans Pelicans,  NYK: New York Knicks ");
                        IBIO.output("OKC: Oklahoma City Thunder, ORL: Orlando Magic");
                        IBIO.output("PHI: Philadelphia 76ers,    PHO: Phoenix Suns");
                        IBIO.output("POR: Portland Trailblazers, SAC: Sacramento Kings");
                        IBIO.output("SAS: San Antonio Spurs,     TOR: Toronto Raptors");
                        IBIO.output("TOT: Multiple Teams,        UTA: Utah Jazz");
                        IBIO.output("WAS: Washington Wizards,      B: Back");
                        IBIO.output("  Q: Quit");
                        IBIO.output("");
                        String input6 = IBIO.input("Enter the shortened name of the team (e.g 'MIA' for Miami Heat): ");
                        IBIO.output("");
                        if(input6.equals(""))
                        {
                            IBIO.output("Invalid Input");
                            IBIO.output("");
                            run64 = false;
                            break;
                        }
                        if(input6.equalsIgnoreCase("B"))
                        {
                            break;
                        }
                        if(input6.equalsIgnoreCase("Q"))
                        {
                            run64 = false;
                            run = false;
                            break;
                        }
                        for(int i = 0; i < TeamManager.programTeamList.length; i++)
                        {
                            if(TeamManager.programTeamList[i].getName().equalsIgnoreCase(input6))
                            {
                                TeamManager.programTeamList[i].displayTeamPlayerStatistics();
                                found6 = true;
                            }
                        }
                        if(found6 == false)
                        {
                            IBIO.output("The team '" + input6.toUpperCase() + "' was not found. Please make sure that you input the shortened name "
                                    + "e.g 'BOS' when attempting to search for Boston Celtics");
                            IBIO.output("");
                        }
                    }
                break;

                case('B'):
                    String input3 = IBIO.input("Enter the name of the player: ");
                    IBIO.output("");
                    if(input3.equals(""))
                    {
                        IBIO.output("Invalid Input");
                        IBIO.output("");
                        break;
                    }
                    if(PlayerManager.searchByName(input3) == false)
                    {
                        IBIO.output(input3.toUpperCase() + " could not be found");
                        IBIO.output("");
                        break;
                    }
                    if(PlayerManager.searchByName(input3) == true)
                    {
                        PlayerManager.searchByName(input3);
                        PlayerManager.printPlayerStatistics(PlayerManager.placeHolder);
                        IBIO.output("");
                    }
                break;

                case('C'):
                    char input69;
                    boolean run69 = true;
                    while(run69)
                    {
                        IBIO.output("A: Display Players By Ascending Order Of Statistic");
                        IBIO.output("B: Display Players By Descending Order Of Statistic");
                        IBIO.output("C: Back");
                        IBIO.output("Q: Quit");
                        IBIO.output("");
                        input69 = IBIO.inputChar("Enter your choice: ");
                        IBIO.output("");
                        input69 = Character.toUpperCase(input69);
                        switch(input69)
                        {
                            case('A'):
                                int input70;
                                boolean run70 = true;
                                while(run70)
                                {
                                    IBIO.output("Display Players In Ascending Order Of: ");
                                    IBIO.output(" 1: Name,                             2: Age");
                                    IBIO.output(" 3: Games Played,                     4: Games Started");
                                    IBIO.output(" 5: Minutes Played,                   6: Field Goals Made Per Game");
                                    IBIO.output(" 7: Field Goals Attempted Per Game,   8: Field Goal Percentage");
                                    IBIO.output(" 9: Three Pointers Made Per Game,    10: Three Pointers Attempted Per Game");
                                    IBIO.output("11: Three Point Percentage,          12: Two Pointers Made Per Game");
                                    IBIO.output("13: Two Pointers Attempted Per Game, 14: Two Point Percentage");
                                    IBIO.output("15: Effective Field Goal Percentage, 16: Free Throws Made Per Game");
                                    IBIO.output("17: Free Throws Attempted Per Game,  18: Free Throw Percentage");
                                    IBIO.output("19: Offensive Rebounds Per Game,     20: Defensive Rebounds Per Game");
                                    IBIO.output("21: Total Rebounds Per Game,         22: Assists Per Game");
                                    IBIO.output("23: Steals Per Game,                 24: Blocks Per Game");
                                    IBIO.output("25: Turnovers Per Game,              26: Personal Fouls Per Game");
                                    IBIO.output("27: Points Per Game,                 28: Back ");
                                    IBIO.output("29: Quit");
                                    input70 = IBIO.inputInt("Enter your choice: ");
                                    IBIO.output("");
                                    switch(input70)
                                    {
                                        case(1):
                                            PlayerManager.printNamesSortedList(PlayerManager.sortByAscendingName());
                                            IBIO.output("");
                                        break;
                                        
                                        case(2):
                                            PlayerManager.printAgeSortedList(PlayerManager.sortByAscendingAge());
                                            IBIO.output("");
                                        break;
                                        
                                        case(3):
                                            PlayerManager.printGamesPlayedSortedList(PlayerManager.sortByAscendingGamesPlayed());
                                            IBIO.output("");
                                        break;
                                        
                                        case(4):
                                            PlayerManager.printGamesStartedSortedList(PlayerManager.sortByAscendingGamesStarted());
                                            IBIO.output("");
                                        break;
                                        
                                        case(5):
                                            PlayerManager.printMinutesPlayedSortedList(PlayerManager.sortByAscendingMinutesPlayed());
                                            IBIO.output("");
                                        break;
                                        
                                        case(6):
                                            PlayerManager.printFieldgoalsMadePerGameSortedList(PlayerManager.sortByAscendingFieldGoalsMade());
                                            IBIO.output("");
                                        break;
                                        
                                        case(7):
                                            PlayerManager.printFieldgoalsAttemptedPerGameSortedList(PlayerManager.sortByAscendingFieldGoalsAttempted());
                                            IBIO.output("");
                                        break;
                                        
                                        case(8):
                                            PlayerManager.printFieldgoalPercentageSortedList(PlayerManager.sortByAscendingFieldGoalPercentage());
                                            IBIO.output("");
                                        break;
                                        
                                        case(9):
                                            PlayerManager.printThreepointersMadePerGameSortedList(PlayerManager.sortByAscendingThreePointersMade());
                                            IBIO.output("");
                                        break;
                                        
                                        case(10):
                                            PlayerManager.printThreepointersAttemptedPerGameSortedList(PlayerManager.sortByAscendingThreePointersAttempted());
                                            IBIO.output("");
                                        break;
                                        
                                        case(11):
                                            PlayerManager.printThreepointPercentageSortedList(PlayerManager.sortByAscendingThreePointPercentage());
                                            IBIO.output("");
                                        break;
                                        
                                        case(12):
                                            PlayerManager.printTwopointersMadePerGameSortedList(PlayerManager.sortByAscendingTwoPointersMade());
                                            IBIO.output("");
                                        break;
                                        
                                        case(13):
                                            PlayerManager.printTwopointersAttemptedPerGameSortedList(PlayerManager.sortByAscendingTwoPointersAttempted());
                                            IBIO.output("");
                                        break;
                                        
                                        case(14):
                                            PlayerManager.printTwopointPercentageSortedList(PlayerManager.sortByAscendingTwoPointPercentage());
                                            IBIO.output("");
                                        break;
                                        
                                        case(15):
                                            PlayerManager.printEffectiveFieldgoalPercentageSortedList(PlayerManager.sortByAscendingEffectiveFieldGoalPercentage());
                                            IBIO.output("");
                                        break;
                                        
                                        case(16):
                                            PlayerManager.printFreethrowsMadePerGameSortedList(PlayerManager.sortByAscendingFreethrowsMade());
                                            IBIO.output("");
                                        break;
                                        
                                        case(17):
                                            PlayerManager.printFreethrowsAttemptedPerGameSortedList(PlayerManager.sortByAscendingFreethrowsAttempted());
                                            IBIO.output("");
                                        break;
                                        
                                        case(18):
                                            PlayerManager.printFreethrowPercentageSortedList(PlayerManager.sortByAscendingFreethrowPercentage());
                                            IBIO.output("");
                                        break;
                                        
                                        case(19):
                                            PlayerManager.printOffensiveReboundsPerGameSortedList(PlayerManager.sortByAscendingOffensiveRebounds());
                                            IBIO.output("");
                                        break;
                                        
                                        case(20):
                                            PlayerManager.printDefensiveReboundsPerGameSortedList(PlayerManager.sortByAscendingDefensiveRebounds());
                                            IBIO.output("");
                                        break;
                                        
                                        case(21):
                                            PlayerManager.printTotalReboundsPerGameSortedList(PlayerManager.sortByAscendingTotalRebounds());
                                            IBIO.output("");
                                        break;
                                        
                                        case(22):
                                            PlayerManager.printAssistsPerGameSortedList(PlayerManager.sortByAscendingAssists());
                                            IBIO.output("");
                                        break;
                                        
                                        case(23):
                                            PlayerManager.printStealsPerGameSortedList(PlayerManager.sortByAscendingSteals());
                                            IBIO.output("");
                                        break;
                                        
                                        case(24):
                                            PlayerManager.printBlocksPerGameSortedList(PlayerManager.sortByAscendingBlocks());
                                            IBIO.output("");
                                        break;
                                        
                                        case(25):
                                            PlayerManager.printTurnoversPerGameSortedList(PlayerManager.sortByAscendingTurnovers());
                                            IBIO.output("");
                                        break;
                                        
                                        case(26):
                                            PlayerManager.printPersonalFoulsPerGameSortedList(PlayerManager.sortByAscendingFouls());
                                            IBIO.output("");
                                        break;
                                        
                                        case(27):
                                            PlayerManager.printPointsPerGameSortedList(PlayerManager.sortByAscendingPoints());
                                            IBIO.output("");
                                        break;
                                        
                                        case(28):
                                            run70 = false;
                                        break;
                                        
                                        case(29):
                                            run70 = false;
                                            run69 = false;
                                            run = false;
                                        break;
                                        
                                        default:
                                            IBIO.output("Invalid choice.");
                                            IBIO.output("");
                                        break;
                                    }
                                }
                            break;
                                
                            case('B'):
                                int input71;
                                boolean run71 = true;
                                while(run71)
                                {
                                    IBIO.output("Display Players In Descending Order Of: ");
                                    IBIO.output(" 1: Name,                             2: Age");
                                    IBIO.output(" 3: Games Played,                     4: Games Started");
                                    IBIO.output(" 5: Minutes Played,                   6: Field Goals Made Per Game");
                                    IBIO.output(" 7: Field Goals Attempted Per Game,   8: Field Goal Percentage");
                                    IBIO.output(" 9: Three Pointers Made Per Game,    10: Three Pointers Attempted Per Game");
                                    IBIO.output("11: Three Point Percentage,          12: Two Pointers Made Per Game");
                                    IBIO.output("13: Two Pointers Attempted Per Game, 14: Two Point Percentage");
                                    IBIO.output("15: Effective Field Goal Percentage, 16: Free Throws Made Per Game");
                                    IBIO.output("17: Free Throws Attempted Per Game,  18: Free Throw Percentage");
                                    IBIO.output("19: Offensive Rebounds Per Game,     20: Defensive Rebounds Per Game");
                                    IBIO.output("21: Total Rebounds Per Game,         22: Assists Per Game");
                                    IBIO.output("23: Steals Per Game,                 24: Blocks Per Game");
                                    IBIO.output("25: Turnovers Per Game,              26: Personal Fouls Per Game");
                                    IBIO.output("27: Points Per Game,                 28: Back");
                                    IBIO.output("29: Quit");
                                    input71 = IBIO.inputInt("Enter your choice: ");
                                    IBIO.output("");
                                    switch(input71)
                                    {
                                        case(1):
                                            PlayerManager.printNamesSortedList(PlayerManager.sortByDescendingName());
                                            IBIO.output("");
                                        break;
                                        
                                        case(2):
                                            PlayerManager.printAgeSortedList(PlayerManager.sortByDescendingAge());
                                            IBIO.output("");
                                        break;
                                        
                                        case(3):
                                            PlayerManager.printGamesPlayedSortedList(PlayerManager.sortByDescendingGamesPlayed());
                                            IBIO.output("");
                                        break;
                                        
                                        case(4):
                                            PlayerManager.printGamesStartedSortedList(PlayerManager.sortByDescendingGamesStarted());
                                            IBIO.output("");
                                        break;
                                        
                                        case(5):
                                            PlayerManager.printMinutesPlayedSortedList(PlayerManager.sortByDescendingMinutesPlayed());
                                            IBIO.output("");
                                        break;
                                        
                                        case(6):
                                            PlayerManager.printFieldgoalsMadePerGameSortedList(PlayerManager.sortByDescendingFieldGoalsMade());
                                            IBIO.output("");
                                        break;
                                        
                                        case(7):
                                            PlayerManager.printFieldgoalsAttemptedPerGameSortedList(PlayerManager.sortByDescendingFieldGoalsAttempted());
                                            IBIO.output("");
                                        break;
                                        
                                        case(8):
                                            PlayerManager.printFieldgoalPercentageSortedList(PlayerManager.sortByDescendingFieldGoalPercentage());
                                            IBIO.output("");
                                        break;
                                        
                                        case(9):
                                            PlayerManager.printThreepointersMadePerGameSortedList(PlayerManager.sortByDescendingThreePointersMade());
                                            IBIO.output("");
                                        break;
                                        
                                        case(10):
                                            PlayerManager.printThreepointersAttemptedPerGameSortedList(PlayerManager.sortByDescendingThreePointersAttempted());
                                            IBIO.output("");
                                        break;
                                        
                                        case(11):
                                            PlayerManager.printThreepointPercentageSortedList(PlayerManager.sortByDescendingThreePointPercentage());
                                            IBIO.output("");
                                        break;
                                        
                                        case(12):
                                            PlayerManager.printTwopointersMadePerGameSortedList(PlayerManager.sortByDescendingTwoPointersMade());
                                            IBIO.output("");
                                        break;
                                        
                                        case(13):
                                            PlayerManager.printTwopointersAttemptedPerGameSortedList(PlayerManager.sortByDescendingTwoPointersAttempted());
                                            IBIO.output("");
                                        break;
                                        
                                        case(14):
                                            PlayerManager.printTwopointPercentageSortedList(PlayerManager.sortByDescendingTwoPointPercentage());
                                            IBIO.output("");
                                        break;
                                        
                                        case(15):
                                            PlayerManager.printEffectiveFieldgoalPercentageSortedList(PlayerManager.sortByDescendingEffectiveFieldGoalPercentage());
                                            IBIO.output("");
                                        break;
                                        
                                        case(16):
                                            PlayerManager.printFreethrowsMadePerGameSortedList(PlayerManager.sortByDescendingFreethrowsMade());
                                            IBIO.output("");
                                        break;
                                        
                                        case(17):
                                            PlayerManager.printFreethrowsAttemptedPerGameSortedList(PlayerManager.sortByDescendingFreethrowsAttempted());
                                            IBIO.output("");
                                        break;
                                        
                                        case(18):
                                            PlayerManager.printFreethrowPercentageSortedList(PlayerManager.sortByDescendingFreethrowPercentage());
                                            IBIO.output("");
                                        break;
                                        
                                        case(19):
                                            PlayerManager.printOffensiveReboundsPerGameSortedList(PlayerManager.sortByDescendingOffensiveRebounds());
                                            IBIO.output("");
                                        break;
                                        
                                        case(20):
                                            PlayerManager.printDefensiveReboundsPerGameSortedList(PlayerManager.sortByDescendingDefensiveRebounds());
                                            IBIO.output("");
                                        break;
                                        
                                        case(21):
                                            PlayerManager.printTotalReboundsPerGameSortedList(PlayerManager.sortByDescendingTotalRebounds());
                                            IBIO.output("");
                                        break;
                                        
                                        case(22):
                                            PlayerManager.printAssistsPerGameSortedList(PlayerManager.sortByDescendingAssists());
                                            IBIO.output("");
                                        break;
                                        
                                        case(23):
                                            PlayerManager.printStealsPerGameSortedList(PlayerManager.sortByDescendingSteals());
                                            IBIO.output("");
                                        break;
                                        
                                        case(24):
                                            PlayerManager.printBlocksPerGameSortedList(PlayerManager.sortByDescendingBlocks());
                                            IBIO.output("");
                                        break;
                                        
                                        case(25):
                                            PlayerManager.printTurnoversPerGameSortedList(PlayerManager.sortByDescendingTurnovers());
                                            IBIO.output("");
                                        break;
                                        
                                        case(26):
                                            PlayerManager.printPersonalFoulsPerGameSortedList(PlayerManager.sortByDescendingFouls());
                                            IBIO.output("");
                                        break;
                                        
                                        case(27):
                                            PlayerManager.printPointsPerGameSortedList(PlayerManager.sortByDescendingPoints());
                                            IBIO.output("");
                                        break;
                                        
                                        case(28):
                                            run71 = false;
                                        break;
                                        
                                        case(29):
                                            run71 = false;
                                            run69 = false;
                                            run = false;
                                        break;
                                        
                                        default:
                                            IBIO.output("Invalid choice.");
                                            IBIO.output("");
                                        break;
                                    }
                                }
                            break;
                            
                            case('C'):
                                run69 = false;
                            break;
                                
                            case('Q'):
                                run69 = false;
                                run = false;
                                IBIO.output("");
                            break;
                                
                            default:
                                IBIO.output("Invalid choice.");
                                IBIO.output("");
                            break;
                        }
                    }
                break;
                
                case('D'):
                    IBIO.output("G:    Games Played");
                    IBIO.output("GS:   Games Started");
                    IBIO.output("MP:   Minutes Played");
                    IBIO.output("FG:   Field Goals Made Per Game");
                    IBIO.output("FGA:  Field Goals Attempted Per Game");
                    IBIO.output("FG%:  Field Goal Percentage");
                    IBIO.output("3P:   3 Pointers Made Per Game");
                    IBIO.output("3PA:  3 Pointers Attempted Per Game");
                    IBIO.output("3P%:  3 Point Percentage");
                    IBIO.output("2P:   2 Pointers Made Per Game");
                    IBIO.output("2PA:  2 Pointers Attempted Per Game");
                    IBIO.output("2P%:  2 Point Percentage");
                    IBIO.output("eFG%: Effective Field Goal Percentage");
                    IBIO.output("FT:   Free Throws Made Per Game");
                    IBIO.output("FTA:  Free Throws Attempted Per Game");
                    IBIO.output("FT%:  Free Throw Percentage");
                    IBIO.output("ORB:  Offensive Rebounds Per Game");
                    IBIO.output("DRB:  Defensive Rebounds Per Game");
                    IBIO.output("TRB:  Total Rebounds Per Game");
                    IBIO.output("AST:  Assists Per Game");
                    IBIO.output("STL:  Steals Per Game");
                    IBIO.output("BLK:  Blocks Per Game");
                    IBIO.output("TOV:  Turnovers Per Game");
                    IBIO.output("PF:   Personal Fouls Per Game");
                    IBIO.output("PTS:  Points Per Game");
                    IBIO.output("");
                break;

                case('E'):
                boolean run2 = true;
                if(!Watchlist.watchlist.isEmpty() && run2)
                {
                    Watchlist.displayWatchlist();
                    run2 = false;
                }
                else
                {
                    char input = IBIO.inputChar("The watchlist is empty. Would you like to add a player to the watchlist? Enter 'Y' for YES, 'N' for NO or 'Q' for QUIT: ");
                    IBIO.output("");
                    input = Character.toUpperCase(input);
                    while(run2)
                    {
                        switch (input) 
                        {
                            case ('Y'):
                                String input2 = IBIO.input("Enter the name of the player: ");
                                IBIO.output("");
                                if(input2.equals(""))
                                {
                                    IBIO.output("Invalid Input");
                                    IBIO.output("");
                                    break;
                                }
                                Watchlist.add(input2);
                                run2 = false;
                            break;

                            case ('N'):
                                run2 = false;
                            break;

                            case('Q'):
                                run2 = false;
                                run = false;
                            break;

                            default:
                                IBIO.output("Invalid choice.");
                                run2 = false;
                                IBIO.output("");
                            break;
                        }
                    }
                }
                break;

                case('F'):
                    String input = IBIO.input("Enter the name of the player to be added: ");
                    IBIO.output("");
                    if(input.equals(""))
                    {
                        IBIO.output("Invalid Input");
                        IBIO.output("");
                        break;
                    }
                    Watchlist.add(input);
                break;

                case('G'):
                    if(!Watchlist.watchlist.isEmpty())
                    {
                        String input4 = IBIO.input("Enter the name of the player to be removed: ");
                        IBIO.output("");
                        if(input4.equals(""))
                        {
                            IBIO.output("Invalid Input");
                            IBIO.output("");
                            break;
                        }
                        boolean found = false;
                        for(int i = 0; i < Watchlist.watchlist.size(); i++)
                        {
                            if(Watchlist.watchlist.get(i).getName().equalsIgnoreCase(input4))
                            {
                                Watchlist.watchlist.remove(i);
                                IBIO.output(input4.toUpperCase() + " has been removed from the watchlist");
                                IBIO.output("");
                                found = true;
                            }
                        }
                        if(found == false)
                        {
                            IBIO.output(input4.toUpperCase() + " was not found");
                            IBIO.output("");
                        }
                    }
                    else
                    {
                        IBIO.output("The watchlist is empty. Players must already be added in order to be removed");
                        IBIO.output("");
                    }
                break;

                case('Q'):
                    run = false;
                break;

                default:
                IBIO.output("Invalid input.");
                IBIO.output("");
                break;
            }
        }
    }
}