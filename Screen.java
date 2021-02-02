import java.io.*;
public class Screen{
    public static void main(String[] args){
        int i = 1;
        int j = 0;
        int playerPosition = 500;
        int x = 500;
        int xj = 0;
        GameArena game = new GameArena(1000,1000);
        Ball ball = new Ball(0,0,15,"BLUE",1);
        Rectangle player = new Rectangle(500,950,200,30, "Blue");
        while(i>0){
            if(game.leftPressed()==true){
                playerPosition += 10;
            }
            if(game.leftPressed()==true){
                playerPosition -= 10;
            }
            player.setXPosition(playerPosition);
            ball.setYPosition(i);
            ball.setXPosition(x);
            game.addBall(ball);
            game.addRectangle(player);
            if (xj == 0){
                x++;
            }
            if (xj==1){
                x--;
            }
            if (j == 0){
                i++;
            }
            if (j == 1){
                i--;
            }
            if (i>1000){
                j = 1;
            }
            if (i<=1){
                j=0;
            }
            if (x>1000){
                xj = 1;
            }
            if (x<=1){
                xj=0;
            }
        }
    }
}