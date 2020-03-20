package agregation;

public class TeamPlayer {
    private String name;

    public TeamPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TeamPlayer{" +
                "name='" + name + '\'' +
                '}';
    }
}
