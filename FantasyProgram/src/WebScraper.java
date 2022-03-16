import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScraper
{
    static String[] rowData;
    static String[] header;
    static ArrayList<String[]> rows = new ArrayList<>();

    public static void webScrape() throws IOException
    {
        Document doc = Jsoup.connect("https://www.basketball-reference.com/leagues/NBA_2020_per_game.html").get();
        Elements data = doc.select("table.stats_table"); // get the table
        Elements row = data.select("tr"); // get the rows of the table
        header = row.get(0).text().split(" "); // save header

        for (Element r : row) // iterate over each row
        {
            // convert each row into an array
            rowData = r.text().split(" ");
            if (!rowData[0].equalsIgnoreCase("rk") && rowData.length == 31)
            {
                rows.add(rowData);  // add only player data to arraylist
            }
        }
    } 

    public static void save() throws IOException
    {
        File playerList = new File("PlayerList.csv");
        FileWriter fw = new FileWriter(playerList);
        PrintWriter out = new PrintWriter(fw);	// write mode

        for (int i = 0; i < header.length; i++) //loop to save each element of the header
        {
            if (header != null)
            {
                out.print(header[i]);
                if (i < header.length - 1)
                {
                    out.print(",");
                }
            }
        }

        out.println();

        for (String[] r : rows) // iterates the arraylist of arrays of stats of each player //
        {
            for (int j = 0; j < r.length; j++) // iterates each of the stats of a player
            {
                if (j == 1)
                {
                    out.print(r[1] + " " + r[2] + ","); // join name+surname and save
                    j = 3;
                }
                out.print(r[j]);
                if (j < r.length - 1)
                {
                    out.print(",");
                }
            }
            out.println();
        }
        out.close();
    }
}