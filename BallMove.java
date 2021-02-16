import java.io.*;
public class BallMove{
    int hightcheck = 0;
    int x = 500;
    int widthcheck = 0;
    int i = 0;
    public void move(Ball ball, boolean hit){
        ball.setYPosition(i);
        ball.setXPosition(x);
        if (hit == true){
            hightcheck = 1;
            System.out.println("Hit");
        }
        if (widthcheck == 0){
            x+=5;
        }
        if (widthcheck==1){
            x-=5;
        }
        if (hightcheck == 0){
            i+=5;
        }
        if (hightcheck == 1){
            i-=5;
        }
        if (i>1000){
            hightcheck = 1;
        }
        if (i<=1){
            hightcheck=0;
        }
        if (x>1000){
            widthcheck = 1;
        }
        if (x<=1){
            widthcheck =0;
        }
    }
}