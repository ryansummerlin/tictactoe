  import java.util.Scanner;

    public class Main {

public static void main(String[] args) {
        String player= "o";
        int row,column;
        Scanner k =  new Scanner (System.in);
        Board b = new Board ();

        b.createGame();
        b.createBoard();
        System.out.println("Game ready !\n");

while(true)
{   
player = b.changePlayer(player);
System.out.print("\n"+player +" ,choose your location (row, column):");
row=k.nextInt();
column=k.nextInt();

    while (b.checkLegal(row,column))
    {
    System.out.println("That slot is already taken or out of bounds, please try again (row, column).");
    b.displayBoard();
    row=k.nextInt();
    column=k.nextInt();
    }
b.changeBoard(player,row,column );
b.displayBoard();

if(b.checkWinner())
    {
    System.out.println("\nThe winner is "+ player+" !");
    break;

    }
if(b.checkTie())
    {
        System.out.println("\nThe game is a tie !");
        break;
    }
}


    }

    }