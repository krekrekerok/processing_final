package Game;

public class Cell {

    private int size;
    private int x, y;
    private State state;
    private enum color {Red, Green, Grey};

    public State getState() {
        return state;
    }

    public Cell(int size) {
        this.size = size;
        this.state = state.Empty;
    }

    public Cell(int size, int x, int y) {
        this.size = size;
        this.x = x;
        this.y = y;
        this.state = State.Empty;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void changeState(){
        if (this.state == State.Empty){
            this.state = State.O;
        }else if(this.state == State.O){
            this.state = State.X;
        }else{
            this.state = State.Empty;
        }
    }

    @Override
    public String toString() {
        return state == State.O? "0":"1";
    }
}
