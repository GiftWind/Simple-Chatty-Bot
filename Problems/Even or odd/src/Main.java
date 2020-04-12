import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int i = scanner.nextInt();
            if (i == 0) {
                break;
            } else if (i % 2 == 1) {
                System.out.println("odd");
            } else {
                System.out.println("even");
            }
        }
    }
}