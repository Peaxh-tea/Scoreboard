import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GameSimulator{
    private static final String[] teams = {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"};
    private static Team[] standings = new Team[teams.length];
    public GameSimulator(int games) throws FileNotFoundException {
    for (int i = 0; i < teams.length; i++) {
        standings[i] = new Team(teams[i]);
    }
    play();
    printStandings();
    }
    public void play() throws FileNotFoundException {
        File f = new File("Scoreboard.txt");
        Scanner s = new Scanner(f);
        while (s.hasNext()) {
            String teamOne = s.next();
            String teamTwo = s.next();
            Scoreboard sb = new Scoreboard(teamOne, teamTwo);
            while (s.hasNextInt()) {
                sb.recordPlay(s.nextInt());
            }
            if (sb.winningTeam().equals("Red")) standings[0].win();
            if (sb.winningTeam().equals("Orange")) standings[1].win();
            if (sb.winningTeam().equals("Yellow")) standings[2].win();
            if (sb.winningTeam().equals("Green")) standings[3].win();
            if (sb.winningTeam().equals("Blue")) standings[4].win();
            if (sb.winningTeam().equals("Indigo")) standings[5].win();
            if (sb.winningTeam().equals("Violet")) standings[6].win();
        }
    }
    public void printStandings(){
    sort();
    for (Team t : standings) System.out.println(t + " " + t.getWins());
    }
    public void sort(){
        for (int i = 0; i < standings.length -1; i++){
            int max = i;
            for (int j = i + 1; j < standings.length; j++){
                if (standings[j].getWins() > standings[max].getWins()) max = j;
            }
            if (i != max) {
                Team temp = standings[i];
                standings[i] = standings[max];
                standings[max] = temp;
            }
        }
    }
}
