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
            String team1 = s.next();
            String team2 = s.next();
            Scoreboard scoring = new Scoreboard(team1, team2);
            while (s.next() == int) scoring.recordPlay(s.nextInt());
            if (scoring.winningTeam()!= null){
                if (scoring.winningTeam() == team1) teams[]
            }
        }
        return null;
    }
}
