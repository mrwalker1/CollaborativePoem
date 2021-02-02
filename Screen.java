import java.io.*;
public class Screen{
    public static void main(String[] args){
        int i = 1;
        int j = 0;
        int x = 50;
        int xj = 0;
        GameArena game = new GameArena(1000,1000);
        Ball first = new Ball(500,0,50,"BLUE",1);
        while(i>0){
            first.setYPosition(i);
            first.setXPosition(x);
            game.addBall(first);
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