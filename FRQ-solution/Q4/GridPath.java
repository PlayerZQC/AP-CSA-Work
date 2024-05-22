import java.util.Arrays;

public class GridPath {
  private int[][] grid;

  public GridPath(int[][] grid) {
    this.grid = grid;
  }

  // PART A (uncomment first)
  public Location getNextLoc(int row, int col) {

    Location r = new Location(row, col+1);
    Location c = new Location(row+1, col);
    if(row == grid.length-1){ 
      return r;
    }
    else if (col == grid[0].length-1){
      return c;
    }
    else if (grid[row][col+1]>grid[row+1][col]){
      return c;
    }
    return r;
  }

  
  // PART B
  public int sumPath(int row, int col) {
    int s = grid[row][col];
    Location n = getNextLoc(row,col);
    while(n.getRow() < grid.length&&n.getCol() < grid[0].length){
      s+=grid[n.getRow()][n.getCol()];
      n = getNextLoc(n.getRow(),n.getCol());
      
    }
    return s;
  }

  // added to see the array on screen 
  public String toString() {
    return Arrays.deepToString(grid);
  }
  
}
