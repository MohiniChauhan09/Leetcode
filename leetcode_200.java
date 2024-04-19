// T.C: O(n)
// S.C: O(1)
class Solution {
    void dfs(char grid[][], int m, int n, int i, int j){
        if(i<0 || i>=m || j<0 || j>=n || grid[i][j]=='0'){
            return;
        }

        //already visited
        if(grid[i][j] == '$'){
            return;
        }

        //mark visited
        grid[i][j] = '$';

        dfs(grid, m, n, i-1, j);
        dfs(grid, m, n, i+1, j);
        dfs(grid, m, n, i, j-1);
        dfs(grid, m, n, i, j+1);
    }
    public int numIslands(char[][] grid) {
        int islands=0;
        int m =grid.length;
        int n =grid[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if( grid[i][j] == '1' ){
                    dfs(grid, m, n, i, j);
                    islands++; 
                }
            }
        }
        return islands;
        
    }
}
