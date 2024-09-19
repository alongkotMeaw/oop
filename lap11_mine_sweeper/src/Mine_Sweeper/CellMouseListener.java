package Mine_Sweeper;

public class CellMouseListener {
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
