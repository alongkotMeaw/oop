package Mine_Sweeper;

import static Mine_Sweeper.MineSweeperConstants.ROWS;
import static Mine_Sweeper.MineSweeperConstants.COLS;
import java.util.Random;
/**
 * Define the locations of mines
 */
public class MineMap {
	
    // package access
    int numMines;
    boolean[][] isMined = new boolean[ROWS][COLS];
    // default is false

    // Constructor
    public MineMap() {
        super();
    }

    // Allow user to change the rows and cols
    public void newMineMap(int numMines) {
        this.numMines = numMines;
        Random rand = new Random();
        int a[] = new int[numMines];
        for(int i = 0;i < numMines;i++) {
        	for(int j = 0;j < i;j++) {
        		a[i] = rand.nextInt(ROWS);
        	}
        }
        for(int i = 0;i < numMines;i++) {
        	isMined[a[i]][rand.nextInt(COLS)] = true;
        }
     
    }
}