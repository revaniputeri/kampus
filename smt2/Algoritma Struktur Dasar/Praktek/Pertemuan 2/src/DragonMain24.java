import java.util.Scanner;

public class DragonMain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dragon24 dragon = new Dragon24(3, 5);

        while (true) {
            System.out.println("Move Dragon");
            System.out.println("1. Move Right\n2. Move Left\n3. Move Up\n4. Move Bottom");
            System.out.print("Enter: ");
            int move = sc.nextInt();

            System.out.println();

            switch (move) {
                case 1:
                    dragon.moveRight();
                    break;
                case 2:
                    dragon.moveLeft();
                    break;
                case 3:
                    dragon.moveUp();
                    break;
                case 4:
                    dragon.moveBottom();
                    break;
                default:
                    break;
            }
            dragon.printPosition();
        }
    }
}