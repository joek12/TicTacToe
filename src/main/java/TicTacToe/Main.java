package TicTacToe;
import java.util.*;
public class Main {

    public static void main(String[] args) {


        Board myBoard = new Board();
        myBoard.drawBoard();

        boolean flag = true;
        while(flag){
            char xOrO = 'x';
            askMove(xOrO, myBoard);
            myBoard.drawBoard();
            xOrO = 'o';
            askMove(xOrO, myBoard);
            myBoard.drawBoard();
            flag = !myBoard.checkWin();
        }

    }


    public static void askMove(char xOrO, Board myBoard) {
        char rowPlayed = ' ';
        int columnPlayed = 0;
        Scanner sc = new Scanner(System.in);

        boolean flag = true;

        while (flag) {
            System.out.println("Please enter the letter of the row you would like to play.");
            char[] dum = sc.next().toCharArray();
            char rowLetter = dum[0];
            //make sure the user entered in a valid row letter
            if (rowLetter != 'a' && rowLetter != 'A' && rowLetter != 'b' && rowLetter != 'B' && rowLetter != 'c' && rowLetter != 'C')
                System.out.println("You have not entered a valid row letter.\n");

            else {
                rowPlayed = rowLetter;
                flag = false;
            }
        }

        //ask for column


        flag = true;

        while (flag) {
            System.out.println("Please enter the number of the column you would like to play.");
            int columnNumber = sc.nextInt();
            //make sure the user entered in a valid column number
            if (columnNumber != 1 && columnNumber != 2 && columnNumber != 3)
                System.out.println("You have not entered a valid column number.\n");

            else{
                columnPlayed = columnNumber;
                flag = false;
            }

        }

        myBoard.enterMove(rowPlayed, columnPlayed, xOrO);

    }


}
