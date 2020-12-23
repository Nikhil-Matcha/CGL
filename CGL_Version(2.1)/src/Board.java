import java.math.*;

public class Board {
	public int rows;
	public int columns;
	public int[][] grid;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.grid = new int[rows][columns];
	}
	
	public int getAliveNeighbours(Cell c) {
		int count = 0;
        int row_limit = this.rows-1;
        if(row_limit > 0){
            int column_limit = this.columns-1;
            for(int i = Math.max(0, c.x-1); i <= Math.min(c.x+1, row_limit); i++){
                for(int j = Math.max(0, c.y-1); j <= Math.min(c.y+1, column_limit); j++){
                    if(i != c.x || j != c.y){
                        count += this.grid[i][j];
                    }
                }
            }
        }
        return count;
	}
	
	public void createBoard(int l[][]) {
		for(int i=0; i<l.length; i++){
            this.grid[l[i][0]][l[i][1]] = 1;
        }
	}
	
	public String toString() {
		String res = "";
		for(int i=0; i<this.rows; i++){
            int col = this.columns;
            for(int j=0; j<col; j++){
                if(this.grid[i][j]==0){
                    // System.out.print(".");
                    res += ".";
                }else{
                    // System.out.print("*");
                    res += "*";
                }
                // if(j!=col-1){
                //     System.out.print(" ");
                // }
            }
            // System.out.println();
            res += "\n";
        }
		return res;
	}
}
