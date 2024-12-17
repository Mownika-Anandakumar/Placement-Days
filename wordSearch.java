import java.util.*;
class Solution {
    public boolean backtrack(int i,int j,int depth,String targetWord,char[][] grid) {
        if(depth==targetWord.length()){
            return true;
        }
        if(grid[i][j]!=targetWord.charAt(depth)){
            return false;
        }
        char c=grid[i][j];
        grid[i][j]='#';
        if(j>0 && backtrack(i,j-1,depth+1,targetWord,grid)) return true;
        if(i>0 && backtrack(i-1,j,depth+1,targetWord,grid)) return true;
        if(i< grid.length-1 && backtrack(i+1,j,depth+1,targetWord,grid)) return true;
        if(j<grid[0].length-1 && backtrack(i,j+1,depth+1,targetWord,grid))return true;
    grid[i][j]=c;
    return false;
    }
   
    public boolean findWord(char grid[][],String targetWord){
        for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
        if(backtrack(i,j,0,targetWord,grid)) return true;
    }
}
return false;
}
}

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();
        char grid[][] = new char[rows][cols];
       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = input.next().charAt(0);
            }
        }
        input.nextLine();  
        String targetWord = input.nextLine();
       
        Solution solver = new Solution();
        boolean result = solver.findWord(grid, targetWord);
       
        if (result) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        input.close();
    }
}

