package states;

import launcher.Handler;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

import graphics.Assets;
import java.awt.Color;
import java.awt.Font;

public class GameOverr extends State {

    public GameOverr(Handler handler) {
        super(handler);
    }

    public void tick(){
      if(handler.getKeyManager().keyJustPressed(KeyEvent.VK_SPACE)){
        handler.getGame().menuState.switched();
        State.setState(handler.getGame().menuState);
      }
    }

    public void render(Graphics g){
        g.drawImage(Assets.bgAfterGame, 0, 0, 640, 480, null);
        g.drawImage(Assets.die_text, 120, 80, 256, 80, null);
        g.drawImage(Assets.player_die, 430, 360, 70, 70, null);
        g.drawImage(Assets.monster_right[3], 340, 350,  70, 70, null);
        g.drawImage(Assets.monster_down[3], 540, 350,  70, 70, null);

        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.PLAIN, 15));
        g.drawString("Press space bar to continue", 185, 170);
    }
    
    public void switched(){}
}
