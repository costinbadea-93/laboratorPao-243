package composition;

public class Engine {
    private String engineName;

    public Engine(String engineName) {
        this.engineName = engineName;
    }

    public String getEngineName() {
        return engineName;
    }

    public void setEngineName(String engineName) {
        this.engineName = engineName;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "engineName='" + engineName + '\'' +
                '}';
    }
}
