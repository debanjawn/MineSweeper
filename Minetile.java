public class Minetile { // minetile tells each minetile how to behave
    boolean isMine = false;
    int minesNum = 0;
    boolean flagged = false;
    boolean covered = true;
    int X;
    int Y;

// constructor is like a little set of instructions not in a method
    public Minetile(int X, int Y){
        this.X = X;
        this.Y = Y;



    }
    public String toString() {
        if (flagged){
            return "F ";
        }
        else if (covered){
            return "# ";
        }
        else if (isMine){
            return "* ";
        }
        else {
            return "E ";
        }

    }

    
}
