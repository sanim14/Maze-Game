public class MazeGame
{
    private char [][] maze = {{'W', 'W', 'W', 'W', 'W'},
            {'S', '-', '-', '-', 'W'},
            {'W', 'W', 'W', '-', 'W'},
            {'W', '-', 'W', '-', 'W'},
            {'E', '-', 'W', '-', '-'},
            {'W', '-', '-', '-', 'W'}};
    private int playerColumn;
    private int playerRow;
    private int moveCount;

    public MazeGame ()
    {
        playerRow = 1;
        playerColumn = 0;
    }

    public boolean won ()
    {
        if (playerRow == 4 && playerColumn == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public int getMoveCount()
    {
        return moveCount;
    }

    public boolean move(char direction)
    {
       if (direction == 's')
        {
            if ((playerRow + 1) >= maze.length || maze[playerRow+1][playerColumn] == 'W')
            {
                return false;
            }
            else
            {
                playerRow++;
                moveCount++;
                return true;
            }
        }
        else  if (direction == 'w')
        {
            if ((playerRow - 1) < 0 || maze[playerRow-1][playerColumn] == 'W')
            {
                return false;
            }
            else
            {
                playerRow--;
                moveCount++;
                return true;
            }
        }
        else if (direction == 'a')
        {
            if ((playerColumn - 1) < 0 || maze[playerRow][playerColumn - 1] == 'W')
            {
                return false;
            }
            else
            {
                playerColumn--;
                moveCount++;
                return true;
            }
        }
        else if (direction == 'd')
        {
            if ((playerColumn + 1) >= maze[0].length || maze[playerRow][playerColumn + 1] == 'W')
            {
                return false;
            }
            else
            {
                playerColumn++;
                moveCount++;
                return true;
            }
        }
        else
        {
            return false;
        }
    }

    public void draw()
    {

        for(int r = 0; r < maze.length; r++)
        {
            for(int c = 0; c < maze[0].length; c++)
            {
                if(r==playerRow && c==playerColumn)
                    System.out.print("X");
                else
                    System.out.print(maze[r][c]);
            }

            System.out.print("\n");
        }
    }
}
