import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Loader
{
    public static void load() throws IOException
    { 
        for(int b = 0; b < TeamManager.programTeamList.length; b++)
        {
            TeamManager.programTeamList[b] = new Team();
        }

        TeamManager.programTeamList[0].setName("ATL");
        TeamManager.programTeamList[0].setConference("East");
        TeamManager.programTeamList[1].setName("BOS");
        TeamManager.programTeamList[1].setConference("East");
        TeamManager.programTeamList[2].setName("BRK");
        TeamManager.programTeamList[2].setConference("East");
        TeamManager.programTeamList[3].setName("CHI");
        TeamManager.programTeamList[3].setConference("East");
        TeamManager.programTeamList[4].setName("CHO");
        TeamManager.programTeamList[4].setConference("East");
        TeamManager.programTeamList[5].setName("CLE");
        TeamManager.programTeamList[5].setConference("East");
        TeamManager.programTeamList[6].setName("DAL");
        TeamManager.programTeamList[6].setConference("West");
        TeamManager.programTeamList[7].setName("DEN");
        TeamManager.programTeamList[7].setConference("West");
        TeamManager.programTeamList[8].setName("DET");
        TeamManager.programTeamList[8].setConference("East");
        TeamManager.programTeamList[9].setName("GSW");
        TeamManager.programTeamList[9].setConference("West");
        TeamManager.programTeamList[10].setName("HOU");
        TeamManager.programTeamList[10].setConference("West");
        TeamManager.programTeamList[11].setName("IND");
        TeamManager.programTeamList[11].setConference("East");
        TeamManager.programTeamList[12].setName("LAC");
        TeamManager.programTeamList[12].setConference("West");
        TeamManager.programTeamList[13].setName("LAL");
        TeamManager.programTeamList[13].setConference("West");
        TeamManager.programTeamList[14].setName("MEM");
        TeamManager.programTeamList[14].setConference("West");
        TeamManager.programTeamList[15].setName("MIA");
        TeamManager.programTeamList[15].setConference("East");
        TeamManager.programTeamList[16].setName("MIL");
        TeamManager.programTeamList[16].setConference("East");
        TeamManager.programTeamList[17].setName("MIN");
        TeamManager.programTeamList[17].setConference("West");
        TeamManager.programTeamList[18].setName("NOP");
        TeamManager.programTeamList[18].setConference("West");
        TeamManager.programTeamList[19].setName("NYK");
        TeamManager.programTeamList[19].setConference("East");
        TeamManager.programTeamList[20].setName("OKC");
        TeamManager.programTeamList[20].setConference("West");
        TeamManager.programTeamList[21].setName("ORL");
        TeamManager.programTeamList[21].setConference("East");
        TeamManager.programTeamList[22].setName("PHI");
        TeamManager.programTeamList[22].setConference("East");
        TeamManager.programTeamList[23].setName("PHO");
        TeamManager.programTeamList[23].setConference("West");
        TeamManager.programTeamList[24].setName("POR");
        TeamManager.programTeamList[24].setConference("West");
        TeamManager.programTeamList[25].setName("SAC");
        TeamManager.programTeamList[25].setConference("West");
        TeamManager.programTeamList[26].setName("SAS");
        TeamManager.programTeamList[26].setConference("West");
        TeamManager.programTeamList[27].setName("TOR");
        TeamManager.programTeamList[27].setConference("East");
        TeamManager.programTeamList[28].setName("TOT");
        TeamManager.programTeamList[28].setConference("Multiple");
        TeamManager.programTeamList[29].setName("UTA");
        TeamManager.programTeamList[29].setConference("West");
        TeamManager.programTeamList[30].setName("WAS");
        TeamManager.programTeamList[30].setConference("East");
        
        String csvFile = "PlayerList.csv";
        String line = "";
        String cvsSplitBy = ",";
        BufferedReader br = new BufferedReader(new FileReader(csvFile));
        br.readLine();
        while ((line = br.readLine()) != null)
        {
            String[] allplayers = line.split(cvsSplitBy);

            for(int i = 0; i < allplayers.length; i=i+30)
            {
                String rank = allplayers[i];
                String name = allplayers[i+1];
                String position = allplayers[i+2];
                int age = Integer.parseInt(allplayers[i+3]);
                String team = allplayers[i+4];
                int gamesplayed = Integer.parseInt(allplayers[i+5]);
                int gamesstarted = Integer.parseInt(allplayers[i+6]);
                float minutesplayed = Float.parseFloat(allplayers[i+7]);
                float fieldgoalsmadepergame = Float.parseFloat(allplayers[i+8]);
                float fieldgoalsattemptedpergame = Float.parseFloat(allplayers[i+9]);
                float fieldgoalpercentage = Float.parseFloat(allplayers[i+10]);
                float threepointersmadepergame = Float.parseFloat(allplayers[i+11]);
                float threepointersattemptedpergame = Float.parseFloat(allplayers[i+12]);
                float threepointpercentage = Float.parseFloat(allplayers[i+13]);
                float twopointersmadepergame = Float.parseFloat(allplayers[i+14]);
                float twopointersattemptedpergame = Float.parseFloat(allplayers[i+15]);
                float twopointerpercentage = Float.parseFloat(allplayers[i+16]);
                float effectivefieldgoalpercentage = Float.parseFloat(allplayers[i+17]);
                float freethrowsmadepergame = Float.parseFloat(allplayers[i+18]);
                float freethrowsattemptedpergame = Float.parseFloat(allplayers[i+19]);
                float freethrowpercentage = Float.parseFloat(allplayers[i+20]);
                float offensivereboundspergame = Float.parseFloat(allplayers[i+21]);
                float defensivereboundspergame = Float.parseFloat(allplayers[i+22]);
                float totalreboundspergame = Float.parseFloat(allplayers[i+23]);
                float assistspergame = Float.parseFloat(allplayers[i+24]);
                float stealspergame = Float.parseFloat(allplayers[i+25]);
                float blockspergame = Float.parseFloat(allplayers[i+26]);
                float turnoverspergame = Float.parseFloat(allplayers[i+27]);
                float personalfoulspergame = Float.parseFloat(allplayers[i+28]);
                float pointspergame = Float.parseFloat(allplayers[i+29]);

                Player newPlayer = new Player(rank, name, position, age, team, 
                gamesplayed, gamesstarted, minutesplayed, fieldgoalsmadepergame,
                fieldgoalsattemptedpergame, fieldgoalpercentage, threepointersmadepergame, 
                threepointersattemptedpergame, threepointpercentage, twopointersmadepergame, 
                twopointersattemptedpergame, twopointerpercentage, effectivefieldgoalpercentage, 
                freethrowsmadepergame, freethrowsattemptedpergame, freethrowpercentage,
                offensivereboundspergame, defensivereboundspergame, totalreboundspergame, 
                assistspergame, stealspergame, blockspergame, turnoverspergame, 
                personalfoulspergame, pointspergame);
                
                PlayerManager.addPlayer(newPlayer);
                
                for(int teamcounter = 0; teamcounter < TeamManager.programTeamList.length; teamcounter++)
                {
                    if(TeamManager.programTeamList[teamcounter].getName().equals(newPlayer.getTeam()))
                    {
                        TeamManager.programTeamList[teamcounter].addPlayer(newPlayer);
                        break;
                    }
                }
            }
        }
        br.close();
    }
}