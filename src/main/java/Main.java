
import Game.Cell;
import Game.State;
import processing.core.PApplet;
import processing.event.MouseEvent;

public class Main extends PApplet{
    final int width = 800;
    final int height = 600;
    final int size = 50;
    final int rows = 3;
    final int cols = 3;
    private Cell cells[] = new Cell[rows*cols];

    @Override
    public void settings(){
        size(width,height);
//        fullScreen();
    }

    @Override
    public void setup(){
        textSize(70);
        textAlign(CENTER, CENTER);
//        background(200,155,0);
        for (int i = 0; i < cells.length; i++) {
            cells[i] = new Cell(size,width/2 + size * (i%cols) - (int) (size * cols/ 2), height/2 + size * (i /rows) - (int) (size*rows/2));
        }
    }


    @Override
    public void draw(){
        background(190,190,255);
        text("Tic-Tac-Toe", width/2, height/10);
        for (int i = 0; i < cells.length; i++) {
            if (cells[i].getState() == State.O){
                fill(200, 0, 0);
            }else if (cells[i].getState() == State.X) {
                fill(0, 200, 0);
            } else {
                fill(100,100,100);
            }
            rect(cells[i].getX(), cells[i].getY(), size, size);
        }
        for (int i = 0; i < cells.length; i++) {

        }
    }

    @Override
    public void mouseClicked(MouseEvent event) {
        for (int i = 0; i < cells.length; i++) {
            if (event.getX() > cells[i].getX() &&
                    event.getX() < cells[i].getX() + size &&
                    event.getY() > cells[i].getY() &&
                    event.getY() < cells[i].getY() + size){
                cells[i].changeState();
            }
        }
        for (int i = 0; i < cells.length; i++) {
            System.out.println(cells[i]);

        }
    }


    public static void main(String[] args) {
        PApplet.main("Main");
    }
}
