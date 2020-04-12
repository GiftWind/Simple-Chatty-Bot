import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isAscending = true;
        boolean isDescending = true;
        int acc = scanner.nextInt();

        while (scanner.hasNext()) {
            int next = scanner.nextInt();
            if (isAscending && acc < next && next != 0) {
                isAscending = false;
            }

            if (isDescending && acc > next && next != 0) {
                isDescending = false;
            }
            acc = next;
        }

        System.out.println(isAscending || isDescending);
    }
}