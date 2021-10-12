package queueAndStack;

public class Animals {
    private String type;

    public Animals(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }



    @Override
    public String toString() {
        return "Animals{" +
                "type='" + type + '\'' +
                '}';
    }
}
