public class Board {
    
   public static final int ROWS = 3;
   public static final int COLS = 3;
    
   String [][] table = new String[3][3];
   
   public String player; 
   
   
   
   public Board(){
       
    }
   
   public void createGame() 
   {
    for (int i = 0; i < ROWS; i++)
        for (int p=0; p < COLS ; p++)
            table [i][p]= " ";
    }
    
   
    public String changePlayer (String player){
    String newTurn = " ";
    if (player.equals( "O"))
    {
        newTurn = "X";
    }
    else if (player.equals("X"))
    {
        newTurn= "O";
    }
   
    return newTurn;
    
}

   public boolean checkLegal(int row, int column) 
{
     if( (row > 2 || column > 2) || (row < 0 || column < 0) )
     {
         return true;
        }
        else if(table[row][column].equals("x") || table[row][column].equals("o"))
        {
        return true;
    }
        else{
        return false;
    }
}

   
   public boolean checkWinner() {
    if( table [0][0]== table[1][0] && table[0][0] == table[2][0] && (table [0][0]=="X" || table [0][0]=="O"))
                return true;
    else if( table [0][1]==table[1][1]&& table[0][1] == table[2][1] && (table [0][1]=="X" || table [0][1]=="O"))
                return true;
    else if( table [0][2]==table[1][2] && table [0][2] == table[2][2] && (table [0][1]=="X" || table [0][1]=="O"))
                return true;
    else if( table [0][0]==table[0][1] && table[0][0] == table[0][2] && (table [0][1]=="X" || table [0][1]=="O"))
                return true;
    else if( table [1][0]==table[1][1] && table[1][0] == table[1][2] && (table [0][1]=="X" || table [0][1]=="O"))
                return true; 
    else if( table [2][0]==table[2][1] && table[2][0] == table[2][2] && (table [0][1]=="X" || table [0][1]=="O"))
                return true;
    else if( table [0][0]==table[1][1] && table[0][0] == table[2][2] && (table [0][1]=="X" || table [0][1]=="O"))
                return true;
    else if( table [0][2]==table[1][1] && table[0][2]== table[2][0] && (table [0][1]=="X" || table [0][1]=="O"))
                return true;
    else
                return false;
 
   }
   
   
   public boolean checkTie() {
    for (int i = 0; i < 3; i++)
        for (int p=0; p < 3; p++)
            if(table [i][p].equals(" "))
            {
                return false;
            }

    return true;
}
   
   
   public void changeBoard(String player, int row, int column)
{
    table[row][column] = player;

}
   
public void displayBoard() 
   {
    
    for (int i = 0; i < 1; i++)
        System.out.println("    |     | ");
        for (int p=0; p < 1 ; p++)
            System.out.println ( "---------------- ");
          
   }
   
public void createBoard(){
         for (int i = 0; i < 3; i++)
            System.out.println("");
        
        displayBoard();
        displayBoard();
        System.out.println("    |     | ");
            
        
    }
}
  

  
