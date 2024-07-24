import java.util.Scanner;
public class MainFile
{
    public static void main (String [] args)
    {
        boolean s = false;
        Scanner keyboard = new Scanner (System.in);

        MazeGame mazeGame = new MazeGame();

        System.out.println("---Maze---");

        mazeGame.draw();

        while (s == false)
        {
            if (mazeGame.won() == true)
            {
                System.out.println("Congratulations you solved the maze in " + mazeGame.getMoveCount() + " moves!");
                s = true;
            }

            System.out.print("\nEnter direction (w - up, s - down, a - left, d - right): ");
            char direction = keyboard.next().charAt(0);

            if (mazeGame.move(direction) == true)
            {
                mazeGame.draw();
            }
            else
            {
                mazeGame.draw();
                System.out.println("Invalid input");
            }
        }



    }
}
