public class Team {
    private final String teamName;
    private int wins;
    public Team(String teamName){
        this.teamName = teamName;
    }
    public String getTeamName(){
        return teamName;
    }
    public void win(){
        wins++;
    }
    public int getWins(){
        return wins;
    }
    public String toString(){
        return teamName;
    }
}
