public class Dragon24 {
    int x, y, width, height;

    public Dragon24(int w, int h) {
        width = w;
        height = h;
    }

    void printPosition() {
        System.out.println("Dragon Current Position");
        System.out.printf("x: %d\ny: %d\n", x, y);
        System.out.println();
    }

    void detectCollision(int x, int y) {
        if (x < 0 || x > width || y < 0 || y > height) {
            System.out.println("Game Over !");
            System.exit(0);
        }
    }

    void moveRight() {
        x++;
        detectCollision(x, y);
    }

    void moveLeft() {
        x--;
        detectCollision(x, y);
    }

    void moveUp() {
        y++;
        detectCollision(x, y);
    }

    void moveBottom() {
        y--;
        detectCollision(x, y);
    }

}