import java.io.*;
public class Bricks{


public void populate(GameArena game){    

    Rectangle[] black = new Rectangle[10];
    Rectangle[] blue = new Rectangle[10];
    Rectangle[] green = new Rectangle[10];
    Rectangle[] red = new Rectangle[10];
    Rectangle[] orange = new Rectangle[10];
    Rectangle[] yellow = new Rectangle [10];
    Rectangle[] pink = new Rectangle[10];
    Rectangle[] white = new Rectangle[10];

int i = 0; 
int position = 75;

for(i = 0; i<10; i++){
black[i] = new Rectangle(position,50,80,20,"GREY");
game.addRectangle(black[i]);
blue[i] = new Rectangle(position,75,80,20,"BLUE");
game.addRectangle(blue[i]);
green[i] = new Rectangle(position,100,80,20,"GREEN");
game.addRectangle(green[i]);
red[i] = new Rectangle(position,125,80,20,"RED");
game.addRectangle(red[i]);
orange[i] = new Rectangle(position,150,80,20,"ORANGE");
game.addRectangle(orange[i]);
yellow[i] = new Rectangle(position,175,80,20,"YELLOW");
game.addRectangle(yellow[i]);
pink[i] = new Rectangle(position,200,80,20,"PINK");
game.addRectangle(pink[i]);
white[i] = new Rectangle(position,225,80,20,"WHITE");
game.addRectangle(white[i]);
position = position + 85;
    }      
}

}