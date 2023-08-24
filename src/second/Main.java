package second;

public class Main {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        while (x < 11) {
            System.out.println(x + " * " + y + " = " + x * y);
            y++;
            if (y > 10) {
                y = 1;
                x++;
            }
        }
    }
}