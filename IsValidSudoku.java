//Question 36 named Valid Sudoku

class IsValidSudoku
{
    public static boolean main(char[][] board){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j] == '.'){
                    continue;
                }
                //int val = Character.getNumericValue(board[i][j]);
                for(int k=0; k<9; k++){
                    if(board[i][k] == board[i][j] && k!=j){
                        return false;
                    }
                    else if(board[k][j] == board[i][j] && k!=i){
                        return false;
                    }
                }
                int ix = (i/3)*3;
                int jx = (j/3)*3;
                for(int k = ix; k < ix+3; k++){
                    for(int l = jx; l < jx+3; l++){
                        if(board[k][l] == board[i][j] && k!=i && l!=j){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}