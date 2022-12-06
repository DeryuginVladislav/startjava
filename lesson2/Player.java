public class Player {
    private String name;
    private int num;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        do {
            this.num = num;
        } while (num < 1 || num > 100);
    }

    public int getNum() {
        return num;
    }
}