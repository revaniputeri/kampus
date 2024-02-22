import java.util.Scanner;

public class perulanganNim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input NIM: ");
        String nim = scanner.nextLine();

        int n = Integer.parseInt(nim.substring(nim.length() - 2));
        if (n < 10) {
            n += 10;
        }

        System.out.print("OUTPUT: ");
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
