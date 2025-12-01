public class Team {
    private final String teamName;
    private int wins;
    Team(String teamName){
        this.teamName = teamName;
    }
    public String getTeamName(){
        return teamName;
    }
    private void win(){
        wins++;
    }
    public void setWins(int pWins){
        wins = pWins;
    }
    public int getWins(){
        return wins;
    }
}
