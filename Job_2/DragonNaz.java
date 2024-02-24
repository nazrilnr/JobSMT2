public class DragonNaz {
    private int x;
    private int y;
    private int width;
    private int height;

    public DragonNaz(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        if (x > 0 && x <= width) {
            x--;
        } else {
            detectCollision();
        }
    }

    public void moveRight() {
        if (x >= 0 && x < width) {
            x++;
        } else {
            detectCollision();
        }
    }

    public void moveUp() {
        if (y > 0 && y <= height) {
            y--;
        } else {
            detectCollision();
        }
    }

    public void moveDown() {
        if (y >= 0 && y < height) {
            y++;
        } else {
            detectCollision();
        }
    }

    public void printPosition() {
        System.out.println("Posisi DragonNaz: (" + x + ", " + y + ")");
    }

    public void detectCollision() {
        if (x < 0 || x > width || y < 0 || y > height) {
            System.out.println("Game Over");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        DragonNaz DragonNaz = new DragonNaz(5, 5, 10, 10);
        DragonNaz.printPosition();
        DragonNaz.moveLeft();
        DragonNaz.printPosition();
        DragonNaz.moveRight();
        DragonNaz.printPosition();
        DragonNaz.moveUp();
        DragonNaz.printPosition();
        DragonNaz.moveDown();
        DragonNaz.printPosition();
    }
}