public class Player 
{
    private String rank;
    private String name;
    private String position;
    private int age;
    private String team;
    private int gamesplayed;
    private int gamesstarted;
    private float minutesplayed;
    private float fieldgoalsmadepergame;
    private float fieldgoalsattemptedpergame;
    private float fieldgoalpercentage;
    private float threepointersmadepergame;
    private float threepointersattemptedpergame;
    private float threepointpercentage;    
    private float twopointersmadepergame;
    private float twopointersattemptedpergame;
    private float twopointerpercentage;
    private float effectivefieldgoalpercentage;
    private float freethrowsmadepergame;
    private float freethrowsattemptedpergame;
    private float freethrowpercentage;
    private float offensivereboundspergame;
    private float defensivereboundspergame;
    private float totalreboundspergame;
    private float assistspergame;
    private float stealspergame;
    private float blockspergame;
    private float turnoverspergame;
    private float personalfoulspergame;
    private float pointspergame;

    public Player(){}
    
    public Player(String rank, String name, String position, int age, String team, 
            int gamesplayed, int gamesstarted, float minutesplayed, 
            float fieldgoalsmadepergame, float fieldgoalsattemptedpergame, 
            float fieldgoalpercentage, float threepointersmadepergame, 
            float threepointersattemptedpergame, float threepointpercentage, 
            float twopointersmadepergame, float twopointersattemptedpergame, 
            float twopointerpercentage, float effectivefieldgoalpercentage, 
            float freethrowsmadepergame, float freethrowsattemptedpergame, 
            float freethrowpercentage, float offensivereboundspergame, 
            float defensivereboundspergame, float totalreboundspergame, 
            float assistspergame, float stealspergame, float blockspergame, 
            float turnoverspergame, float personalfoulspergame, float pointspergame)
    {
        this.rank = rank;
        this.name = name;
        this.position = position;
        this.age = age;
        this.team = team;
        this.gamesplayed = gamesplayed;
        this.gamesstarted = gamesstarted;
        this.minutesplayed = minutesplayed;
        this.fieldgoalsmadepergame = fieldgoalsmadepergame;
        this.fieldgoalsattemptedpergame = fieldgoalsattemptedpergame;
        this.fieldgoalpercentage = fieldgoalpercentage;
        this.threepointersmadepergame = threepointersmadepergame;
        this.threepointersattemptedpergame = threepointersattemptedpergame;
        this.threepointpercentage = threepointpercentage;
        this.twopointersmadepergame = twopointersmadepergame;
        this.twopointersattemptedpergame = twopointersattemptedpergame;
        this.twopointerpercentage = twopointerpercentage;
        this.effectivefieldgoalpercentage = effectivefieldgoalpercentage;
        this.freethrowsmadepergame = freethrowsmadepergame;
        this.freethrowsattemptedpergame = freethrowsattemptedpergame;
        this.freethrowpercentage = freethrowpercentage;
        this.offensivereboundspergame = offensivereboundspergame;
        this.defensivereboundspergame = defensivereboundspergame;
        this.totalreboundspergame = totalreboundspergame;
        this.assistspergame = assistspergame;
        this.stealspergame = stealspergame;
        this.blockspergame = blockspergame;
        this.turnoverspergame = turnoverspergame;
        this.personalfoulspergame = personalfoulspergame;
        this.pointspergame = pointspergame;
    }
    
    public String getRank()
    {
        return this.rank;
    }

    public String getPosition()
    {
        return this.position;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getTeam()
    {
        return this.team;
    }
    
    public String getName() 
    {
        return this.name;
    }

    public float getMinutesPlayed() 
    {
        return this.minutesplayed;
    }

    public int getGamesPlayed() 
    {
        return this.gamesplayed;
    }

    public int getGamesStarted() 
    {
        return this.gamesstarted;
    }

    public float getFieldgoalsMadePerGame() 
    {
        return this.fieldgoalsmadepergame;
    }

    public float getFieldgoalsAttemptedPerGame() 
    {
        return this.fieldgoalsattemptedpergame;
    }

    public float getFieldgoalPercentage() 
    {
        return this.fieldgoalpercentage;
    }

    public float getThreepointersMadePerGame() 
    {
        return this.threepointersmadepergame;
    }

    public float getThreepointersAttemptedPerGame() 
    {
        return this.threepointersattemptedpergame;
    }

    public float getThreepointPercentage() 
    {
        return this.threepointpercentage;
    }

    public float getTwopointersMadePerGame() 
    {
        return this.twopointersmadepergame;
    }

    public float getTwopointersAttemptedPerGame() 
    {
        return this.twopointersattemptedpergame;
    }

    public float getTwopointPercentage() 
    {
        return this.twopointerpercentage;
    }

    public float getEffectiveFieldgoalPercentage() 
    {
        return this.effectivefieldgoalpercentage;
    }

    public float getFreethrowsMadePerGame() 
    {
        return this.freethrowsmadepergame;
    }

    public float getFreethrowsAttemptedPerGame() 
    {
        return this.freethrowsattemptedpergame;
    }

    public float getFreethrowPercentage() 
    {
        return this.freethrowpercentage;
    }

    public float getOffensiveReboundsPerGame() 
    {
        return this.offensivereboundspergame;
    }

    public float getDefensiveReboundsPerGame() 
    {
        return this.defensivereboundspergame;
    }

    public float getTotalReboundsPerGame() 
    {
        return this.totalreboundspergame;
    }

    public float getAssistsPerGame() 
    {
        return this.assistspergame;
    }

    public float getStealsPerGame() 
    {
        return this.stealspergame;
    }

    public float getBlocksPerGame() 
    {
        return this.blockspergame;
    }

    public float getTurnoversPerGame() 
    {
        return this.turnoverspergame;
    }

    public float getPersonalFoulsPerGame() 
    {
        return this.personalfoulspergame;
    }

    public float getPointsPerGame() 
    {
        return this.pointspergame;
    }
}