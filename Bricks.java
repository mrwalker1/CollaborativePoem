import java.io.*;
public class Brick{
    int position= 0;
    int populate = 0;
    public static void 
    Rectangle brick[] = new Rectangle[10];
    while(populate<11){
        position += 105;
        brick[populate] = new Rectangle(position,100,100,20, "Red");
        game.addRectangle(brick[populate]);
        populate++;
    }
}