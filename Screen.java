import java.io.*;
public class Screen{
    public static void main(String[] args){
        int i = 1;
        GameArena game = new GameArena(1000,1000);
        Ball ball = new Ball(0,0,15,"BLUE",1);
        Rectangle player = new Rectangle(500,950,200,30, "Blue");
        Player bat = new Player();
        BallMove ballmove = new BallMove();
        game.addBall(ball);
        game.addRectangle(player);
        //Brick.populate(game);
        while(i>0){
            bat.move(game,player);
            ballmove.move(ball);
            game.pause();
        }
    }
}