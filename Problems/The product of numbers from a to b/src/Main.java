import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long start = scanner.nextInt();
        long finish = scanner.nextInt();
        long result = 1;
        for (long i = start; i < finish; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}