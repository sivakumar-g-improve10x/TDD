package templerun;

public class Player {
    private String name;
    public Player(String name) {
        this.name = name == null ? "" : name.trim();
    }

    public String getName() {
        return name;
    }
}
