package TicTacToe;

public class Board {

    //array to hold the positions
    private char[] positions = new char[9];


    public Board(){
        initiateBoard();
    }

    private void initiateBoard(){
        for (int i = 0; i < positions.length; i++){
            positions[i] = ' ';
            //System.out.println(positions[i]);
        }
        //clear the positions array

    }

    public void drawBoard(){
        //read the positions array and draw the board
        System.out.println("    1   2   3 \n");
        System.out.println("      |   |   ");
        System.out.println("A   " + positions[0] + " | " + positions[1] + " | " + positions[2] + " ");
        System.out.println("   ___|___|___");
        System.out.println("      |   |   ");
        System.out.println("B   " + positions[3] + " | " + positions[4] + " | " + positions[5] + " ");
        System.out.println("   ___|___|___");
        System.out.println("      |   |   ");
        System.out.println("C   " + positions[6] + " | " + positions[7] + " | " + positions[8] + " ");
        System.out.println("      |   |   ");

    }

    public boolean enterMove(char inputChar, int inputInt, char xOrO){

        //if inputChar is A, then it's first row
        if(inputChar == 'a' || inputChar == 'A') {
            //subtract the inputInt by only one
            inputInt--;
            //check if there is already a x or o there
            if (positions[inputInt] != ' ')
                return false;
            else {
                positions[inputInt] = xOrO;
                return true;
            }
        }

        //else if inputChar is B, then it's the second row
        else if(inputChar == 'b' || inputChar == 'B'){
            //add two to the inputInt
            inputInt += 2;
            //check if there is already x or o
            if(positions[inputInt] != ' ')
                return false;

            else{
                positions[inputInt] = xOrO;
                return true;
            }
        }

        //else if inputChar is C, then it's the third row
        else if(inputChar == 'c' || inputChar == 'C'){
            //add 5 to the inputInt
            inputInt += 5;
            //check if there is already x or o
            if(positions[inputInt] != ' ')
                return false;

            else{
                positions[inputInt] = xOrO;
                return true;
            }
        }

        else
            return false;

    }

    //checkWin returns true if there was a win
    public boolean checkWin(){
        //check first row win
        if(positions[0] == positions[1] && positions[1] == positions[2] && positions[0] != ' ')
            return true;

        //check second row win
        else if(positions[3] == positions[4] && positions[4] == positions[5] && positions[3] != ' ')
            return true;

        //check third row win
        else if(positions[6] == positions[7] && positions[7] == positions[8] && positions[6] != ' ')
            return true;

        //check first column win
        else if(positions[0] == positions[3] && positions[3] == positions[6] && positions[0] != ' ')
            return true;

        //check second column win
        else if(positions[1] == positions[4] && positions[4] == positions[7] && positions[1] != ' ')
            return true;

        //check third column win
        else if(positions[2] == positions[5] && positions[5] == positions[8] && positions[2] != ' ')
            return true;

        //check top left to bottom right diagonal win
        else if(positions[0] == positions[4] && positions[4] == positions[8] && positions[0] != ' ')
            return true;

        //check top right to bottom left diagonal win
        else if(positions[2] == positions[4] && positions[4] == positions[6] && positions[2] != ' ')
            return true;

        else
            return false;
    }
}
