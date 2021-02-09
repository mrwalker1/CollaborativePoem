import java.io.*;
public class Screen{
    public static void main(String[] args){
        int i = 1;
        int j = 0;
        int populate = 0;
        int playerPosition = 500;
        int x = 500;
        int xj = 0;
        int position= 0;
        GameArena game = new GameArena(1000,1000);
        Ball ball = new Ball(0,0,15,"BLUE",1);
        Rectangle player = new Rectangle(500,950,200,30, "Blue");
        Rectangle brick[] = new Rectangle[10];
        game.addBall(ball);
        game.addRectangle(player);
        while(populate<10){
            position += 105;
            brick[populate] = new Rectangle(position,100,100,20, "Red");
            game.addRectangle(brick[populate]);
            populate++;
        }
        while(i>0){
            
            if(game.leftPressed()==true){
                playerPosition -= 5;
            }
            if(game.rightPressed()==true){
                playerPosition += 5;
            }
            player.setXPosition(playerPosition);
            ball.setYPosition(i);
            ball.setXPosition(x);
            if (xj == 0){
                x+=5;
            }
            if (xj==1){
                x-=5;
            }
            if (j == 0){
                i+=5;
            }
            if (j == 1){
                i-=5;
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
            game.pause();
        }
    }
}