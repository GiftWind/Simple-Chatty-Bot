import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = 0;
        while (true) {
            int i = scanner.nextInt();
            if (i == 0)
                break;
            else
                answer += i;
        }
        System.out.println(answer);
    }
}