import java.lang.reflect.Method;
import java.util.Scanner;
import java.util.Random;

public class Minesweeper {
    private static int sideLength = 10;
    private static Minetile [][] field =  new Minetile [sideLength][sideLength]; 
    private static int numofMines = 10;


    

    // first we are going to make a minetile,
    public static void main(String[] ms){
        
        
        for (int m = 0; m < sideLength; m+= 1 ){
            for (int t = 0; t < sideLength; t+= 1){
                field[m][t] = new Minetile(m+1, t+1);
            }
        }

        printBoard();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Row(Up and Down) Number");
        int x = s.nextInt();
        System.out.println("Enter Array(Right and Left");
        int y = s.nextInt();
    
        minePlacer();

    }
    public static void printBoard() {
        for (int i = 0; i < sideLength; i += 1){
            // (starting ; conditional ; what you want to do with loop)
            for (int j = 0; j < sideLength; j += 1){
                System.out.print(field[i][j]);                
            }
             System.out.println( );
        }  
        
    }  
    public static void minePlacer() {
        // when we place a mine down none of them are near the starting move
        Random r = new Random();
        // it cant be on the first move
        // it cant be next to any of the tiles from the first move

        
    }


}
