public class Interfaces {
    public static void main(String args[]){
        Queen q  =new Queen();
        q.moves();
        
        Rook r =new Rook();
        r.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right, diagonal (in all 4 directions)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}