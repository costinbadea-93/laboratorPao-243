import agregation.Team;
import agregation.TeamPlayer;
import composition.Car;
import composition.Engine;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Composition
        Engine engine = new Engine("Engine1");
        Car car = new Car(engine,"C1","Color1");
        System.out.println(car);

        //aggregation
        TeamPlayer t1 = new TeamPlayer("T1");
        TeamPlayer t2 = new TeamPlayer("T1");

        List<TeamPlayer> teamPlayers = Arrays.asList(t1,t2);

        Team team = new Team("Team1", teamPlayers);

        System.out.println(team);

    }
}
