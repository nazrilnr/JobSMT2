import java.util.Random;
public class DragonNaz1 {
    private int x;
    private int y;
    private int width;
    private int height;
    private Random random;

    public DragonNaz1(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        random = new Random();
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

    // Method untuk menggerakkan dragon secara acak
    public void moveRandomly() {
        int direction = random.nextInt(4); // 0: left, 1: right, 2: up, 3: down
        switch (direction) {
            case 0:
                moveLeft();
                break;
            case 1:
                moveRight();
                break;
            case 2:
                moveUp();
                break;
            case 3:
                moveDown();
                break;
        }
    }

    // Method untuk menjalankan permainan dengan dragon bergerak secara acak setiap beberapa detik
    public void playGame(int durationInSeconds) {
        long endTime = System.currentTimeMillis() + durationInSeconds * 1000;
        while (System.currentTimeMillis() < endTime) {
            moveRandomly();
            printPosition();
            try {
                Thread.sleep(1000); // Pause selama 1 detik
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        DragonNaz dragon = new DragonNaz(5, 5, 10, 10);
        dragon.printPosition();
        dragon.moveLeft();
        dragon.printPosition();
        dragon.moveRight();
        dragon.printPosition();
        dragon.moveUp();
        dragon.printPosition();
        dragon.moveDown();
        dragon.printPosition();

        // Menjalankan permainan dengan durasi 10 detik
        dragon.playGame(10);
    }
}

