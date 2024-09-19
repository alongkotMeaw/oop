package Mine_Sweeper;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static Mine_Sweeper.MineSweeperConstants.ROWS;
import static Mine_Sweeper.MineSweeperConstants.COLS;
import static Mine_Sweeper.MineSweeperConstants.mind_num;;
public class GameBoardPanel extends JPanel {
	private static final long serialVersionUID = 1L; // to prevent serial warning

	// Define named constants for UI sizes
	public static final int CELL_SIZE = 60; // Cell width and height, in pixels
	public static final int CANVAS_WIDTH = CELL_SIZE * COLS; // Game board width/height
	public static final int CANVAS_HEIGHT = CELL_SIZE * ROWS;

	// Define properties (package-visible)
	/** The game board composes of ROWSxCOLS cells */
	Cell cells[][] = new Cell[ROWS][COLS];
	/** Number of mines */
	int numMines = 10;

	/** Constructor */
	public GameBoardPanel() {
		MineSweeperConstants.mind_num = MineSweeperConstants.ROWS*MineSweeperConstants.COLS / 10; //mine 1/100
		super.setLayout(new GridLayout(ROWS, COLS, 2, 2)); // JPanel

		// Allocate the 2D array of Cell, and added into content-pane.
		for (int row = 0; row < ROWS; ++row) {
			for (int col = 0; col < COLS; ++col) {
				cells[row][col] = new Cell(row, col);
				super.add(cells[row][col]);
			}
		}

		// [TODO 3] Allocate a common listener as the MouseEvent listener for all the
		// Cells (JButtons)

		// .........
		// Allocate a common listener for all cells

		CellMouseListener listener = new CellMouseListener();
		for (int row = 0; row < ROWS; ++row) {
			for (int col = 0; col < COLS; ++col) {
				cells[row][col].addMouseListener(listener);
			}
		}

		// [TODO 4] Every cell adds this common listener

		// .........

		// Set the size of the content-pane and pack all the components
		// under this container.
		super.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));
	}

	private class CellMouseListener extends MouseAdapter {
		

		public void mouseClicked(MouseEvent e) {
			Cell sourceCell = (Cell) e.getSource();
			System.out.println("You clicked on (" + sourceCell.row + "," + sourceCell.col + ")");
			if (e.getButton() == MouseEvent.BUTTON1) {
				if (sourceCell.isFlagged == false) {
					if (sourceCell.isMined == true) {
						newGame();
						System.out.println("game over");
					} else {
						sourceCell.board.getSurroundingMines(sourceCell.row, sourceCell.col);
						sourceCell.setText("" + getSurroundingMines(sourceCell.row, sourceCell.col));
						sourceCell.setBackground(sourceCell.BG_REVEALED);
						revealCell(sourceCell.row, sourceCell.col);
						if(hasWon()) { // check win
							System.out.println("you win");
						}
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
	
	///button
	

	// Initialize and re-initialize a new game
	public void newGame() {
		// Get a new mine map
		MineMap mineMap = new MineMap();
		mineMap.newMineMap(mind_num);

		// Reset cells, mines, and flags
		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLS; col++) {
				// Initialize each cell with/without mine
				cells[row][col].board = this;
				cells[row][col].newGame(mineMap.isMined[row][col]);

			}
		}
	}

	// Return the number of mines [0, 8] in the 8 neighboring cells
	// of the given cell at (srcRow, srcCol).
	public int getSurroundingMines(int srcRow, int srcCol) {
		int numMines = 0;
		for (int row = srcRow - 1; row <= srcRow + 1; row++) {
			for (int col = srcCol - 1; col <= srcCol + 1; col++) {
				// Need to ensure valid row and column numbers too
				if (row >= 0 && row < ROWS && col >= 0 && col < COLS) {
					if (cells[row][col].isMined)
						numMines++;
				}
			}
		}
		return numMines;
	}

	// Reveal the cell at (srcRow, srcCol)
	// If this cell has 0 mines, reveal the 8 neighboring cells recursively
	private void revealCell(int srcRow, int srcCol) {
		int numMines = getSurroundingMines(srcRow, srcCol);
		cells[srcRow][srcCol].setText(numMines + "");
		cells[srcRow][srcCol].isRevealed = true;
		cells[srcRow][srcCol].paint(); // based on isRevealed
		if (numMines == 0) {
			// Recursively reveal the 8 neighboring cells
			for (int row = srcRow - 1; row <= srcRow + 1; row++) {
				for (int col = srcCol - 1; col <= srcCol + 1; col++) {
					// Need to ensure valid row and column numbers too
					if (row >= 0 && row < ROWS && col >= 0 && col < COLS) {
						if (!cells[row][col].isRevealed)
							revealCell(row, col);
					}
				}
			}
		}
	}

	// Return true if the player has won (all cells have been revealed or were
	// mined)  /// mind  = row / 
	public boolean hasWon() {
		boolean check = true;
		int num  = 0;
		for (int row = 0; row < ROWS; row++) {
			for (int col = 0; col < COLS; col++) {
				if (!cells[row][col].isMined && !cells[row][col].isRevealed) {
	                return false;
	            }
			}
		}
		return true;
		
		
	}

	// [TODO 2] Define a Listener Inner Class
	// .........
}