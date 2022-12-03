import java.util.Scanner;

public class Player {
    private String name;
    private int num;
    private Scanner scanner = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int setNum() {
        do {
            System.out.print(name + " введите число от 1 до 100: ");
            num = scanner.nextInt();
        } while (num < 1 || num > 100);
        return num;
    }
}
