package agregation;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<TeamPlayer> teamPlayerList = new ArrayList<>();

    public Team(String name, List<TeamPlayer> teamPlayerList) {
        this.name = name;
        this.teamPlayerList = teamPlayerList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TeamPlayer> getTeamPlayerList() {
        return teamPlayerList;
    }

    public void setTeamPlayerList(List<TeamPlayer> teamPlayerList) {
        this.teamPlayerList = teamPlayerList;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", teamPlayerList=" + teamPlayerList +
                '}';
    }
}
