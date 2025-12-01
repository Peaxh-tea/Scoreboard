import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws FileNotFoundException {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");
        System.out.println(info = game.getScore());
        game.recordPlay(1);
        System.out.println(info = game.getScore());
        game.recordPlay(0);
        System.out.println(info = game.getScore());
        System.out.println(info = game.getScore());
        game.recordPlay(3);
        System.out.println(info = game.getScore());
        game.recordPlay(1);
        game.recordPlay(0);
        System.out.println(info = game.getScore());
        game.recordPlay(0);
        game.recordPlay(4);
        game.recordPlay(0);
        System.out.println(info = game.getScore());
        Scoreboard match = new Scoreboard("Lions", "Tigers");
        System.out.println(info = match.getScore());
        System.out.println(info = game.getScore());
        //System.out.println(read());
    }


    public static String read() throws FileNotFoundException {
        File f = new File("Scoreboard.txt");
        Scanner s = new Scanner(f);
        String[] teams = new String[7];
        while (s.hasNextLine()){
            Team team1 = new Team(s.next());
            Team team2 = new Team(s.next());
            for (int i = 0; i < 7; i++) {
                if (team1 == teams[i]) team1.setWins(teams[i].getWins());
                if (team2 == teams[i]) team2.setWins(teams[i].getWins());
            }
            Scoreboard scoring = new Scoreboard(team1.getTeamName(), team2.getTeamName());
            while (s.next() == int) scoring.recordPlay(s.nextInt());
            if (scoring.winningTeam()!= null){
                if (scoring.winningTeam() == team1) team1.win();
            }
        }
        return null;
    }
}
