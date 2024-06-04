package conwaysGameOfLife;

import java.util.Random;

public class Board {
    private String[][] squares;
    private int randomRow, randomCol, row, col;

 //board implementation w/o params, defaults to 25 x 25, so 625 cells
public Board()
{
    squares = new String[25][25];

    for(int i = 0; i < 25; i++)
    {
        for(int j = 0; j < 25; j++){
            squares[i][j] = "-";
        }
        

    }
    //adds about 156 random live cells at random points on the board, if a live cell is at the points where it is trying to put one, it turns that cell into a blank one (-)
    for(int i = 0; i < 156; i++){
        randomRow = (int)(Math.random() + 1) * 24;
        randomCol = (int)(Math.random() + 1) * 24;

        if(squares[randomRow][randomCol].equals("1")){
            squares[randomRow][randomCol] = "-";
        }
        }
}

//returns the board
public String toString(){
    String cells = "";
    for(int i = 0; i < squares.length; i++){
        for (int j = 0; j < squares[i].length; j++) {
            cells += squares[i][j];
        }
        cells += ("\n");
    }
    return cells;
}






}