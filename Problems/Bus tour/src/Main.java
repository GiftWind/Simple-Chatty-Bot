import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bus = scanner.nextInt();
        int bridges = scanner.nextInt();
        int bridge = 0;
        String result = "Will not crash";
        while (bridge <= bridges && scanner.hasNext()) {
            bridge++;
            if (scanner.nextInt() <= bus) {
                result = "Will crash on bridge " + bridge;
                break;
            }
        }
        System.out.println(result);
    }
}