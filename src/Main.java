import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) throws FileNotFoundException {
        System.out.println(read());
    }
    public static String read() throws FileNotFoundException {
        File f = new File("Scoreboard.txt");
        Scanner s = new Scanner(f);
        String teams[] = new String[12];
        while (s.hasNextLine()){
            String team1 = s.next();
            int points1 = 0;
            String team2 = s.next();
            int points2 = 0;
            for (int i = 0; i < teams.length; i++){
                if (team1.equals(teams[i])) points1 += teams[i[]]
            }
            if (s.next == 0) sw
        }
    }
}
