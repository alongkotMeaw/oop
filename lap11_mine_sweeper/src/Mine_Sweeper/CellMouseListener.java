package Mine_Sweeper;

import java.awt.event.MouseAdapter;

import org.w3c.dom.events.MouseEvent;

// [TODO 2] Define a Listener Inner Class
private class CellMouseListener extends MouseAdapter {
    @Override
    public void mouseClicked(MouseEvent e) { // Get the source object that fired the Event
        Cell sourceCell = (Cell) e.getSource();
        // For debugging
        System.out.println("You clicked on (" + sourceCell.row + "," + sourceCell.col + ")");

        // Left-click to reveal a cell; Right-click to plant/remove the flag.
        if (e.getButton() == MouseEvent.BUTTON1) { // Left-button clicked
            // [TODO 5] (later, after TODO 3 and 4
            // if you hit a mine, game over
            // else reveal this cell
            // if (sourceCell.isMined) {
            // System.out.println("Game Over");
            // sourceCell.setText("*");
            // } else {
            // revealCell(sourceCell.row, sourceCell.col);
            // }
        } else if (e.getButton() == MouseEvent.BUTTON3) { // right-button clicked
            // [TODO 6]
            // If this cell is flagged, remove the flag
            // else plant a flag.
            // ......
        }

        // [TODO 7] Check if the player has won, after revealing this cell
        // ......
    }
}