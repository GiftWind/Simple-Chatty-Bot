import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        boolean weekend = scanner.next().equals("true");

        System.out.println(weekend && cups <= 25 && cups >= 15 ||
                          !weekend && cups <= 20 && cups >= 10);
    }
}