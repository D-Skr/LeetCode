package arrays;

public class Q200NumberOfIslands {
	//200. Number of Islands

    public static int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        
        for( int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++){
                if(grid[i][j] == '1'){
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(char[][] grid, int r, int c){
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0') return;
        
        grid[r][c] = '0';
        dfs(grid, r-1, c); // North
        dfs(grid, r+1, c); // South
        dfs(grid, r, c-1); // West
        dfs(grid, r, c+1); // East
    }
	public static void main(String[] args) {
		char[][] grid1 = {
				{'1','1','0','0','0'},
				{'1','1','0','0','0'},
				{'0','0','1','0','0'},
				{'0','0','0','1','1'}
		};
		char[][] grid2 = {
				{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'1','0','0','0','0'}
		};
		char[][] grid3 = {
				{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'1','0','0','1','1'}
		};
		System.out.println(numIslands(grid1)); //3
		System.out.println(numIslands(grid2)); //1
		System.out.println(numIslands(grid3)); //2

	}

}
