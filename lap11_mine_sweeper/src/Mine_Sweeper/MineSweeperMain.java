package Mine_Sweeper;

import java.awt.*; // Use AWT's Layout Manager
import java.awt.event.*;
import java.util.Scanner;

import javax.swing.*; // Use Swing's Containers and Components

/**
 * The Mine Sweeper Game.
 * Left-click to reveal a cell.
 * Right-click to plant/remove a flag for marking a suspected mine.
 * You win if all the cells not containing mines are revealed.
 * You lose if you reveal a cell containing a mine.
 */
public class MineSweeperMain extends JFrame {
    private static final long serialVersionUID = 1L; // to prevent serial warning
   
    // private variables
    GameBoardPanel board = new GameBoardPanel();
    JButton btnNewGame = new JButton("New Game");

    // Constructor to set up all the UI and game components
    public MineSweeperMain() {
        Container cp = this.getContentPane(); // JFrame's content-pane
        cp.setLayout(new BorderLayout()); // in 10x10 GridLayout

        cp.add(board, BorderLayout.CENTER);
        cp.add(btnNewGame, BorderLayout.SOUTH);
        // Add btnNewGame to the south to re-start the game
        // ......
        board.newGame();

        pack(); // Pack the UI components, instead of setSize()
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // handle window-close button
        setTitle("Minesweeper");
        setVisible(true); // show it
    }

    // The entry main() method
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		int row,col;
		System.out.print("Enter row: ");
		//MineSweeperConstants.ROWS = sc.nextInt();
		System.out.print("Enter coloum: ");
		//MineSweeperConstants.COLS = sc.nextInt();
		sc.close();
		
    	new MineSweeperMain();
    }
    
    
    public class CellMouseListener extends MouseAdapter {

    	public void mouseClicked(MouseEvent e) {
    		Cell sourceCell = (Cell) e.getSource();
    		System.out.println("You clicked on (" + sourceCell.row + "," + sourceCell.col + ")");
    		if (e.getButton() == MouseEvent.BUTTON1) {
    			if (sourceCell.isFlagged == false) {
    				if(sourceCell.isMined == true) {
    					sourceCell.newGame(true);
    					System.out.println("game over");
    				}
    				else {
    					sourceCell.board.getSurroundingMines(sourceCell.row,sourceCell.col);
    					sourceCell.setText("" + sourceCell.has_mine_near);
    					sourceCell.setBackground(sourceCell.BG_REVEALED);
    				}

    			}

    		} else if (e.getButton() == MouseEvent.BUTTON3) {
    			System.out.println("left");
    			if (sourceCell.isFlagged == true) {
    				sourceCell.isFlagged = false;
    				sourceCell.setText("");
    				sourceCell.setBackground(sourceCell.BG_NOT_REVEALED);
    			} else {
    				sourceCell.isFlagged = true;
    				sourceCell.setText("-");
    				sourceCell.setBackground(sourceCell.FG_REVEALED);
    			}
    		}
    	}

    }
}