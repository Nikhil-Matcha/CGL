
public class Game {
	public Board nextGeneration(Board b) {
		Board newBoard = new Board(b.rows, b.columns);
		for(int i=0; i<b.rows; i++) {
			for(int j=0; j<b.columns; j++) {
				if(b.grid[i][j].isAlive) {
					if(b.getAliveNeighbours(b.grid[i][j])==2 || b.getAliveNeighbours(b.grid[i][j])==3) {
						newBoard.grid[i][j].isAlive = true;
					}
				}else {
					if(b.getAliveNeighbours(b.grid[i][j])==3){
						newBoard.grid[i][j].isAlive = true;
					}
				}
			}
		}
		return newBoard;
	}
}
