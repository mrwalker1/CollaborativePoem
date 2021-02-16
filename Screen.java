import java.io.*;
public class Screen{
    public static void main(String[] args){
        int i = 1;
        boolean hit = false;
        GameArena game = new GameArena(1000,1000);
        Ball ball = new Ball(0,0,15,"BLUE",1);
        Rectangle player = new Rectangle(500,950,200,30, "Blue");
<<<<<<< HEAD
       
=======
        Player bat = new Player();
        BallMove ballmove = new BallMove();
        Collition collition = new Collition();
>>>>>>> refs/remotes/origin/main
        game.addBall(ball);
        game.addRectangle(player);

        Bricks Blocks = new Bricks();
        Blocks.populate(game);
   
        while(i>0){
            hit = false;
            hit = collition.check(ball, player);
            bat.move(game,player);
            ballmove.move(ball, hit);
            game.pause();
        }
    }
}