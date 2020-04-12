import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double M = scanner.nextInt();
        int P = scanner.nextInt();
        double K = scanner.nextInt();

        int years = 0;

        while (M < K) {
            M += + P * M / 100;
            years++;
        }

        System.out.print(years);
    }
}