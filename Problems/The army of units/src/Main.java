import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int army = scanner.nextInt();

        if (army > 999)
            System.out.println("legion");
        else if (army > 249)
            System.out.println("zounds");
        else if (army > 19)
            System.out.println("throng");
        else if (army > 0)
            System.out.println("pack");
        else
            System.out.println("no army");
    }
}