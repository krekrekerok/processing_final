package Game;

//import processing.core.PApplet;

public class Creature{
    private int x;
    private int y;
    private int size;
    private int speed;
    private int health;

    public Creature(int x, int y, int size, int health) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.speed = 1;
        this.health = health;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getSize() {
        return size;
    }

    public void teleport(int x, int y){
        this.x = x;
        this.y = y;
    }

    private double getDistance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
    }

    public void moveTo(int x, int y){
        if (getDistance(this.x, this.y, x, y) > 0.5){
            this.x -= (this.x - x)/ Math.abs(this.x -x) * speed;
            this.y -= (this.y - y)/ Math.abs(this.y -y) * speed;
//            moveTo(x, y);
        }
    }

    public int getHealth() {
        return health;
    }


    public void setHealth(int health) {
        this.health = health;
    }

}
