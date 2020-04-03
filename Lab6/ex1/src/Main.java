public class Main {
    public static void main(String[] args) {

    }
}


class Car{
    private final Engine engine;
    public Car(Engine engine) {
        this.engine = new Engine();
    }
}

class Engine{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
