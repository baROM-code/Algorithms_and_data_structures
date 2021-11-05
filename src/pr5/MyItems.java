package pr5;

public class MyItems {

    private int value;
    private int weight;
    private boolean skip;

    public MyItems(int value, int weight) {
        this.value = value;
        this.weight = weight;
        this.skip = false;
    }

    public int getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isSkip() {
        return skip;
    }

    public void setSkip() {
        this.skip = true;
    }
}
