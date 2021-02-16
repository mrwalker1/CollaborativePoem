import java.io.*;
public class Collition{
    public boolean check(Ball ball, Rectangle bat){
        double player = bat.getXPosition();
        double ballx = ball.getXPosition();
        double bally = ball.getYPosition();
        if (bally>= 950 & bally<=980){
            if (ballx<=(player+200) & ballx>=(player)){
                return true;
            }
        }
        return false;
    }
}