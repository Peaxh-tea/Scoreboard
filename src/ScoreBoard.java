public class ScoreBoard {
    private String team1;
    private String team2;
    private int score1 = 0;
    private int score2 = 0;
    private String currentTeam;
    private boolean playing1 = true;
    private boolean playing2 = false;
    public ScoreBoard(String team1, String team2){
        this.team1 = team1;
        this.team2 = team2;
        currentTeam = team1;
    }
    public String getScore(){
        return score1 + "-" + score2 + "-" + currentTeam;
    }
    public void recordPlay(int points){
        if (playing1 && points > 0) score1 += points;
        else if (playing2 && points > 0) score2 += points;
        else {
            if (playing1) {
                playing1 = false;
                playing2 = true
            } else{
                playing2 = false;
                playing1 = true;
            }
        }
    }
}
