import java.io.*;
public class Player{
    int playerPosition = 500;
    public void move(GameArena game, Rectangle player){
        if(game.leftPressed()==true){
            playerPosition -= 5;
        }
        if(game.rightPressed()==true){
            playerPosition += 5;
        }
        player.setXPosition(playerPosition);
    }
}