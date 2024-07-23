package lap2;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int SIZE = 5;
        int[][] grid = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
               grid[i][j] = i * SIZE + j + 1;
            }
        }

		
		//print 1
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if(grid[j][i] > 5 && grid[j][i] < 10)
					System.out.print(" ");
				System.out.print(grid[j][i] + " ");
			}
			System.out.println("");
		}
		
		//print 2
				for (int i_2 = 0; i_2 < SIZE; i_2++) {
					for (int j_2 = 0; j_2 < SIZE; j_2++) {
					    if(grid[i_2][j_2] < 10)
				        	System.out.print(" ");
						System.out.print(grid[i_2][j_2] + " ");
					}
					System.out.println(" ");
					i_2++;
					for (int l = 4 ; l >= 0; l--) {
					    if(grid[i_2][l] < 10)
				        	System.out.print(" ");
						System.out.print(grid[i_2][l] + " ");
					}
					System.out.println("");
				}
	}

}
