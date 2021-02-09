import java.io.*;
public class Bricks{
    public static void populate(){
        int position= 0;
        int i = 0;
        Rectangle brick[] = new Rectangle[10];
        while(i<10){
            position += 105;
            brick[i] = new Rectangle(position,100,100,20, "Red");
            //game.addRectangle(brick[i]);
            i++;
        }
    }
}