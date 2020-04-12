import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        for(;;) {
            if (!scanner.hasNext()) {
                break;
            }
            else {
                int tmp = scanner.nextInt();
                if (tmp % 4 == 0 && tmp > max)
                    max = tmp;
            }
        }
        System.out.println(max);
    }
}